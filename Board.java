import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements  GameConstants{

	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}
	
	private void gameLoop(){
		
		Timer timer = new Timer(DELAY,(e)->{
			repaint();
			moveBall();
			changeBallDirection();
		});
		timer.start();
		
	}
	
	private void changeBallDirection(){
		if(x>=(GAME_WIDTH-50)){
			xSpeed = -10;
		}
		else
		if(x<=0){	
			xSpeed = 10;
		}
		if(y>=(GAME_HEIGHT-50)){
			ySpeed = -10;
		}
		else
		if(y<=0){	
			ySpeed = 10;
		}
	}
	
	private void moveBall(){
		x =  x + xSpeed;
		y = y +ySpeed;
	}
	int ySpeed = 10;
	int xSpeed = 10;
	int x = 10;
	int y = 100;
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 50, 50);
	}
}
