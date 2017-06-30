import jaco.mp3.player.MP3Player;

public class PlaySong {
	
	public static void  songPlay(){
		MP3Player mp3 = new MP3Player(PlaySong.class.getResource("pop.mp3"));
		mp3.play();
	}

}
