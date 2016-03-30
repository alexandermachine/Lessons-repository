import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Windows extends JFrame {
	Windows(){
		super("Пробное окно");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//********Менеджер граничного размещения "JPanel"********//
		//panel.setLayout(new FlowLayout());
		//panel.add(new JButton("Panel кнопка1"));			
		//panel.add(new JButton("Panel кнопка2"));			
		//setContentPane(panel);							
		//*******************************************************//
		
		
		//*****Менеджер граничного размещения "BorderLayout"*****//
		//getContentPane().add(new JButton("Pane кнопка1"),BorderLayout.NORTH);
		//getContentPane().add(new JButton("Pane кнопка2"),BorderLayout.EAST);
		//getContentPane().add(new JButton("Pane кнопка3"),BorderLayout.SOUTH);
		//getContentPane().add(new JButton("Pane кнопка4"),BorderLayout.WEST);
		//getContentPane().add(new JButton("Pane кнопка5"),BorderLayout.CENTER);		
		//*******************************************************//
		
		
		//********Менеджер граничного размещения "GridLayout"********//
		//строки, столбци, расстояние между столбцами, растояние между строками
		//panel.setLayout(new GridLayout(2,3,10,10));
		//panel.add(new JButton("Panel кнопка1"));			
		//panel.add(new JButton("Panel кнопка2"));
		//panel.add(new JButton("Panel кнопка3"));
		//panel.add(new JButton("Panel кнопка4"));
		//panel.add(new JButton("Panel кнопка5"));
		//panel.add(new JButton("Panel кнопка6"));
		//setContentPane(panel);							
		//**********************************************************//	
		
		//********Менеджер граничного размещения "BoxLayout"********//
		//Box box = Box.createVerticalBox();
		//JButton b1 = new JButton("кнопка1");
		//b1.setAlignmentX(10);
		//box.add(b1);
		//box.add(Box.createVerticalStrut(10));
		//box.add(new JButton("Panel кнопка2"));
		//box.add(Box.createVerticalGlue());
		//box.add(new JButton("Panel кнопка3"));
		//box.add(Box.createVerticalStrut(10));
		//box.add(new JButton("Panel кнопка4"));
		//box.add(Box.createVerticalStrut(10));
		//box.add(new JButton("Panel кнопка5"));
		//box.add(Box.createVerticalGlue());
		//box.add(new JButton("Panel кнопка6"));
		//setContentPane(box);
		//**********************************************************//	
		
		//********Менеджер граничного размещения "FlowLayout" и "BoxLayout"********//
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());		
		JButton b1 = new JButton("кнопка1");
		JButton b2 = new JButton("кнопка2");
		JButton b3 = new JButton("кнопка3");
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.setSize(100,300);
		panel.setLocation(300, 300);
		
		Box box = Box.createVerticalBox();	
		JButton b4 = new JButton("кнопка4");
		JButton b5 = new JButton("кнопка5");
		JButton b6 = new JButton("кнопка6");
		JButton b7 = new JButton("кнопка7");		
				
		box.add(b4);
		box.add(Box.createVerticalStrut(10));
		box.add(b5);
		box.add(Box.createVerticalStrut(10));
		box.add(b6);
		box.add(Box.createVerticalStrut(10));
		box.add(b7);
		box.add(Box.createVerticalStrut(10));
		box.setSize(100,500);
		//b7.setEnabled(false);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.add(box);
		mainPanel.add(panel);
		setContentPane(mainPanel);
		//getContentPane().add(box, BorderLayout.WEST);
		//getContentPane().add(panel, BorderLayout.CENTER);

		//*************************************************************************//	
		
		
		
		
		setSize(500,500);
	}
	JPanel panel = new JPanel();

}
