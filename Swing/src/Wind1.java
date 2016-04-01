

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Wind1 extends JFrame implements Runnable{

	Wind1() {
		super("Новое окно");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//********Менеджер граничного размещения "FlowLayout" и "BoxLayout"********//
		JPanel panel = new JPanel();
		panel.setLayout(null);		


		b1.setFocusPainted(false);
		b1.setSize(100,30);
		b1.setLocation(0,0);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stop = true;				
			}
		});
		
		b2.setFocusPainted(false);
		b2.setSize(100,30);
		b2.setLocation(105,0);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i++;
			}
		});
		

		l1.setSize(100,30);
		l1.setLocation(0,70);
		l3.setSize(100,30);
		l3.setLocation(0,110);
		panel.add(b1);
		panel.add(b2);
		panel.add(l3);
		panel.add(l1);

		getContentPane().add(panel, BorderLayout.CENTER);


		//*************************************************************************//
setSize(221, 221);
t = new Thread(this);
t.start();

	}
	boolean stop = false;
	Thread t;

	JLabel l1= new JLabel();
	JLabel l3= new JLabel();
	JButton b1 = new JButton("СТОП");
	JButton b2 = new JButton("ПУСК");
	int i=0;

	public void run() {
		System.out.println("Поток запущен");
			//try {
				while(!stop){
					l1.setText(Integer.toString(getHeight())+" : "+Integer.toString(getWidth()));
					l3.setText(Integer.toString(i));
					
					
				//	this.getContentPane().repaint();
				//Thread.sleep(100);				
				}
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	}
	}
	
	
}
