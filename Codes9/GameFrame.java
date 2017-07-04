import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameFrame extends JFrame implements  GameConstants {
	
	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setVisible(true);
		String result= JOptionPane.showInputDialog(this, "Enter the Range of Balls");
		int noOfBalls = Integer.parseInt(result);
		setLocationRelativeTo(null);
		setTitle(TITLE);
		setResizable(false);
		Board board = new Board(noOfBalls);
		add(board);
		PlaySong.songPlay();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(100, 200);
		
	}

	public static void main(String[] args) {
		GameFrame obj = new GameFrame();

	}

}
