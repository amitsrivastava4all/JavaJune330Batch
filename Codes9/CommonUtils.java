import java.util.Random;

public interface CommonUtils extends GameConstants {
	
	
	
	public static void getRandomBalls(Ball balls[]) {
		
		
		Random r = new Random();
		
		for(int i = 0 ; i<balls.length; i++){
			balls[i] = new Ball(r.nextInt(GAME_WIDTH-50)
					,r.nextInt(GAME_HEIGHT-50),r.nextInt(10),r.nextInt(200));
			
			
		}
		
		

	}

}
