package com.wiley.polymorphism;

public class StaticPolimorphism {

	public int product(int a,int b)
	{
		System.out.println("Product of ints");
		return a*b;
	}
	public double product(int a,double b)
	{
		System.out.println("Product of int & double");
		return a*b;
	}
	
	public static void main(String args[])
	{
		StaticPolimorphism s=new StaticPolimorphism();
		s.product(12,34.534);
	}
}
