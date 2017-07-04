package com.srivastava.games.board;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteImageLoader {
	
	BufferedImage bi ;
	int gap;
	int x;
	int y;
	int w;
	int h;
	public SpriteImageLoader(String imageName, int gap, int x, int y, int w, int h)  {
		try {
			bi = ImageIO.read(SpriteImageLoader.class.getResource(imageName));
			this.gap = gap;
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Image getImage(int pos){
		int imageWidth = this.w;
		int imageHeight = this.h;
		int gap = this.gap ;
		int x =this.x;
		int y = this.y;
		
		
		x = pos == 1?x =8 : ((pos - 1) * imageWidth + gap * (pos - 1)) ;
		System.out.println("X "+x);
		//int endX = pos * imageWidth + gap * (pos - 1) ; 
		return bi.getSubimage(x , y, imageWidth, imageHeight);
	}

}
