

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player extends Sprite {
	private ArrayList<Bullet> bulletList =  new ArrayList<>() ;
	
	
	
	public ArrayList<Bullet> getBulletList() {
		return bulletList;
	}
	public void setBulletList(ArrayList<Bullet> bulletList) {
		this.bulletList = bulletList;
	}
	public Player(){
		x = 50;
		h = w = 100;
		y = FLOOR - (h-20) ;
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	final int GRAVITY = 1;
	int acc;
	
	public void fire(){
		Bullet bullet = new Bullet(x+w/2,y+h/2);
		bulletList.add(bullet);
		
	
	}
	boolean isKick ;
	int index = 0;
	public void doKick(){
		isKick = true;
		currentMove = 1;
		index = 0;
	}
	int currentMove ;
	SpriteLoader sl = new SpriteLoader();
	BufferedImage arrofkicks[] = sl.powerSprite();
	BufferedImage arrofMoves[] = sl.moves();
	public void moves(Graphics g){
			if(currentMove ==0){
			 g.drawImage(arrofMoves[index], x, y, w,h,null);
			 index++;
			}
		 
		 if(index>4){
			 currentMove = 0;
			 index = 0;
		 }
	}
	
	public void kick(Graphics g){
		 if(currentMove==1){
			 g.drawImage(arrofkicks[index], x, y, w,h,null);
			 index++;
		 }
		 if(index>3){
			currentMove = 0;
			 index = 0;
		 }
	}
	
	private boolean isJump = false;
	public void jump(){
		if(!isJump){
		acc= -25;
		y = y + acc;
		isJump = true;
		}
		
	}
	public void fall(){
		if(y<FLOOR - (h-20)){
		acc =  acc + GRAVITY;
		y = y + acc;
		}
		if(y>=FLOOR - (h-20)){
			isJump =false;
		}
	}
	
	public void move(){
		x += speed;
	}
	
	public void drawPlayer(Graphics2D g){
		
		g.drawImage(img, x, y, w, h, null);
	}

	
	
}
