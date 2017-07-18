import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class IDM extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JLabel pathlbl = new JLabel("");
	JLabel output = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDM frame = new IDM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IDM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 422, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDownloadLocation = new JButton("Download Location");
		btnDownloadLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			chooseDownloadLocation();
			}
		});
		btnDownloadLocation.setBounds(0, 41, 201, 29);
		contentPane.add(btnDownloadLocation);
		
		JButton btnDownloadNow = new JButton("Download Now");
		btnDownloadNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doDownload();
			}
		});
		btnDownloadNow.setBounds(236, 41, 164, 29);
		contentPane.add(btnDownloadNow);
		
		JLabel lblPreview = new JLabel("Preview");
		lblPreview.setBounds(6, 132, 61, 16);
		contentPane.add(lblPreview);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		scrollPane.setBounds(16, 160, 452, 359);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(output);
		
		
		pathlbl.setBounds(45, 82, 330, 16);
		contentPane.add(pathlbl);
	}
	private String getFileName(String url){
		int index = url.lastIndexOf("/");
		return url.substring(index);
	}
	private void doDownload(){
		String url = textField.getText();
		String fileName = getFileName(url);
		String path  = pathlbl.getText().trim()+fileName;
		String message = "";
		try {
			message = WebSiteDownloader.download(url, path);
			JOptionPane.showMessageDialog(this, message);
			File file = new File(path);
			ImageIcon ic = new ImageIcon(file.toURL());
			output.setIcon(ic);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Can't Download some Problem Occur");
		}
	}
	
	private void chooseDownloadLocation(){
		//d:\\
		System.out.println(File.pathSeparator +" "+File.separator);
		JFileChooser fileChooser = new JFileChooser("/Users/amit/Documents");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.showOpenDialog(this);
		pathlbl.setText(fileChooser.getSelectedFile().getPath());
	}
}
