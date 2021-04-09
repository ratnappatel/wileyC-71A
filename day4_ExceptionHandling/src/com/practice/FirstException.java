package com.practice;

import java.util.Scanner;

public class FirstException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Nos..");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Line 1");
		System.out.println("Line 2");
		try 
		{
			System.out.println("Line odd"+a/b); // no of statements may cause an exception
		} 
		catch (ArithmeticException ae) {
			ae.printStackTrace();
		}  
		finally
		{
			System.out.println("I always get my place in output");
		}
		System.out.println("Line 3");
		System.out.println("Line 4");
	}

}
