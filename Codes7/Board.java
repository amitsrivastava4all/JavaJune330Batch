import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements  GameConstants{
	Ball balls[] =new Ball[MAX_BALL];
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		 CommonUtils.getRandomBalls(balls);
		gameLoop();
	}
	private void gameLoop(){
		Timer timer = new Timer(DELAY,(e)->{
			repaint();
			for(Ball ball : balls){
			ball.moveBall();
			ball.changeBallDirection();
			}
		});
		timer.start();
		
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Ball ball:balls){
		ball.drawBall(g);
		}
	}
}
