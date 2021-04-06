package com.wiley.enums;

import java.util.Scanner;

public class ApperalSize {

	public static void main(String[] args) {
		SelectYourSize ss=new SelectYourSize();
		ss.getAllSize();
		}
		
}
enum Size{Small , Medium, Large, XtraLarge , XXLarge}

class SelectYourSize
{
	Size sz;
	public SelectYourSize()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Size");
		String s=sc.next();
		
		//  if -else
		if(s.equalsIgnoreCase("s"))
				sz=Size.Small;
		else if(s.equalsIgnoreCase("M"))
				sz=Size.Medium;
		else if (s.equalsIgnoreCase("L"))
			sz=Size.Large;
		else if (s.equalsIgnoreCase("XL"))
			sz=Size.XtraLarge;
		else if(s.equalsIgnoreCase("XXL"))
			sz=Size.XXLarge;
		else
			System.out.println("Invalid Input");
		System.out.println(sz);
		
	}
	public void getAllSize()
	{
		Size s1[]=Size.values();
		for(Size s:s1)
			System.out.println(s+" at index "+s.ordinal());
	}
	
	
}