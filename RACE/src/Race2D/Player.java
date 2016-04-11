package Race2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	public static final int MAX_V = 50;
	public static final int MIN_V = 0;
	public static final int MAX_X = 400;
	public static final int MIN_X = 30;
	public static final int MAX_Y = 735;
	public static final int MIN_Y = 0;
	
	
	Image img = new ImageIcon(getClass().getClassLoader().getResource("res/player2.gif")).getImage();
	
	int v = 0;
	int dv;
	int s;
	int layer1 = 0;
	int layer2 = -735;
	private int width = 50;
	private int height = 100;
	
	int x = 200;
	int y = 500;
	int dx;
	int dy;
	
	public Rectangle getRect(){
		return new Rectangle(x,y,width,height);
	}
	
	public void move(){
		s+=v;
		v+=dv;
		x+=dx;
		y+=dy;
		if(v>=MAX_V)	v = MAX_V;
		if(v<=MIN_V)	v = MIN_V;
		if(x<=MIN_X)	x=MIN_X;
		if(x>=MAX_X)	x=MAX_X;
		
		if (layer1>=MAX_Y){
			layer1 = MIN_Y;
			layer2 = -MAX_Y;
		}
		else{
			layer1 += v;
			layer2 += v;
		}
	}
	public void paint(Graphics g){
		g = (Graphics2D) g ;
		g.drawImage(img, 0, 0, null);
		}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP)
			dv = 3;
		if(key == KeyEvent.VK_DOWN)
			dv = -3;
		if(key == KeyEvent.VK_LEFT)
			dx = -15;
		if(key == KeyEvent.VK_RIGHT)
			dx = 15;
		
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP||key == KeyEvent.VK_DOWN)
			dv = 0;
		if(key == KeyEvent.VK_LEFT||key == KeyEvent.VK_RIGHT)
			dx = 0;
	}
}
