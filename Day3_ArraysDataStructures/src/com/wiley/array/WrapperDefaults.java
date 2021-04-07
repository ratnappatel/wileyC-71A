package com.wiley.array;

public class WrapperDefaults {
	
	public void print(Integer i)
	{
		System.out.println("Integer is called");
	}

	public void print(Double i)
	{
		System.out.println("Double is called");
	}

	public void print(Object i)
	{
		System.out.println("Object is called");
	}
	public void print(String s)
	{
		System.out.println("String is called");
	}

	public static void main(String[] args) {
		new WrapperDefaults().print("str"); // compile time ambiguity takes place
	}

}
