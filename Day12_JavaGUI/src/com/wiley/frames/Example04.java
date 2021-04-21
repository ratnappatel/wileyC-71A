package com.wiley.frames;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example04 {

	Example04(){
	JFrame a = new JFrame("example");
	
	JPanel p = new JPanel();
	JPanel p1=new JPanel();
	p1.setBounds(270,200,150,150);
	p.setBounds(40,70,200,200);
	
	JButton b = new JButton("click me");
	b.setBounds(60,50,80,40);
	p.add(b);
	
	JButton b1 = new JButton("I am in different team");
	b1.setBounds(60,50,80,40);
	p1.add(b1);
	
	a.add(p);
	a.add(p1);
	
	a.setSize(400,400);
	a.setLayout(null);
	a.setVisible(true);
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
	new Example04();
	}
	}
