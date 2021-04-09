package com.wiley.polymorphism;

import java.util.Scanner;

public class DynamicPolymorphism {

	public static void main(String[] args) {
	
		Base b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Tell me a flavour of method");
		String flavour=sc.next();
		if(flavour.equalsIgnoreCase("Base")) //dynamic polymorphism
			b=new Base();
		else
			b=new Derived();
		b.getMe(); // not decide at compile time 
	}

}
class Base
{
	public void getMe()
	{
		System.out.println("from base");
	}
}
class Derived extends Base
{
	public void getMe()
	{
		System.out.println("from derived");
	}
}