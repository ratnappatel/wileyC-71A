package com.wiley.exceptions;

import java.io.FileNotFoundException;

public class PropogateRunTimeException {

	public void method1() throws IllegalArgumentException
	{
		throw new IllegalArgumentException();
	}
	public void method2()
	{
		System.out.println("method 2 started...");
		try {
			method1();
		} catch (IllegalArgumentException e) {
			System.out.println("My Exception Object...");
		}
		System.out.println("method 2 ended...");
	}
	public void method3()
	{
		System.out.println("method 3 started...");
		method2();
		System.out.println("method 3 ended...");
	}
	public static void main(String[] args) {
		PropogateRunTimeException pre=new PropogateRunTimeException();
		pre.method3();
	}

}
