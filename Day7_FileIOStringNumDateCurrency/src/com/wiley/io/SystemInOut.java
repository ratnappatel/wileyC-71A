package com.wiley.io;

import java.io.IOException;

public class SystemInOut {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter Your Name");
		
		byte b[]=new byte[20];
		
		System.in.read(b,5,8); // input stream class
		System.out.println("Using For Loop/Explicit conversion from byte to char...");
		for(int i=0;i<b.length;i++)
		{
			char ch=(char)b[i]; // conversion between two data types 
			System.out.print(" "+ch);
		}
		System.out.println("\nUsing String Constructor...");
		
		String name=new String(b);
		System.out.println(name);
	}

}
