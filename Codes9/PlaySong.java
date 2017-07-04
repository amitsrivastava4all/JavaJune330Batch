import java.io.File;

import jaco.mp3.player.MP3Player;

public class PlaySong {
	
	public static void  songPlay(){
		//File file = new File("/Users/amit/Documents/Java330RegBatch/GameBasics/src/pop.mp3");
		
		MP3Player mp3 = new MP3Player(PlaySong.class.getResource("pop.mp3"));
		mp3.play();
	}

}
