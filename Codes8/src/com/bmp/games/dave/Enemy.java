package com.bmp.games.dave;

import java.awt.Graphics2D;
import java.awt.Image;



public class Enemy extends Sprite {
	public Enemy(int x , Image img){
		this.x = x;
		h = w = 100;
		y = 10;
		this.img = img;
	}
	
	public void drawEnemy(Graphics2D g){
		
		g.drawImage(img, x, y, w, h, null);
	}
}
