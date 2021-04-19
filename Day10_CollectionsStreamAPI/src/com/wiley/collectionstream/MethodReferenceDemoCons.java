package com.wiley.collectionstream;

interface MyInterface 
{
	Test get(String msg); // not defined
}
class Test
{
	public Test(int say)
	{
		System.out.println(say);
	}
	public Test(String  say)
	{
		System.out.println(say);
	}
}

public class MethodReferenceDemoCons {

	public static void main(String[] args) {
		
		MyInterface ref=Test::new; // constructor System.out::println
		ref.get("Heelo World....");
	}

}


// calling a instance method   instance.method_name 

// ref : instance  , instane.get()