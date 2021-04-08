package com.wiley.exceptions;

import java.io.IOException;

public class DeclareException {

	public void m1()throws IOException //declaring an exception postponing 
	{
		System.out.println("m1 started....");
		throw new IOException("My Exception Object"); // flow will be diverted to calling function by ignoring next statments
		//System.out.println("m1 ended....");
	}
	public void m2()throws IOException
	{
		System.out.println("m2 started....");
		m1();
		System.out.println("m2 ended....");
	}
	public void m3() 
	{
		System.out.println("m3 started....");
		try {
			m2();
		} catch (IOException e) {
			System.out.println("My Exception");
		}
		System.out.println("m3 ended....");
	}
	public static void main(String[] args)  // if we declare = default exception handler: jvm
	{
		System.out.println("main started....");
		DeclareException de=new DeclareException();
		de.m3();
		System.out.println("Main Exiting.....");
	}

}
