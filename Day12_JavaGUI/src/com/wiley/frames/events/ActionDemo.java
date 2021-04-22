package com.wiley.frames.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ActionDemo implements ActionListener,ItemListener{

	JFrame f1;
	JLabel l1;
	JTextField t1;
	JButton b1;
	JPanel p1;
	JRadioButton rb1,rb2;
	JCheckBox c1,c2,c3;
	ButtonGroup bgroup;
	int i=100;
	public ActionDemo() {
		
		f1=new JFrame("Event Example");
		p1=new JPanel();
		l1=new JLabel();
		t1=new JTextField(30);
		b1=new JButton("Read Input");
		b1.addActionListener(this);  // an object of class where actionPerformed is defined 
		
		bgroup=new ButtonGroup();
		
		rb1=new JRadioButton("Female",true);
		rb2=new JRadioButton("Male");
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		bgroup.add(rb1);
		bgroup.add(rb2);
		
		c1=new JCheckBox("C");
		c2=new JCheckBox("C++");
		c3=new JCheckBox("Java");
		
		
		p1.add(t1);
		p1.add(rb1);
		p1.add(rb2);
		
		p1.add(c1);
		p1.add(c2);
		p1.add(c3);
		
		p1.add(b1);
		p1.add(l1);
		
		
		
		f1.add(p1);
		f1.setSize(300,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ActionDemo();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String input=null,gender=null,l="";
		if(ae.getSource() == b1)
		{
			input=t1.getText(); //NAME +STATIC INT I++
			if(rb1.isSelected())
				gender="Female";
			else if(rb2.isSelected())
			gender="male";
			
			if(c1.isSelected())
				l+="C ,";
			if(c2.isSelected())
				l+="C++ , ";
			if(c3.isSelected())
				l+="Java ";
			
			l1.setText(input+"Gender : "+gender+"Knows : "+l);
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent ie) {

		if(ie.getSource()==rb1)
			l1.setText("Female");
		else
			l1.setText("Male");
	}

}











