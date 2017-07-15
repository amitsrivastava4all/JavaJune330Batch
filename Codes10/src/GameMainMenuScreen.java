import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class GameMainMenuScreen extends JFrame {

	private JPanel contentPane;
	public static JMenu mnGames = new JMenu("Games");
	private boolean isTitlePresent ;
	private String title ="                               ";
	private Timer timer ; 
	StringBuffer sb = new StringBuffer();
	JMenuItem mntmRegister = new JMenuItem("Register");
	public void prepareTitle(){
		if(this.getTitle().trim().length()>0 && !isTitlePresent){
			title += this.getTitle();
			isTitlePresent = true;
			this.setTitle(title);
			sb.append(title);
		}
	}
	public void doTitleAnimation(){
		timer = new Timer(100,(e)->{
			if(isTitlePresent){
				char singleChar = sb.charAt(0);
				sb.append(singleChar);
				sb.deleteCharAt(0);
				//System.out.println("["+sb+"]");
				this.setTitle(sb.toString());
			}
		});
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public GameMainMenuScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openLogin();
			}
		});
		mntmLogin.setIcon(new ImageIcon(GameMainMenuScreen.class.getResource("/com/images/login.png")));
		mnFile.add(mntmLogin);
		
		
		mntmRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openRegister();
			}
		});
		mntmRegister.setIcon(new ImageIcon(GameMainMenuScreen.class.getResource("/com/images/register.png")));
		mnFile.add(mntmRegister);
		
		
		mnGames.setEnabled(false);
		mnGames.setIcon(new ImageIcon(GameMainMenuScreen.class.getResource("/com/images/game.png")));
		mnFile.add(mnGames);
		
		JMenuItem mntmMario = new JMenuItem("Mario");
		mnGames.add(mntmMario);
		
		JMenuItem mntmDave = new JMenuItem("Dave");
		mntmDave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startDaveGame();
			}
		});
		mnGames.add(mntmDave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(GameMainMenuScreen.class.getResource("/com/images/exit.png")));
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		isAlreadyRegister();
	}
	
	private void isAlreadyRegister(){
		String path = "/Users/amit/Documents/FileOutput/users.dat";
		File file = new File(path);
		if(file.exists()){
			mntmRegister.setVisible(false);
		}
		
	}
	private void openLogin(){
		LoginScreen login = new LoginScreen(this);
		login.setVisible(true);
	}
	private void startDaveGame(){
		GameFrame dave = new GameFrame();
		
	}
	
	private void openRegister(){
		RegisterScreen rs = new RegisterScreen();
		rs.setVisible(true);
	}

}
