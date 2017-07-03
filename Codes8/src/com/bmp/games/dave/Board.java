package com.bmp.games.dave;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel implements GameConstants {
	Image background ;
	Player player ;
	Enemy enemies[] = new Enemy[MAX_ENEMY];
	private void prepareEnemy(){
		int x = 200;
		Image img;
		try{
		for(int i  = 0; i<enemies.length; i++){
			if(i%2 ==0){
				img = ImageIO.read(Board.class.getResource("spider.gif"));
				//img = new ImageIcon(Board.class.getResource("spider.gif")).getImage();
			}
			else
			{
				img = ImageIO.read(Board.class.getResource("fire.gif"));
				//img = new ImageIcon(Board.class.getResource("fire.gif")).getImage();
			}
			enemies[i]  = new Enemy(x, img);
			x = x + 200;
		
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setFocusable(true);
		background = new ImageIcon(Board.class.getResource(BACKGROUND)).getImage();
		player = new Player();
		prepareEnemy();
	}
	
	private void printEnemy(Graphics2D g){
		for(Enemy enemy: enemies){
			enemy.drawEnemy(g);
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twoD = (Graphics2D)g;
		printBg(twoD);
		player.drawPlayer(twoD);
		printEnemy(twoD);
		printScore(g);
	}
	int score = 0;
	private void printScore(Graphics g){
		g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,18));
		g.drawString("Score is "+score, GAME_WIDTH - 100, 30);
	}
	
	private void printBg(Graphics2D g){
		g.drawImage(background, 0, 0, GAME_WIDTH,GAME_HEIGHT,null);
	}

}
