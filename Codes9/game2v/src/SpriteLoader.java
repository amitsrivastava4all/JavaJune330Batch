import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class SpriteLoader {
	BufferedImage img;
	public SpriteLoader(){
		try{
		img = ImageIO.read(SpriteLoader.class.getResource("playersprite.png"));
		}
		catch(Exception e){
			System.out.println("Can't Load the Player Sprite Image");
		}
	}
	
	public BufferedImage[] powerSprite(){
		BufferedImage arr[] = new BufferedImage[4];
		arr[0] = img.getSubimage(28, 331, 43, 84);
		arr[1] = img.getSubimage(100, 321, 36, 91);
		arr[2] = img.getSubimage(160, 333, 35, 56);
		arr[3] = img.getSubimage(218, 326, 35, 85);
		return arr;
		
	}
	
public BufferedImage[] moves(){
	
	BufferedImage arr[] = new BufferedImage[5];
	arr[0] = img.getSubimage(19, 464, 53, 38);
	arr[1] = img.getSubimage(101, 440, 35, 56);
	arr[2] = img.getSubimage(165, 454, 53, 38);
	arr[3] = img.getSubimage(311, 436, 45, 53);
	arr[4] = img.getSubimage(456, 20, 54, 81);
	
	return arr;
	}

}
