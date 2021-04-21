package com.wiley.frames;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example01 {
	
	public static void main(String args[]) {
	JFrame a = new JFrame("example"); // create an object of container which holds all required controls as group
	JButton b = new JButton("click me"); //create an object of control /component
	b.setBounds(40,90,85,20); // can be used for any control /component of frame/applet to decide its position on frame
	
	a.add(b);
	
	a.setSize(300,300);
	
	a.setLayout(null); // default layout No. of component to be added adjuscent , 
	a.setVisible(true);// by default frame object as invisible 
	}
}

