package com.wiley.frames.events;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DynamicComboBox extends JFrame implements ItemListener {

	JPanel p1;
	JLabel l1,l2,l3,msg;
	JComboBox state,city,area; 
	JButton b1;
	
	String states[]= {"Gujarat","Karnataka","Rajasthan","Maharashtra"};
	Map<String,List<String>> cityArea;
	List<String> areas;
	public DynamicComboBox() 
	{
		cityArea=new HashMap<String , List<String>>();
		
		p1=new JPanel();
		l1=new JLabel("Select State");
		l2=new JLabel("Select City");
		l3=new JLabel("Select Area");
		
		state=new JComboBox(states);
		state.addItemListener(this);
		city=new JComboBox();
		city.addItemListener(this);
		area=new JComboBox();
		
		b1=new JButton("Submit");
		p1.add(l1);
		p1.add(state);
		p1.add(l2);
		p1.add(city);
		p1.add(l3);
		p1.add(area);
		p1.add(b1);
		add(p1);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
			new DynamicComboBox();
	}

	@Override
	public void itemStateChanged(ItemEvent ie) 
	{
		String s="";
		if(ie.getSource()==state)
		{
				s=(String)state.getSelectedItem();
				System.out.println(s);
				if(s.equals("Gujarat"))
				{
						areas=new ArrayList<String>();
						areas.add("G stop 1");
						areas.add("G Stop 2");
						areas.add("G Stop 3");
						cityArea.put("Ahmedabad",areas);
				}
				if(s.equals("Karnataka"))
				{
						areas=new ArrayList<String>();
						areas.add("K stop 1");
						areas.add("K Stop 2");
						areas.add("K Stop 3");
						cityArea.put("Bangalore",areas);
				}
				if(s.equals("Maharashtra"))
				{
						areas=new ArrayList<String>();
						areas.add("M stop 1");
						areas.add("M Stop 2");
						areas.add("M Stop 3");
						cityArea.put("Mumbai",areas);
				}
				if(s.equals("Rajasthan"))
				{
						areas=new ArrayList<String>();
						areas.add("R stop 1");
						areas.add("R Stop 2");
						areas.add("R Stop 3");
						cityArea.put("Jaipur",areas);
				}
			}
			else if(ie.getSource()==city)
			{
				List<String> ar=cityArea.get((String)city.getSelectedItem());
				for(String str:ar)
					area.addItem(str);
			}
		
			Set<String> keys=cityArea.keySet();
			
			for(String str:keys)
				city.addItem(str);
		}
	}

