import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterScreen extends JFrame {

	private JPanel contentPane;
	private JTextField useridtxt;
	private JPasswordField passwordField;
	JLabel weakStronglbl = new JLabel("");
	int maxChars = 50;
	JTextArea textArea = new JTextArea();
	int leftChar = maxChars;
	JLabel leftChars = new JLabel(""+maxChars);
	JRadioButton rdbtnMale = new JRadioButton("Male");
	JRadioButton rdbtnFemale = new JRadioButton("Female");
	JComboBox comboBox = new JComboBox();
	
	public static void main(String[] args) {
		
					RegisterScreen frame = new RegisterScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public RegisterScreen() {
		setResizable(false);
		setTitle("Register Screen");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(50, 56, 61, 16);
		contentPane.add(lblUserid);
		
		useridtxt = new JTextField();
		useridtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					passwordField.requestFocus();
				}
			}
		});
		useridtxt.setBounds(123, 51, 217, 26);
		contentPane.add(useridtxt);
		useridtxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(50, 108, 61, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				weakStrongPasswordCheck();
			}
		});
		passwordField.setBounds(133, 103, 207, 26);
		contentPane.add(passwordField);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(50, 161, 61, 16);
		contentPane.add(lblGender);
		
		ButtonGroup bg = new ButtonGroup();
		
		rdbtnMale.setBounds(119, 157, 81, 23);
		bg.add(rdbtnMale);
		contentPane.add(rdbtnMale);
		
		
		bg.add(rdbtnFemale);
		rdbtnFemale.setBounds(212, 157, 98, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(50, 222, 61, 16);
		contentPane.add(lblCountry);
		
		
		comboBox.addItem("India");
		comboBox.addItem("Srilanka");
		comboBox.setBounds(148, 218, 162, 27);
		contentPane.add(comboBox);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(50, 279, 61, 16);
		contentPane.add(lblAddress);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doRegister();
			}
		});
		btnRegister.setBounds(45, 456, 117, 29);
		contentPane.add(btnRegister);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(182, 456, 117, 29);
		contentPane.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(133, 279, 270, 130);
		contentPane.add(scrollPane);
		
		
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				computeNoOfCharLeft();
			}
		});
		scrollPane.setViewportView(textArea);
		
		
		weakStronglbl.setBounds(352, 108, 81, 16);
		contentPane.add(weakStronglbl);
		
		JLabel lblNoOfChar = new JLabel("No of Char ");
		lblNoOfChar.setBounds(238, 421, 102, 16);
		contentPane.add(lblNoOfChar);
		
		
		leftChars.setBounds(316, 421, 61, 16);
		contentPane.add(leftChars);
	}
	
	private void computeNoOfCharLeft(){
		if(leftChar>0){
		 leftChar = maxChars - textArea.getText().length();
		 leftChars.setText(String.valueOf(leftChar));
		}
		if(leftChar==0){
			textArea.setEnabled(false);
		}
		
	}
	private void weakStrongPasswordCheck(){
		String data = passwordField.getText();
		if(data.length()<5){
			weakStronglbl.setText("Weak");
		}
		if(data.length()>=5 && data.length()<=10){
			weakStronglbl.setText("Average");
		}
		if(data.length()>10){
			weakStronglbl.setText("Strong");
		}
		
	}
	
	private void doRegister(){
		String userid = useridtxt.getText();
		String password = passwordField.getText();
		String gender ="";
		if(rdbtnMale.isSelected()){
			gender = "Male";
		}
		else
		if(rdbtnFemale.isSelected()){
			gender = "Female";
		}
		String country = (String)comboBox.getSelectedItem();
		String address = textArea.getText();
		
		User user = new User(userid, password, gender, address,country);
		try {
			boolean isRegister = UserOperations.registerUser(user);
			if(isRegister){
				JOptionPane.showMessageDialog(this, "U Register SuccessFully");
				this.setVisible(false);
				this.dispose();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "Can't Register Error in File Creation...");
			e.printStackTrace();
		}
	}
}
