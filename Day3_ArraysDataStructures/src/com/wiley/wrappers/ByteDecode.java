package com.wiley.wrappers;

import java.util.Scanner;

public class ByteDecode {

	public static void main(String[] args) {

		System.out.println("Enter a Value");
		Scanner sc=new Scanner(System.in);
		String val=sc.nextLine();
		
		
		sc.close();
		
		Byte res=Byte.decode(val);
		System.out.println(res);
	}

}
