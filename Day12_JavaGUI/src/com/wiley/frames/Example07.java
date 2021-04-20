package com.wiley.frames;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Example07 {

	JFrame a;
		Example07(){
			a = new JFrame("example");
			String courses[] = { "core java","advance java", "java servlet"};
			JComboBox c = new JComboBox(courses);
			c.setBounds(40,40,90,20);
			a.add(c);
			a.setSize(400,400);
			a.setLayout(null);
			a.setVisible(true);
		}
		public static void main(String args[])
		{
			new Example07();
		}
	}  
