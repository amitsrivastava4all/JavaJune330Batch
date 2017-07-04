package com.bmp.games.dave;

import java.awt.Graphics2D;

import javax.swing.ImageIcon;

public class Player extends Sprite {
	
	
	public Player(){
		x = 50;
		h = w = 100;
		y = FLOOR - (h-20) ;
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	final int GRAVITY = 1;
	int acc;
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
