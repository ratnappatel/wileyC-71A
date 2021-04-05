package com.wiley.innerclass;

public class StaticInnerDemo {

	static String str="Static Inner Class";
	
	static class Inner
	{
		void output()
		{
			System.out.println(str);
		}
	}
}

class Test
{
	public static void main(String[] args) {
		StaticInnerDemo.Inner ob=new StaticInnerDemo.Inner();
		ob.output();
	}}