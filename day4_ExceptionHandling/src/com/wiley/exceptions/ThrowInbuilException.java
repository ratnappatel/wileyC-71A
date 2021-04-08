package com.wiley.exceptions;

import java.util.Scanner;

import javax.xml.crypto.MarshalException;

public class ThrowInbuilException {

	public static void generate()throws MarshalException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Company Name : ");
		String input=sc.next();
		
		if(input.equalsIgnoreCase("Wiley"))
			System.out.println("Welcome To out Campus , Have a Happy Visit");
		else
			throw new MarshalException();
	}
	
	public static void main(String[] args)  // default exception handler
	{
		System.out.println("Main Started.....");
		try {
			ThrowInbuilException.generate();
		} catch (MarshalException e) {
			System.out.println("Example of Explicit Exception  ");
		}
		System.out.println("Main Exited.....");
	}

}
