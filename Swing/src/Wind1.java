

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Wind1 extends JFrame implements Runnable{
//	static Thread t = new Thread(this,"йц");
	static JProgressBar progressBar = new JProgressBar();
	
	static JLabel l1= new JLabel();
	static JLabel l3= new JLabel();
	static JButton b1 = new JButton("СТОП");
	static JButton b2 = new JButton("ПУСК");
	static boolean stop = false;
	static int i=0;
	static JFrame frame = new JFrame("Новое окно");
	
	
	public void creatWind() {
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//********Менеджер граничного размещения "FlowLayout" и "BoxLayout"********//
		JPanel panel = new JPanel();
		panel.setLayout(null);		
		
		//progressBar.setIndeterminate(true);
		progressBar.setSize(150,10);
		progressBar.setLocation(0, 100);
		progressBar.setStringPainted(true);
		progressBar.setMaximum(100);
		progressBar.setMinimum(0);
		

		b1.setFocusPainted(false);
		b1.setSize(100,30);
		b1.setLocation(0,0);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i=i-5;	
				progressBar.setValue(i);
			}
		});
		
		b2.setFocusPainted(false);
		b2.setSize(100,30);
		b2.setLocation(105,0);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i=i+5;
				progressBar.setValue(i);
			}
		});	
		//i++;	
		
		l1.setSize(100,30);
		l1.setLocation(0,70);
		l1.setText(Integer.toString(frame.getHeight())+" : "+Integer.toString(frame.getWidth()));
		l3.setSize(100,30);
		l3.setLocation(0,110);		
		l3.setText(Integer.toString(i));
		panel.add(b1);
		panel.add(b2);
		panel.add(l3);
		panel.add(l1);
		panel.add(progressBar);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		//*************************************************************************//
frame.setSize(221, 221);
//t.start();
frame.setVisible(true);
	}
	

	public void run() {
		System.out.println("Поток запущен");
			while(!stop){
				//JFrame.setDefaultLookAndFeelDecorated(true);
				//CreatWind();
				
				this.getContentPane().repaint();			
			}
	}
	
	
}
