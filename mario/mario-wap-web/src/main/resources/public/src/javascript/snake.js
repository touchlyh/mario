$(function(){
	SnakeGame.setContext($("#canvas").get(0).getContext("2d"));
	SnakeGame.setControlDiv($("#control").get(0));
	SnakeGame.setScoreDiv($("#score").get(0));
	SnakeGame.gameProcess();
	$(window).keydown(SnakeGame.keyDown);
});

var SnakeGame = function() {
		var context = null;
		var width = 300;
		var heigth = 400;
		var snakeLength = 3;
		var level = 1;
		var sqSize = 10;
		var bodyX = new Array(150,150-sqSize,150-2*sqSize);
		var bodyY = new Array(200,200,200);
		var vX = new Array(1,1,1);
		var vY = new Array(0,0,0);
		var rx = null;
		var rY = null;
		var score = 0;
		var scoreDiv = null;
		var eaten = true;
		var gameOver = false;
		var controlsDiv = null;
		var intervalId = null;
		
		var drawPoint = function(x,y){
			context.fillStyle = "#000";
			context.fillRect(x,y,sqSize, sqSize);
			context.fill();
			context.strokeStyle="#FFF";
			context.strokeRect(x,y,sqSize,sqSize);
		};
		var clear = function(){
			context.clearRect(0,0,width,heigth);
		};
		var setContext = function(cx){
			context = cx;
		};
		var setScoreDiv = function(div){
			return scoreDiv = div;
		};
		var setControlDiv = function(div){
			return controlDiv = div;
		};
		var drawCanvasBoundary = function() {
			context.fillStyle = "#FFF";
			context.fillRect(0,0,width, heigth);
			context.fill();
			context.strokeStyle="#000";
			context.strokeRect(0,0,width,heigth);
		};
		var drawSnake = function(){
			for(var i=0; i<snakeLength; i++){
				drawPoint(bodyX[i], bodyY[i]);
			}
		};
		var moveSnake = function(){
			for(var i=0; i<snakeLength; i++) {
				bodyX[i] = bodyX[i]+(vX[i]*sqSize);
				bodyY[i] = bodyY[i]+(vY[i]*sqSize)
			}
			for(var i=snakeLength-1; i>0; i--) {
				vX[i] = vX[i-1];
				vY[i] = vY[i-1];
			}
		};
		var keyDown =  function(e){
			if(e.keyCode == 65 && vX[0] != 1) {       //left arrow - Changed to 'a'
                vX[0] = -1;
                vY[0] = 0;
            }
            else if (e.keyCode == 87 && vY[0] != 1) {//up arrow - changed to 'w'
                vY[0] = -1;
                vX[0] = 0;
            }
            else if (e.keyCode == 68 && vX[0] != -1) {//right arrow - changed to 'd'
                vX[0] = 1;
                vY[0] = 0;
            }
            else if (e.keyCode == 83 && vY[0] != -1) {//down arrow - changed to 's'
                vY[0] = 1;
                vX[0] = 0;
            }
            else if (e.keyCode == 13 && gameOver == true){
                gameOver = false;
                restart();  // Lets hide it, we shall address at last what to do when game gets over.
            }
		};
		var gameProcess = function(){
			intervalId = setTimeout(gameProcess, 1000/(6*level)); 
			clear();
			drawCanvasBoundary();
			placeRat();
			checkCollision();
			moveSnake();
			eatRat();
			drawSnake();
		};
		var placeRat = function(){
			if(eaten){
				rX = Math.floor(width * Math.random()/sqSize)*sqSize;
				rY = Math.floor(heigth * Math.random()/sqSize)*sqSize;
				if(checkFoodCollision()){
					placeRat();
				} else {
					eaten = false;
				}
			}
			drawPoint(rX, rY);
		};
		
		var eatRat = function(){//在尾部添加方块
			if(bodyX[0] == rX && bodyY[0] == rY){
				eaten = true;
				var tailX = bodyX[snakeLength-1]-vX[snakeLength-1]*sqSize;
				var tailY = bodyY[snakeLength-1]-vY[snakeLength-1]*sqSize;
				bodyX.push(tailX);
				bodyY.push(tailY);
				vX.push(vX[snakeLength-1]);
				vY.push(vY[snakeLength-1]);
				snakeLength++;
				score+=10;
				if(score%100 ==0){
					level++;
				}
				scoreDiv.innerHTML = "Score: " +score+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Level: "+level;
			}
		};
		
		var checkCollision = function(){
			if(bodyX[0]>=width || bodyX[0]<0 || bodyY[0]>=heigth || bodyY[0]<0 || checkSelfCollision()){
				 scoreDiv.innerHTML  = "Score: " +score+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Level: "+level+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Game Over</b>";
				 controlDiv.innerHTML = "Press \"Enter\" to restart";
				 gameOver = true;
				 clearTimeout(intervalId);
			}
		};
		
		var checkFoodCollision = function(){
			for(var i=0; i<snakeLength; i++) {
				if(rX == bodyX[i] && rY == bodyY[i]){
					return true;
				}
			}
			return false;
		};
		
		var checkSelfCollision = function(){
			if(snakeLength < 4){
				return false;
			}
			for(var i = 3; i<snakeLength; i++){
				if(bodyX[0] == bodyX[i] && bodyY[0] == bodyY[i]){
					return true;
				}
			}
			return false;
		};
		
		var restart = function(){
			bodyX = new Array(150,150-sqSize,150-2*sqSize);
			bodyY = new Array(200,200,200);
			vX = new Array(1,1,1);
			vY = new Array(0,0,0);
			snakeLength = 3;
			score = 0;
			level = 1;
			eaten = true;
			scoreDiv.innerHTML = "Score: " +score+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Level: "+level;
			controlDiv.innerHTML = "Controls: W = Up; A = Left; S = Down; D = Right";
			intervalId = setTimeout(gameProcess, 1000/level);
		};
		
		return {
			setContext : setContext,
			setScoreDiv : setScoreDiv,
			setControlDiv : setControlDiv,
			drawCanvasBoundary : drawCanvasBoundary,
			drawSnake : drawSnake,
			gameProcess : gameProcess,
			keyDown : keyDown
		};
}();