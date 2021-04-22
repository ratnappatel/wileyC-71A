package com.wiley.frames.events;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame1 extends JFrame{

	JPanel p1;
	JButton b1,b2;
	
	public Frame1()
	{
		p1=new JPanel();
		
		b1=new JButton("Register");
		b2=new JButton("Login");
		
		//lambda expression actionlistener is functional interface = lambda expression
		
		b1.addActionListener((ae)-> {dispose(); new Frame2(); });
		b2.addActionListener((ae)->{dispose(); new Frame3(); });
		
		p1.add(b1);
		p1.add(b2);
		
		add(p1);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Frame1(); 
	}

}
