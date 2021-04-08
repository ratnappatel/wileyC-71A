package com.wiley.memorymg;

import java.util.*;

public class JVMMarkSwipe {

	Scanner sc;
	public JVMMarkSwipe()
	{
		sc=new Scanner(System.in);
	}
	public void m1()
	{
		System.out.println("m1 ");
	}
	public void m2()
	{
		//Student s;
		System.out.println("m1 ");
	}
	public void m3()
	{
		sc.close();
	}
	public static void main(String[] args) {
		JVMMarkSwipe j1=new JVMMarkSwipe(); // line one
		j1.m1(); // list of objects=reference 
		j1.m2();
		
	}

}
