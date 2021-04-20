package com.wiley.frames;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class Example03 {

	
	Example03()
	{
		JFrame a = new JFrame("example");
		JScrollBar b = new JScrollBar();
		b.setBounds(90,90,40,90);
		a.add(b);
		a.setSize(300,300);
		a.setLayout(null);
		a.setVisible(true);
	}
	public static void main(String args[]){
	new Example03();
	}
}

