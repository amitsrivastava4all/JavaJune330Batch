import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField useridTxt;
	private JPasswordField passwordField;
	private GameMainMenuScreen mainScreenObject;

	
	public LoginScreen(GameMainMenuScreen mainScreenObject) {
		this.mainScreenObject = mainScreenObject;
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserid.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblUserid.setBounds(29, 35, 67, 16);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblPassword.setBounds(16, 80, 93, 16);
		contentPane.add(lblPassword);
		
		useridTxt = new JTextField();
		useridTxt.setBounds(130, 31, 200, 26);
		contentPane.add(useridTxt);
		useridTxt.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 76, 200, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLogin();
			}
		});
		btnLogin.setIcon(new ImageIcon(LoginScreen.class.getResource("/com/images/login.png")));
		btnLogin.setBounds(45, 114, 117, 53);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setIcon(new ImageIcon(LoginScreen.class.getResource("/com/images/exit.png")));
		btnReset.setBounds(173, 114, 117, 53);
		contentPane.add(btnReset);
	}
	private void checkLogin(){
		String userid = useridTxt.getText();
		String password = passwordField.getText();
		if(userid.equals(password)){
			//int ch= JOptionPane.showConfirmDialog(this, "Welcome "+userid,"Login",JOptionPane.YES_NO_OPTION);
			JOptionPane.showMessageDialog(this, "Welcome "+userid);
			mainScreenObject.setTitle("Welcome "+userid);
			mainScreenObject.prepareTitle();
			mainScreenObject.doTitleAnimation();
			//if(ch==JOptionPane.YES_OPTION){
			GameMainMenuScreen.mnGames.setEnabled(true);
			this.setVisible(false);
			this.dispose();
			
			//}
		}
		else{
			JOptionPane.showMessageDialog(this, "Invalid Userid or Password");
		}
	}
	
}
