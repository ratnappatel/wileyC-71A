package com.wiley.frames;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Example02 {

	
	public static void main(String args[])
	{
	JFrame a = new JFrame("example");
	JTextField b = new JTextField("wiley",10); // display size[no of char visible at a time in field] of textfield 
	b.setBounds(50,100,200,30);
	a.add(b);
	a.setSize(300,300);
	a.setLayout(null);
	a.setVisible(true);
	}
}
