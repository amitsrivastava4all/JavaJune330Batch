package com.bmpl.testengine.quiz.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Test(String message) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTestStart = new JLabel("Test Start "+message);
		lblTestStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestStart.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblTestStart.setForeground(Color.RED);
		lblTestStart.setBackground(Color.ORANGE);
		lblTestStart.setBounds(74, 18, 385, 89);
		contentPane.add(lblTestStart);
	}

}
