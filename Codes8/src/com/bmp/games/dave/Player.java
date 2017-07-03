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
	
	public void drawPlayer(Graphics2D g){
		
		g.drawImage(img, x, y, w, h, null);
	}

	
	
}
