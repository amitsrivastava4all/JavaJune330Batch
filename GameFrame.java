import javax.swing.JFrame;

public class GameFrame extends JFrame implements  GameConstants {
	
	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle(TITLE);
		setResizable(false);
		Board board = new Board();
		add(board);
		//setLocation(100, 200);
		
	}

	public static void main(String[] args) {
		GameFrame obj = new GameFrame();

	}

}
