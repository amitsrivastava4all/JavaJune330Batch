import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class NotePadDemo extends JFrame {
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					NotePadDemo frame = new NotePadDemo();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public NotePadDemo() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				newFileOpen(true);
			}
		});
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				scrollPane.setSize(NotePadDemo.this.getWidth()-70, NotePadDemo.this.getHeight()-50);
				textArea.setSize(NotePadDemo.this.getWidth()-70, NotePadDemo.this.getHeight()-50);
			}
		});
		setTitle("NotePad-2017");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(450,300);
		setLocationRelativeTo(null);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		scrollPane.setBounds(6, 25, 438, 247);
		contentPane.add(scrollPane);
		
		
		textArea.setBounds(6, 35, 423, 237);
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenuItem newMenu = new JMenuItem("New");
		newMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			newFileOpen(false);
			}
		});
		newMenu.setIcon(new ImageIcon(NotePadDemo.class.getResource("new.png")));
		file.add(newMenu);
		KeyStroke ctrlN = KeyStroke.getKeyStroke(KeyEvent.VK_N, 
				Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());

        //set the accelerator
        newMenu.setAccelerator(ctrlN);
		JMenuItem openMenu = new JMenuItem("Open");
		file.addSeparator();
		openMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openOption();
			}
		});
		KeyStroke ctrlO = KeyStroke.getKeyStroke(KeyEvent.VK_O, 
				Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
		openMenu.setAccelerator(ctrlO);
		openMenu.setIcon(new ImageIcon(NotePadDemo.class.getResource("open.png")));
		file.add(openMenu);
		JMenuItem saveMenu = new JMenuItem("Save");
		saveMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveOption();
			}
		});
		file.add(saveMenu);
		JMenuItem printMenu = new JMenuItem("Print");
		printMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printOption();
			}
		});
		file.add(printMenu);
		JMenuItem exitMenu = new JMenuItem("Exit");
		file.add(exitMenu);
		//contentPane.add(menuBar);
		//contentPane.add(textArea);
	}
	
	private void newFileOpen(boolean isExit){
		if(textArea.getText().length()>0){
		int choice= JOptionPane.showConfirmDialog(this, "DO U Really want to save this Data "
				,"Notepad",JOptionPane.YES_NO_CANCEL_OPTION);
		if(choice == JOptionPane.YES_OPTION){
			JFileChooser save = new JFileChooser();
			save.showSaveDialog(this);
		}
		else
		if(choice == JOptionPane.NO_OPTION ){
			if(isExit){
				this.setVisible(false);
				this.dispose();
			}
			else{
			textArea.setText("");
			}
		}
		else
		if(choice == JOptionPane.CANCEL_OPTION){
			return ;
		}
		
		}
		
	}
	
	private void printOption(){
		PrinterJob job = PrinterJob.getPrinterJob();
		boolean doPrint = job.printDialog();
		if (doPrint) {
		    try {
		        job.print();
		    } catch (PrinterException e) {
		        // The job did not successfully
		        // complete
		    }
		}
	}
	
	private void saveOption(){
		JFileChooser open = new JFileChooser();
		open.showSaveDialog(this);
		// Data 
		String data = textArea.getText();
		File file = open.getSelectedFile();
		String path = file.getPath();
		System.out.println("Path is "+path);
		System.out.println("Data is "+data);
		FileOperations.writeFile(path, data);
}
	private void openOption(){
			JFileChooser open = new JFileChooser();
			open.showOpenDialog(this);
			String path = open.getSelectedFile().getPath();
			String data = FileOperations.readFile(path);
			textArea.setText(data);
	}
	
}
