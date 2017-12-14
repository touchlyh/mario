let Application = PIXI.Application;
let loader = PIXI.loader;
let resources = PIXI.loader.resources;
let Sprite = PIXI.Sprite;
let Rectangle = PIXI.Rectangle;

//define the charactor
let dungeon,explorer,treasure,door;
let blobs = new Array();
//define the play state
let state;
let gameScene;
let endScene;
let healthBar;
let message;
let wall = {x: 28, y: 10, width: 488, height: 480};

let numberOfBlobs = 8,
spacing = 48,
xOffset = 80,
speed = 3;
direction = 1;

let explorerHit = false;

let app = new Application({
	width : 512,
	heigth : 512,
	antialias : true,
	transparent:false,
	resolution:1
});
document.body.appendChild(app.view);
loader.add("/res/3g/images/treasureHunter.json").load(setup);

function setup(){
	//Create the `gameScene` group
	gameScene = new PIXI.Container();
	endScene = new PIXI.Container();
	gameScene.visible = true;
	endScene.visible = false;
	app.stage.addChild(gameScene);
	app.stage.addChild(endScene);
	
	//Create the `door` sprite
	//Create the `player` sprite
	//Create the `treasure` sprite
	let id = resources["/res/3g/images/treasureHunter.json"].textures;
	dungeon = new Sprite(id["dungeon.png"]);
	gameScene.addChild(dungeon);
	
	door = new Sprite(id["door.png"]);
	door.position.set(48,0);
	gameScene.addChild(door);
	
	treasure = new Sprite(id["treasure.png"]);
	treasure.x = app.stage.width-treasure.width-48;
	treasure.y = app.stage.height/2 - treasure.height/2;
	gameScene.addChild(treasure);
	
	explorer = new Sprite(id["explorer.png"]);
	explorer.x = 40;
	explorer.y = app.stage.height / 2 - explorer.height/2;
	explorer.vx=0;
	explorer.vy=0;
	gameScene.addChild(explorer);
	
	 //Make the enemies
	for(let i=0; i<numberOfBlobs; i++) {
		let blob = new Sprite(id["blob.png"]);
		let x = spacing * i + xOffset;
		let y = randomInt(0,app.stage.height - blob.height);
		blob.position.set(x,y);
		blob.vy = randomInt(1,speed) * direction;
		direction *= -1;
		blobs.push(blob);
		gameScene.addChild(blob);
	}
	
	//Create the health bar
	healthBar = new PIXI.DisplayObjectContainer();
	healthBar.position.set(app.stage.width-170, 4);
	gameScene.addChild(healthBar);
	let innerBar = new PIXI.Graphics();
	innerBar.beginFill(0x000000);
	innerBar.drawRect(0,0,128,10);
	innerBar.endFill();
	healthBar.addChild(innerBar);
	let outerBar = new PIXI.Graphics();
	outerBar.beginFill(0xFF3300);
	outerBar.drawRect(0,0,128,10);
	outerBar.endFill();
	healthBar.addChild(outerBar);
	
	healthBar.outer = outerBar;
	
	//Add some text for the game over message
	let style = new PIXI.TextStyle({
		fontFamily: "Futura",
	    fontSize: 64,
	    fill: "white"
	});
	message = new PIXI.Text("The End!",style);
	message.x=120;
	message.y=app.stage.height/2;
	endScene.addChild(message);
	
	//Assign the player's keyboard controllers
	let left = keyboard(65),up=keyboard(87),right=keyboard(68),down=keyboard(83);
	left.press = ()=>{
		explorer.vx =-1;
	};
	left.release = ()=>{
		if(!right.isDown){
			explorer.vx = 0;
		}
	};
	right.press = ()=>{
		explorer.vx =1;
	};
	right.release = ()=>{
		if(!left.isDown){
			explorer.vx = 0;
		}
	};
	up.press = ()=>{
		explorer.vy =-1;
	};
	up.release = ()=>{
		if(!down.isDown){
			explorer.vy = 0;
		}
	};
	down.press = ()=>{
		explorer.vy =1;
	};
	down.release = ()=>{
		if(!up.isDown){
			explorer.vy = 0;
		}
	};
	//set the game state to `play`
	state = play;
	app.ticker.add(delta=>gameLoop(delta));
};

