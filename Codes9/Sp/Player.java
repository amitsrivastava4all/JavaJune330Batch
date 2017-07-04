package com.srivastava.games.board;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.srivastava.games.common.GameConstants;

public class Player extends Sprite {
	int ySpeed ;
	boolean isJump ;
	int imageCounter = 1;
	SpriteImageLoader loader = new SpriteImageLoader("playersprite.png",20,8,11,110,100);
	public Player(){
		y = GameConstants.FLOOR;
		x = 100;
		w = 110;
		h = 100;
		speed  = 1;
		
		//img = new ImageIcon(Player.class.getResource("mario.gif")).getImage();
	}
	public void drawPlayer(Graphics2D g){
		img = loader.getImage(imageCounter);
		if(imageCounter>=7){
			imageCounter = 1;
		}
		else{
			imageCounter ++;
		}
		System.out.println("Image "+imageCounter);
		
		g.drawImage(img, x,y,w,h,null);
	}
	
	public void jump(){
		if(!isJump){
		ySpeed = -25;
		y = y + ySpeed;
		isJump = true;
		}
	}
	public void fall(){
		if(y<=GameConstants.FLOOR){
		speed = 5;	
		ySpeed = ySpeed + GameConstants.GRAVITY;
		y = y + ySpeed;
		x =  x+ speed;
		}
		else
		if(y>=GameConstants.FLOOR){
			isJump = false;
			speed = 1;
		}
	}
	
}
