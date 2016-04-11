package Race2D;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Гонки");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 700);
		f.add(new Road());
		f.setVisible(true);
	}

}
