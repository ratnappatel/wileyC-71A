package com.wiley.strings;

public class StringDemo {

	public static void main(String[] args) {
		// == != <= >= < > 
		// == is used to compare reference of an object an not the value stored inside an object
		
		String s1=new String("abc");
		String s2=new String("abc");
		String s3=s2;
		
		if(s2 == s1)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		if(s2 == s3)
			System.out.println("s3 == s2");
		else
			System.out.println("s3 != s2");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		if(s2.equals(s1))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		if(s2.equals(s3))
			System.out.println("s3 == s2");
		else
			System.out.println("s3 != s2");
		
		s1+=" xyz";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("--------------------------------------");
		s2+="pqr";
		
		System.out.println("s1 : "+s1.hashCode()+" : "+s1);
		System.out.println("s2 : "+s2.hashCode()+" : "+s2);
		System.out.println("s3 : "+s3.hashCode()+" : "+s3);
		
	}

}
