package Race2D;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Bot {
	int x;
	int y;
	int v;
	private int width = 50;
	private int height = 100;
	Image img = new ImageIcon(getClass().getClassLoader().getResource("res/bot.gif")).getImage();
	Road road;
	
	public Bot(int x, int y, int v, Road road){
		this.x = x;
		this.y = y;
		this.v = v;
		this.road = road;		
	}
	public Rectangle getRect(){
		return new Rectangle(x,y,50,100);
	}
	
	public void move(){
		y = y + road.p.v -v;
	}

}
