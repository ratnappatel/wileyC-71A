package com.wiley.wrappers;

import java.io.IOException;

public class ByteToInt {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter Your id");
		byte b[]=new byte[1];
		System.in.read(b);
		for(int i=0;i<b.length;i++)
		{
			Byte obj=b[i]; // conversion from primitive to wrapper object 
			int val=obj.intValue();
			System.out.println(val+"  ");
		}
		//System.out.println(b);
		byte bt=(byte)130;// -126
		System.out.println(bt);
	}
}


