package com.wiley.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("abc");
		StringBuffer s2=new StringBuffer("abc");
		StringBuffer s3=new StringBuffer(s2);
		String s="abc";
			
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		if(s1.toString().equals(s2.toString()))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		s1=s1.append(" xyz");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("--------------------------------------");
		s2.append(" pqr");
		
		System.out.println("s1 : "+s1.hashCode()+" : "+s1);
		System.out.println("s2 : "+s2.hashCode()+" : "+s2);
		System.out.println("s3 : "+s3.hashCode()+" : "+s3);
	}

}
