package com.wiley.operators;

public class InstanceOfDemo {

	public static void main(String[] args) {
		
		Base b1=new Child("A","B"); // constructor sequence of execution is from base to child 
		
		if (b1 instanceof Base)
			System.out.println("Base Object\n");
		else if(b1 instanceof Child)
			System.out.println("Child Object\n");
	}
}
class Base
{
	public Base(String s)
	{
		System.out.println("Base");
	}
}
class Child extends Base
{
	public Child(String s1,String s2)
	{
		super(s1);
		System.out.println("Child");
	}
}