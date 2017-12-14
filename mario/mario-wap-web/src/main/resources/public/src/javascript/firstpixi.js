/** step1. test the PIXI**/
//let type = "WebGL";
//if(!PIXI.utils.isWebGLSupported()){
//	type="canvas";
//}
//PIXI.utils.sayHello(type);



/** step2. create pixi application and stage.**/
//let app = new PIXI.Application({width:256,height:256});
//document.body.appendChild(app.view);
//PIXI.loader.add("/res/3g/images/cat.png")
//	.on("progress", loadProgressHandler)
//	.load(setup);
//
//function setup(){
//	let cat = new PIXI.Sprite(
//			PIXI.loader.resources["/res/3g/images/cat.png"].texture);
//	cat.x=96;
//	cat.y=96;
////	cat.width=100;
////	cat.height=150;	
////	cat.scale.set(0.9,0.9);
////	cat.rotation = 0.5;
//	cat.pivot.set(32, 32)
//	app.stage.addChild(cat);
//}
//
//function loadProgressHandler(loader, resource){
//	console.log("loading:"+resource.url);
//	console.log("progress:"+loader.progress+"%");
//}


/** setp3. make sprite from tileset sub-image **/
//let Application = PIXI.Application,
//	loader = PIXI.loader,
//	resources = PIXI.loader.resources,
//	TextureCache = PIXI.utils.TextureCache,
//	Sprite = PIXI.Sprite,
//	Rectangle = PIXI.Rectangle;
//
//let app = new Application({
//	width : 512,
//	heigth : 512,
//	antialias : true,
//	transparent:false,
//	resolution:1
//});
//
//document.body.appendChild(app.view);
//loader.add("/res/3g/images/treasureHunter.json").load(setup);
//let dungeon,explorer,treasure,door,id;
//let state;
//
//function setup(){
//	let dungeonTexture = TextureCache["dungeon.png"];
//	dungeon = new Sprite(dungeonTexture);
//	app.stage.addChild(dungeon);
//	
//	explorer = new Sprite(resources["/res/3g/images/treasureHunter.json"].textures["explorer.png"]);
//	explorer.x=68;
//	explorer.y=app.stage.height/2 - explorer.height/2;
//	app.stage.addChild(explorer);
//	
//	id = resources["/res/3g/images/treasureHunter.json"].textures;
//	
//	treasure = new Sprite(id["treasure.png"]);
//	treasure.x = app.stage.width - treasure.width -48;
//	treasure.y = app.stage.height/2 -treasure.height/2;
//	app.stage.addChild(treasure);
//	
//	door = new Sprite(id["door.png"]);
//	door.position.set(32,0);
//	app.stage.addChild(door);
//	
//	let numberOfBlobs = 6, spacing=48, xOffset=150;
//	for(let i=0; i<numberOfBlobs; i++){
//		let blob = new Sprite(id["blob.png"]);
//		let x = spacing * i + xOffset;
//		let y = randomInt(0, app.stage.height-blob.height);
//		blob.position.set(x,y);
//		app.stage.addChild(blob);
//	}
//	
//	//draw a rectangle
//	let rectangle = new PIXI.Graphics();
//	rectangle.beginFill(0x66CCFF);
//	rectangle.lineStyle(4,0xFF3300,1);
//	rectangle.drawRect(0,0,64,64);
//	rectangle.endFill();
//	rectangle.x = 170;
//	rectangle.y = 170;
//	app.stage.addChild(rectangle);
//	
//	//set the game state.
//	state = play;
//	app.ticker.add(delta=>gameLoop(delta));
//}
//
//function gameLoop(delta){
//	state(delta);
//}
//
//function play(delta){
//	explorer.vx = randomInt(0,1);
//	explorer.x += explorer.vx;
//}
//
//function randomInt(min,max){
//	return Math.floor(Math.random()*(max - min +1))+min;
//}