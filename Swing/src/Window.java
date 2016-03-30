import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
	Window(){
		super("������� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//********�������� ���������� ���������� "JPanel"********//
				//panel.setLayout(new FlowLayout());
				//panel.add(new JButton("Panel ������1"));			
				//panel.add(new JButton("Panel ������2"));			
				//setContentPane(panel);							
				//*******************************************************//
				
				
				//*****�������� ���������� ���������� "BorderLayout"*****//
				//getContentPane().add(new JButton("Pane ������1"),BorderLayout.NORTH);
				//getContentPane().add(new JButton("Pane ������2"),BorderLayout.EAST);
				//getContentPane().add(new JButton("Pane ������3"),BorderLayout.SOUTH);
				//getContentPane().add(new JButton("Pane ������4"),BorderLayout.WEST);
				//getContentPane().add(new JButton("Pane ������5"),BorderLayout.CENTER);		
				//*******************************************************//
				
				
				//********�������� ���������� ���������� "GridLayout"********//
				//������, �������, ���������� ����� ���������, ��������� ����� ��������
				//panel.setLayout(new GridLayout(2,3,10,10));
				//panel.add(new JButton("Panel ������1"));			
				//panel.add(new JButton("Panel ������2"));
				//panel.add(new JButton("Panel ������3"));
				//panel.add(new JButton("Panel ������4"));
				//panel.add(new JButton("Panel ������5"));
				//panel.add(new JButton("Panel ������6"));
				//setContentPane(panel);							
				//**********************************************************//	
				
				//********�������� ���������� ���������� "BoxLayout"********//
				//Box box = Box.createVerticalBox();
				//JButton b1 = new JButton("������1");
				//b1.setAlignmentX(10);
				//box.add(b1);
				//box.add(Box.createVerticalStrut(10));
				//box.add(new JButton("Panel ������2"));
				//box.add(Box.createVerticalGlue());
				//box.add(new JButton("Panel ������3"));
				//box.add(Box.createVerticalStrut(10));
				//box.add(new JButton("Panel ������4"));
				//box.add(Box.createVerticalStrut(10));
				//box.add(new JButton("Panel ������5"));
				//box.add(Box.createVerticalGlue());
				//box.add(new JButton("Panel ������6"));
				//setContentPane(box);
				//**********************************************************//	
				
				//********�������� ���������� ���������� "FlowLayout" � "BoxLayout"********//
				JPanel panel = new JPanel();
				panel.setLayout(new FlowLayout());		
				JButton b1 = new JButton("������1");
				JButton b2 = new JButton("������2");
				JButton b3 = new JButton("������3");
				b1.setFocusPainted(false);
				b2.setFocusPainted(false);
				b3.setFocusPainted(false);
				panel.add(b1);
				panel.add(b2);
				panel.add(b3);
				panel.setSize(100,300);
				panel.setLocation(300, 300);
				
				Box box = Box.createVerticalBox();	
				JButton b4 = new JButton("������4");
				JButton b5 = new JButton("������5");
				JButton b6 = new JButton("������6");
				JButton b7 = new JButton("������7");
				b4.setContentAreaFilled(false);
				b4.setFocusPainted(false);
				b5.setContentAreaFilled(false);
				b5.setFocusPainted(false);
				b6.setContentAreaFilled(false);
				b6.setFocusPainted(false);
				b7.setContentAreaFilled(false);
				b7.setFocusPainted(false);
				
				JLabel l= new JLabel("<html>� ���� ����� ��������� " 
						+ "HTML-��������������, �������: "
						+ "<ul><li> <i>������</i>,</ul>" 
						+ "<li><b>����������</b> "
						+ "<li><font size = +2> ���������� <i>�������</i> </font>" 
						+ "<li>������������� ������ "
						+ "<li>������� <b>����</b> ��");
						
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
				JButton button1 = new JButton("������");
				button1.setSize(button1.getPreferredSize());
				button1.setLocation(70,20);
				panel.add(button1,BorderLayout.CENTER);
				JButton button = new JButton("������ � ������� ��������");
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
				JButton b1 = new JButton("������10");
				b1.setSize(button1.getPreferredSize());
				getContentPane().add(b1, BorderLayout.WEST);
				panel1.add(new JButton("������1"),BorderLayout.WEST);
				panel1.add(new JButton("������1"),BorderLayout.WEST);
				panel1.add(new JButton("������1"),BorderLayout.WEST);
				panel1.add(new JButton("������1"),BorderLayout.WEST);
				panel1.add(new JButton("������1"),BorderLayout.WEST);
				*/
				
				
		setSize(550, 550);
	}
	

}
