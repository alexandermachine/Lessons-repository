package Race2D;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Road extends JPanel implements ActionListener, Runnable{
	Image img = new ImageIcon(getClass().getClassLoader().getResource("res/road.jpg")).getImage();

	Player p = new Player();	
	Timer mainTimer = new Timer(20,this);
	
	
	public Road(){
		mainTimer.start();
		addKeyListener(new MyKeyAdapter());
		setFocusable(true);
		botFactory.start();
		playSound.start();
	}
	Thread playSound = new Thread(new Sound());
	Thread botFactory = new Thread(this);
	List<Bot> bots = new ArrayList<Bot>();
	
	private class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			p.keyPressed(e);
		}
		public void keyReleased(KeyEvent e){
			p.keyReleased(e);
			
		}
	}
	
	public void paint(Graphics g){
		g = (Graphics2D) g ;	
		g.drawImage(img, 0, p.layer1, null);
		g.drawImage(img, 0, p.layer2, null);
		g.drawImage(p.img, p.x, p.y, null);
		double v = (200/Player.MAX_V)*p.v;
		g.setColor(Color.WHITE);
		Font font = new Font("Arial",Font.ITALIC,20);
		g.setFont(font);
		g.drawString("Скорость: " + v + " км/ч", 30, 30);
		Iterator<Bot> i = bots.iterator();
		while(i.hasNext()){
			Bot b = i.next();
			if(b.y>=1400||b.y<=-1400)
				i.remove();
			else{
				b.move();
				g.drawImage(b.img, b.x, b.y, null);
			}				
		}
	}
	public void actionPerformed(ActionEvent e){
		p.move();
		//botMove();
		repaint();
		testCrash();
		testWin();
	}
	
	private void testWin() {
		if (p.s>20000){
			JOptionPane.showMessageDialog(null, "Вы выиграли! УРА!!!");
			System.exit(0);
		}
	}

	//	private void botMove() {
//		Iterator<Bot> i = bots.iterator();
//		Bot b = i.next();
//		while(i.hasNext())
//				b.move();		
//	}
	private void testCrash() {
		Iterator<Bot> i = bots.iterator();
		while(i.hasNext()){
			Bot b = i.next();
			if(p.getRect().intersects(b.getRect())){
				JOptionPane.showMessageDialog(null, "Вы проиграли!!!!");
				System.exit(1);
			}
		}		
	}
	public void run() {
		while(true){
			Random r = new Random();
			try {
				Thread.sleep(r.nextInt(2000));
				bots.add(new Bot((r.nextInt(370)+30),-300,20,this));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
