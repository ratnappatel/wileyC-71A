package com.wiley.frames;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Example08 {

	    public static void main(String args[]) {
	 
	       
	        JFrame frame = new JFrame("Chat Frame");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 400);
	 
	        JMenuBar ob = new JMenuBar();
	        JMenu ob1 = new JMenu("FILE");
	        JMenu ob2 = new JMenu("Help");
	        ob.add(ob1);
	        ob.add(ob2);
	        JMenuItem m11 = new JMenuItem("Open");
	        JMenuItem m22 = new JMenuItem("Save as");
	        ob1.add(m11);
	        ob1.add(m22);
	 
	         
	        JPanel panel = new JPanel(); // the panel is not visible in output
	        JLabel label = new JLabel("Enter Text");
	        JTextField tf = new JTextField(10); // accepts upto 10 characters
	        JButton send = new JButton("Send");
	        JButton reset = new JButton("Reset");
	        
	        panel.add(label); // Components Added using Flow Layout
	        panel.add(label); // Components Added using Flow Layout
	        panel.add(tf);
	        panel.add(send);
	        panel.add(reset);
	        JTextArea ta = new JTextArea();
	 
	        frame.getContentPane().add(BorderLayout.SOUTH, panel);
	        frame.getContentPane().add(BorderLayout.NORTH, tf);
	        frame.getContentPane().add(BorderLayout.CENTER, ta);
	        frame.setVisible(true);
	    }
	}
