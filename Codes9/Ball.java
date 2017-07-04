import java.awt.Color;
import java.awt.Graphics;

public class Ball implements GameConstants {
	
	private int x;
	private int y;
	private int w;
	private int h;
	private int xSpeed;
	private int ySpeed;
	private Color color;
	private  int ballSpeed ;
	
	Ball(int x, int y, int ballSpeed,int colorCode){
		this.x = x ;
		this.y = y;
		this.w = this.h = 50;
		this.ballSpeed = ballSpeed>0?ballSpeed:1;
		xSpeed = ySpeed = this.ballSpeed;
		this.color = new Color(colorCode+10, colorCode+50, colorCode+30);
	}
	
	public void moveBall(){
		x =  x + xSpeed;
		y = y +ySpeed;
	}
	
	
	public void changeBallDirection(){
		if(x>=(GAME_WIDTH-w)){
			xSpeed = -ballSpeed;
		}
		else
		if(x<=0){	
			xSpeed = ballSpeed;
		}
		if(y>=(GAME_HEIGHT-h)){
			ySpeed = -ballSpeed;
		}
		else
		if(y<=0){	
			ySpeed = ballSpeed;
		}
	}
	
	public void drawBall(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, w, h);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
