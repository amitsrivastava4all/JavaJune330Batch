import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import jaco.mp3.player.MP3Player;

public class GameSplashScreen extends JWindow {
	private JLabel lblGame = new JLabel("GAME-2017");
	private JProgressBar progressBar = new JProgressBar();
	private boolean isVisible ;
	private JPanel contentPane;
	private int progressCounter;
	private Timer timer;
	private MP3Player mp3;
	private Logger logger = Logger.getLogger(GameSplashScreen.class);
	private void playSound(){
		logger.debug("Play Sound Call ");
		mp3 = new MP3Player(GameSplashScreen.class.getResource("pop.mp3"));
		mp3.play();
	}
	private void doAnimation(){
		logger.debug("Animation Call Start...");
		timer = new Timer(5,(e)->{
			progressBar.setValue(progressCounter);
			progressCounter++;
			if(progressCounter>100){
				timer.stop();
				mp3.stop();
				GameMainMenuScreen menu = new GameMainMenuScreen();
				menu.setVisible(true);
				GameSplashScreen.this.setVisible(false);
				GameSplashScreen.this.dispose();
			}
			lblGame.setVisible(isVisible);
			isVisible = !isVisible;
		});
		timer.start();
		logger.debug("Animation Call Ends...");
	}
	
	
	public static void main(String[] args) {
		
					GameSplashScreen frame = new GameSplashScreen();
					frame.setVisible(true);
					frame.playSound();
					frame.doAnimation();
				
	}

	/**
	 * Create the frame.
	 */
	public GameSplashScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		logger.debug("Game Splash Screen Constructor Call");
		setSize( 513, 407);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GameSplashScreen.class.getResource("/com/images/giphy.gif")));
		lblNewLabel.setBounds(6, 6, 501, 278);
		contentPane.add(lblNewLabel);
		
		
		lblGame.setForeground(Color.RED);
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setFont(new Font("Lucida Grande", Font.BOLD, 27));
		lblGame.setBounds(145, 338, 245, 41);
		contentPane.add(lblGame);
		
		
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		progressBar.setStringPainted(true);
		progressBar.setBounds(16, 296, 476, 20);
		contentPane.add(progressBar);
	}
}
