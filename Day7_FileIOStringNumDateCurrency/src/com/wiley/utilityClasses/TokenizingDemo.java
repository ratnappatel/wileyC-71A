package com.wiley.utilityClasses;

public class TokenizingDemo {

	public static void main(String[] args) {
		String str="Hi! I am to get divided in string tokes .... ";
		String arr[]=str.split(" ");
		for(String token:arr)
			System.out.println(token);
	}

}
