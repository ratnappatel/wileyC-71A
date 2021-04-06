package com.wiley.modierfs;

import java.util.Scanner;

public class Persons {

	public static void main(String[] args) {
		
		Person p1[]=new Person[5]; // initializing an array of 5 element
		Scanner sc=new Scanner(System.in);
		
		String name;
		int id;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Person's Name: ");
			name=sc.next();
			System.out.println("Enter Peron's Id: ");
			id=sc.nextInt();
			p1[i]=new Person(name,id); //initializing element of array at i position with person object
		}
		
		// Enhanced for loop jdk1.5 onwards shortening the for logic 
		for(Person p:p1)
			//System.out.println("Id : "+p.getId()+"    Name : "+p.getName());
			System.out.println(p); //toString internally
	}
}
