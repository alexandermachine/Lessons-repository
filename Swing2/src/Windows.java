import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Windows extends JFrame {
	Windows(){
		super("������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
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
