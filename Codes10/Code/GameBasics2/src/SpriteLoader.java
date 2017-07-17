import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class SpriteLoader {
	BufferedImage img;
	public SpriteLoader(){
		try{
		img = ImageIO.read(SpriteLoader.class.getResource("bison.png"));
		}
		catch(Exception e){
			System.out.println("Can't Load the Player Sprite Image");
		}
	}
	
	public BufferedImage[] powerSprite(){
		BufferedImage arr[] = new BufferedImage[5];
		arr[0] = img.getSubimage(184, 435, 39, 88);
		arr[1] = img.getSubimage(0, 162, 117, 34);
		arr[2] = img.getSubimage(0, 198, 112, 37);
		arr[3] = img.getSubimage(0, 237, 115, 33);
		arr[4] = img.getSubimage(116, 212, 59, 66);
		return arr;
		
	}
	
public BufferedImage[] moves(){
	
	BufferedImage arr[] = new BufferedImage[4];
	arr[0] = img.getSubimage(70, 1, 69, 77);
	arr[1] = img.getSubimage(140, 1, 54, 81);
	arr[2] = img.getSubimage(0, 78, 86, 76);
	arr[3] = img.getSubimage(86, 83, 92, 79);
	
	
	return arr;
	}

}
