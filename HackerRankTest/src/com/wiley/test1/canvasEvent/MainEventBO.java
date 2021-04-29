package com.wiley.test1.canvasEvent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainEventBO {

	public static void main(String[] args) {
		try 
		{
			EventBO bo=new EventBO();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter length of Array");
			int n=Integer.parseInt(br.readLine());
			
			Event [] events=new Event[n];
			String name, detail, type, organiser;
			int attendeesCount;
			double projected_expense;
			
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Event Details: ");
				String s=br.readLine();
				String [] input=s.split(",");
				Event e=new Event(input[0], input[1], input[2], input[3], Integer.parseInt(input[4]), Double.parseDouble(input[5]));
				bo.addEvent(events, e);
				events[i]=e;
			}
			System.out.println("Enter Event Type to search");
			type=br.readLine();
			Event res[]=bo.searchEvent(events, type);
			
			
			  for(Event e:res) System.out.println(e);
			 
			
			System.out.println("===========================================");
			bo.displayAll(events);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
