package com.wiley.utilityClasses;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmailValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Email id: ");
		String email=sc.next();
		
		// user@domain.com/.co.in/.co.uk/.com
		// user: a-z 0-9 . /_ # $ are not allowed
		
		String regex="^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern emailPattern=Pattern.compile(regex);
		
		
		Matcher m1=emailPattern.matcher(email);
		
		System.out.println(email +"  :  "+m1.matches());
	}

}
