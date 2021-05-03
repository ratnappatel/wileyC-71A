package com.wiley.com.debug;

public class Test {

	public static void main(String[] args) {
		System.out.println("START");
		int a = 10;
		a= a++ + ++a - ++a + a++;
		
		if(a>55)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		System.out.println("Done");

	}

}
