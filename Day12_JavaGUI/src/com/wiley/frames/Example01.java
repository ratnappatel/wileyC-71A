package com.wiley.frames;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example01 {
	
	public static void main(String args[]) {
	JFrame a = new JFrame("example");
	JButton b = new JButton("click me");
	b.setBounds(40,90,85,20);
	a.add(b);
	a.setSize(300,300);
	a.setLayout(null);
	a.setVisible(true);
	}
}

