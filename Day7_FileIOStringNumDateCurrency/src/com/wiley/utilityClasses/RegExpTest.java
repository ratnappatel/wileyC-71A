package com.wiley.utilityClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		String iStr="Test String";
		String pattern="Test string";
		
		boolean matched=Pattern.matches(pattern,iStr);
		
		System.out.println(matched);
		
		
		System.out.println("*************** Locating with Pattern *****************");
		
		String input="Shop,Mop,Hopping,Chopping";
		Pattern pattern1=Pattern.compile("ing"); // it finds very first occurence of given pattern 
		
		
		
		Matcher matcher=pattern1.matcher(input);
		
		
		System.out.println(matcher.matches());
		
		while(matcher.find())
		{
			System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
		}
		
	}

}
