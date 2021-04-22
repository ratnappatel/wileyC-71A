package com.wiley.frames.events;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame2 extends JFrame{
	
	JPanel p1;
	JLabel l1;
	public Frame2() {
		p1=new JPanel();
		l1=new JLabel("Register Form");
		p1.add(l1);
		
		add(p1);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
