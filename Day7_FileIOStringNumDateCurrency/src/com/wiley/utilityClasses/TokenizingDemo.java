package com.wiley.utilityClasses;

import java.util.StringTokenizer;

public class TokenizingDemo {

	public static void main(String[] args) {
		String str="Hi! I am to get, divided in string tokes .... ";
		String arr[]=str.split(" ,!"); // takes delimiter as regexp and not as indivisual tokens
		for(String token:arr)
			System.out.println(token);
		System.out.println("------------------------------------------------------");
		StringTokenizer st=new StringTokenizer(str, "!, ",true); // considers each char in delimiter string argument as a seperate delimiter to be considered.
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
