package com.bmp.games.dave;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		Board board = new Board();
		add(board);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		GameFrame obj = new GameFrame();

	}

}
