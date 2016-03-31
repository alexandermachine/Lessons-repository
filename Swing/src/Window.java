import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Window  extends JFrame implements Runnable {
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
				//panel.setSize(100,300);
				//panel.setLocation(300, 300);
				
				//********Боковая левая панель**************//
				Box box = Box.createVerticalBox();	
				JButton b4 = new JButton("кнопка4");
				b4.setContentAreaFilled(false);
				b4.setFocusPainted(false);
				JButton b5 = new JButton("кнопка5");
				b5.setContentAreaFilled(false);
				b5.setFocusPainted(false);
				JButton b6 = new JButton("кнопка6");
				b6.setContentAreaFilled(false);
				b6.setFocusPainted(false);
				JButton b7 = new JButton("кнопка7");
				b7.setContentAreaFilled(false);
				b7.setFocusPainted(false);
				
				JCheckBox ChB1 = new JCheckBox("Выбрать то");
				ChB1.setFocusPainted(false);
				JCheckBox ChB2 = new JCheckBox("Выбрать это");
				ChB2.setFocusPainted(false);
				JCheckBox ChB3 = new JCheckBox("Выбрать третье");
				ChB3.setFocusPainted(false);
				JCheckBox ChB4 = new JCheckBox("Выбрать пятое");
				ChB4.setFocusPainted(false);
				JCheckBox ChB5 = new JCheckBox("Выбрать десятое");
				ChB5.setFocusPainted(false);
				
				ButtonGroup bbb = new ButtonGroup();
				JRadioButton r1 = new JRadioButton("первое");
				r1.setFocusPainted(false);
				JRadioButton r2 = new JRadioButton("второе");
				r2.setFocusPainted(false);
				JRadioButton r3 = new JRadioButton("третье");
				r3.setFocusPainted(false);
				bbb.add(r1);
				bbb.add(r2);
				bbb.add(r3);
				JLabel l1= new JLabel();
				l1.setText(Integer.toString(getHeight())+" : "+Integer.toString(getWidth()));
				JLabel l2= new JLabel(
						"<html>К этой метке применено " 
						+ "HTML-форматирование, включая: "
						+ "<ul><li> <i>курсив</i>,</ul>" 
						+ "<li><b>полужирный</b> "
						+ "<li><font size = +2> увеличение <i>размера</i> </font>" 
						+ "<li>маркированный список "
						+ "<li>тролала <b>лала</b> ла"
						+ "<li><b>Ну ладно ладно ОЧЕНЬ <font size = +2>ВАЖЕН</font></b>");
				
				box.add(l1);	
				box.add(Box.createVerticalStrut(15));
				box.add(b4);
				box.add(Box.createVerticalStrut(10));
				box.add(b5);
				box.add(Box.createVerticalStrut(10));
				box.add(b6);
				box.add(Box.createVerticalStrut(10));
				box.add(b7);
				box.add(Box.createVerticalStrut(10));
				box.add(l2);				
								
				box.add(Box.createVerticalStrut(20));
				box.add(ChB1);
				box.add(ChB2);
				box.add(ChB3);
				box.add(ChB4);
				box.add(ChB5);
				box.add(Box.createVerticalStrut(20));
				box.add(r1);
				box.add(r2);
				box.add(r3);
				box.add(Box.createVerticalStrut(20));
				
				box.setSize(500,400);
				//b7.setEnabled(false);
				//********Боковая левая панель**************//
				Box botBox = Box.createHorizontalBox();
				JToggleButton t1 = new JToggleButton("Тугл1");
				t1.setFocusPainted(false);
				JToggleButton t2 = new JToggleButton("Тугл2");
				t2.setFocusPainted(false);
				JToggleButton t3 = new JToggleButton("Тугл3");
				t3.setFocusPainted(false);
				JToggleButton t4 = new JToggleButton("Тугл4");
				t4.setFocusPainted(false);
				
				
				
				
				
				
				botBox.add(t1);
				botBox.add(botBox.createHorizontalGlue());
				botBox.add(t2);
				botBox.add(botBox.createHorizontalGlue());
				botBox.add(t3);
				botBox.add(botBox.createHorizontalGlue());
				botBox.add(t4);
								
				//setContentPane(mainPanel);
				getContentPane().add(box, BorderLayout.WEST);
				getContentPane().add(panel, BorderLayout.CENTER);
				getContentPane().add(botBox, BorderLayout.SOUTH);

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
				
				
		setSize(550, 700);
		t = new Thread(this,"Window repaint");
		t.start();
	}
	Thread t;

	public void run() {
		System.out.println("Поток запущен");
		while(true){
			repaint();
		}
		
		
	}
	
	
	

}
