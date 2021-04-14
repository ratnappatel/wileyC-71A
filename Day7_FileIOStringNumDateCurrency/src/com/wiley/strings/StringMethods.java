package com.wiley.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s=new String("Coding in Java is Fun!");
		System.out.println("Index of Java in S : "+s.indexOf("Java"));
		System.out.println("S contains Fun : "+s.contains("Fun")); //char
		String a1="Angular 6";
		// take a string as input and reverse it 
		
		StringBuffer sb=new StringBuffer("Coding in Java is Fun!");
		//System.out.println("Reverse is : "+sb.reverse());
		String a=new String("Angular 6");
		System.out.println("After Replacing Java with Angular 6  :  "+sb.replace(sb.indexOf("Java"), sb.indexOf("Java")+a.length(), a));
		
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer(sb1);// new StringBuffer(sb1);
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		
		Temp t1=new Temp();
		Temp t2=new Temp();
		
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
