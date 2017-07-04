package com.bmp.games.dave;

import java.awt.Graphics2D;
import java.awt.Image;



public class Enemy extends Sprite {
	public Enemy(int x , Image img, int speed){
		this.x = x;
		h = w = 100;
		y = 10;
		this.img = img;
		this.speed = speed;
	}
	
	
	public void move(){
		this.y +=speed;
	}
	public void changeDirection(){
		if(y>=(FLOOR-h)){
			speed = - speed;
		}
		else
		if(y<=0)	
		{
			speed = speed * -1;
		}
		
	}
	
	public void drawEnemy(Graphics2D g){
		
		g.drawImage(img, x, y, w, h, null);
		move();
		changeDirection();
	}
}
