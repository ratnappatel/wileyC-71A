package com.wiley.frames;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class Example06 {
	
	Example06(){
	JFrame a  = new JFrame("example");
	DefaultListModel<String> l = new DefaultListModel< >();
	
	l.addElement("first item");
	l.addElement("second item");
	
	JList<String> b = new JList< >(l);
	
	b.setBounds(100,100,75,75);
	a.add(b);
	a.setSize(400,400);
	a.setVisible(true);
	a.setLayout(null);
	}
	public static void main(String args[])
	{
	new Example06();
	}
}
