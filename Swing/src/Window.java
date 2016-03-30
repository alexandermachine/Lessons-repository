import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
	Window(){
		super("Пробное окно");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
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
				b1.setFocusPainted(false);
				b2.setFocusPainted(false);
				b3.setFocusPainted(false);
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
				b4.setContentAreaFilled(false);
				b4.setFocusPainted(false);
				b5.setContentAreaFilled(false);
				b5.setFocusPainted(false);
				b6.setContentAreaFilled(false);
				b6.setFocusPainted(false);
				b7.setContentAreaFilled(false);
				b7.setFocusPainted(false);
				
				JLabel l= new JLabel("<html>К этой метке применено " 
						+ "HTML-форматирование, включая: "
						+ "<ul><li> <i>курсив</i>,</ul>" 
						+ "<li><b>полужирный</b> "
						+ "<li><font size = +2> увеличение <i>размера</i> </font>" 
						+ "<li>маркированный список "
						+ "<li>тролала <b>лала</b> ла");
						
				box.add(b4);
				box.add(Box.createVerticalStrut(10));
				box.add(b5);
				box.add(Box.createVerticalStrut(10));
				box.add(b6);
				box.add(Box.createVerticalStrut(10));
				box.add(b7);
				box.add(Box.createVerticalStrut(10));
				box.add(l);
				box.setSize(500,500);
				//b7.setEnabled(false);
				
				JPanel mainPanel = new JPanel();
				mainPanel.setLayout(null);
				//mainPanel.add(box, BorderLayout.WEST);
				//mainPanel.add(panel, BorderLayout.CENTER);
				//setContentPane(mainPanel);
				getContentPane().add(box, BorderLayout.WEST);
				getContentPane().add(panel, BorderLayout.CENTER);

				//*************************************************************************//	
				
				/*
				JPanel panel = new JPanel();
				panel.setLayout(null);
				setMinimumSize(getPreferredSize());
				JButton button1 = new JButton("Кнопка");
				button1.setSize(button1.getPreferredSize());
				button1.setLocation(70,20);
				panel.add(button1,BorderLayout.CENTER);
				JButton button = new JButton("Кнопка с длинной надписью");
				button.setSize(button.getPreferredSize());
				button.setLocation(70,50);
				panel.add(button,BorderLayout.CENTER);
				JLabel l = new JLabel("title");
				l.setSize(l.getPreferredSize());
				l.setLocation(70,100);
				panel.add(l,BorderLayout.CENTER);		
				setContentPane(panel);
				
				JPanel panel1 = new JPanel();
				panel1.setLayout(new BoxLayout(panel1, EXIT_ON_CLOSE));
				JButton b1 = new JButton("Кнопка10");
				b1.setSize(button1.getPreferredSize());
				getContentPane().add(b1, BorderLayout.WEST);
				panel1.add(new JButton("Кнопка1"),BorderLayout.WEST);
				panel1.add(new JButton("Кнопка1"),BorderLayout.WEST);
				panel1.add(new JButton("Кнопка1"),BorderLayout.WEST);
				panel1.add(new JButton("Кнопка1"),BorderLayout.WEST);
				panel1.add(new JButton("Кнопка1"),BorderLayout.WEST);
				*/
				
				
		setSize(550, 550);
	}
	

}
