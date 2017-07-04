package com.bmp.games.dave;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	Image background ;
	Player player ;
	Enemy enemies[] = new Enemy[MAX_ENEMY];
	private Timer timer;
	
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter() {
			
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Release "+e.getKeyCode()+" "+e.getKeyChar());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					player.setSpeed(10);
					player.move();
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_LEFT){	
					player.setSpeed(-10);
					player.move();
				}
				else
				if(e.getKeyCode() == KeyEvent.VK_SPACE){	
					player.jump();
				}
				
				// TODO Auto-generated method stub
				//System.out.println("Press "+e.getKeyCode()+" "+e.getKeyChar());
			}
		});
	}
	
	private boolean isCollision(Player player , Enemy enemy){
		int xDistance  = Math.abs(player.getX() - enemy.getX());
		int yDistance = Math.abs(player.getY()- enemy.getY());
		int width = Math.max(player.getW(), enemy.getW());
		int height = Math.max(player.getH(), enemy.getH());
		return xDistance<=(width-40) && yDistance<=(height-20);
	}
	
	private void gameOver(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.setColor(Color.RED);
		g.drawString("Game Over",GAME_WIDTH/2, GAME_HEIGHT/2);
	}
	private boolean isGameOver= false;
	private void checkCollision(){
		for(Enemy enemy:enemies){
			if(isCollision(player, enemy)){
				isGameOver = true;
				repaint();
				timer.stop();
			}
		}
	}
	
	private void gameLoop(){
		timer = new Timer(DELAY,(e)->{
			repaint();
			player.fall();
			checkCollision();
		});
		timer.start();
	}
	
	private void prepareEnemy(){
		int x = 200;
		Image img;
		int speed = 5;
		try{
		for(int i  = 0; i<enemies.length; i++){
			if(i%2 ==0){
				//img = ImageIO.read(Board.class.getResource("spider.gif"));
				img = new ImageIcon(Board.class.getResource("spider.gif")).getImage();
			}
			else
			{
				//img = ImageIO.read(Board.class.getResource("fire.gif"));
				img = new ImageIcon(Board.class.getResource("fire.gif")).getImage();
			}
			enemies[i]  = new Enemy(x, img,speed);
			x = x + 200;
			speed += 4;
		
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		background = new ImageIcon(Board.class.getResource(BACKGROUND)).getImage();
		player = new Player();
		prepareEnemy();
		setFocusable(true);
		bindEvents();
		gameLoop();
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
		if(isGameOver){
			gameOver(g);
		}
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