function play(delta){
	let explorerHitWall = beInWall(explorer, wall);
	if(explorerHitWall==="top" || explorerHitWall==="bottom"){
		explorer.vy = 0
	}
	if(explorerHitWall==="left" || explorerHitWall==="right"){
		explorer.vx = 0
	}
	explorer.x += explorer.vx;
	explorer.y += explorer.vy;
	
	blobs.forEach(function(blob){
		blob.y += blob.vy;
		let blobHitWall = beInWall(blob,wall);
		if(blobHitWall==="top" || blobHitWall==="bottom"){
			blob.vy = -1*randomInt(1,speed)*(blob.vy/Math.abs(blob.vy));
		}
		if(hitTestRectangle(explorer,blob)){
			explorerHit = true;
		}
	});
	
	if(explorerHit){
		explorer.alpha = 0.3;
		healthBar.outer.width -=2;
	} else{
		explorer.alpha = 1;
	}
	explorerHit = false;
	
	if(hitTestRectangle(explorer,treasure)){
		treasure.x = explorer.x + 8;
		treasure.y = explorer.y + 8;
	}
	
	if (hitTestRectangle(treasure, door)) {
		  state = end;
		  message.text = "You won!";
	}
	
	if(healthBar.outer.width<=0){
		state=end;
		message.text="You Lost!"
	}
};

function gameLoop(delta){
	state(delta);
};

function end(){
	explorer.alpha = 1;
	explorer.vx=explorer.vy=0;
	gameScene.visible=true;
	endScene.visible=true;
};

function randomInt(min,max){
	return Math.floor(Math.random()*(max-min+1))+min;
};

function beInWall(sprite, wall){
	let collision = undefined;
	if(sprite.x < wall.x){
		sprite.x = wall.x;
		collision = "left";
	}
	if(sprite.x + sprite.width > wall.width){
		sprite.x = wall.width-sprite.width;
		collision = "right";
	}
	if(sprite.y < wall.y){
		sprite.y = wall.y;
		collision = "top";
	}
	if(sprite.y + sprite.height > wall.height){
		sprite.y = wall.height-sprite.height;
		collision = "bottom";
	}
	return collision;
};

function keyboard(keyCode){
	let key = {};
	key.code = keyCode;
	key.isDown = false;
	key.isUp = true;
	key.press = undefined;
	key.release = undefined;
	key.downHandler = event=>{
		if(event.keyCode===key.code){
			if(key.isUp && key.press){
				key.press();
			}
			key.isDown = true;
			key.isUp = false;
		}
		event.preventDefault();
	};
	key.upHandler = event =>{
		if (event.keyCode === key.code) {
		      if (key.isDown && key.release){
		    	  key.release();
		      }
		      key.isDown = false;
		      key.isUp = true;
		    }
		    event.preventDefault();
	};
	window.addEventListener("keydown", key.downHandler.bind(key), false);
	window.addEventListener("keyup", key.upHandler.bind(key), false);
	return key;
};

function hitTestRectangle(r1, r2) {

	  // Define the variables we'll need to calculate
	  let hit, combinedHalfWidths, combinedHalfHeights, vx, vy;

	  // hit will determine whether there's a collision
	  hit = false;

	  // Find the center points of each sprite
	  r1.centerX = r1.x + r1.width / 2;
	  r1.centerY = r1.y + r1.height / 2;
	  r2.centerX = r2.x + r2.width / 2;
	  r2.centerY = r2.y + r2.height / 2;

	  // Find the half-widths and half-heights of each sprite
	  r1.halfWidth = r1.width / 2;
	  r1.halfHeight = r1.height / 2;
	  r2.halfWidth = r2.width / 2;
	  r2.halfHeight = r2.height / 2;

	  // Calculate the distance vector between the sprites
	  vx = r1.centerX - r2.centerX;
	  vy = r1.centerY - r2.centerY;

	  // Figure out the combined half-widths and half-heights
	  combinedHalfWidths = r1.halfWidth + r2.halfWidth;
	  combinedHalfHeights = r1.halfHeight + r2.halfHeight;

	  // Check for a collision on the x axis
	  if (Math.abs(vx) < combinedHalfWidths) {

	    // A collision might be occuring. Check for a collision on the y axis
	    if (Math.abs(vy) < combinedHalfHeights) {

	      // There's definitely a collision happening
	      hit = true;
	    } else {

	      // There's no collision on the y axis
	      hit = false;
	    }
	  } else {

	    // There's no collision on the x axis
	    hit = false;
	  }

	  // `hit` will be either `true` or `false`
	  return hit;
	};