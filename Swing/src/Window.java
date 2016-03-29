import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
	Window(){
		super("Пробное окно");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		
		setSize(350, 250);
	}
	

}
