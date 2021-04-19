package com.wiley.collectionstream;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		String [] arr= {"Stone","Paper","Scissor","stone","paper","scissor"};
		
		// Method Reference to an instance method of an arbitary object of a 
		Arrays.sort(arr,String::compareToIgnoreCase);
		
		for(String s:arr) // n-times
			System.out.println(s);
		
		// str->System.out.println(str); == System.out::println
	}
}


// s1.equlasIgnoreCase(s2)