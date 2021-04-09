package com.practice;

//runtime exception will not be enforced to be handled
public class ThirdException {

	public static void m1()
	{
		int val=Integer.parseInt("50"); //un-checked exception
		System.out.println(val);
	}
	public static void main(String[] args) {
		m1();
	}

}
