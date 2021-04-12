package com.wiley.dst.arraylist1;

public class StringHashCode {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		
		System.out.println("s1 : "+s1.hashCode());
		
		System.out.println("s2 : "+s2.hashCode());
		
		Double i1=new Double(10.34);
		Double i2=new Double(10.34);
		i2+=100.90;
		
		System.out.println("i1 : "+i1.hashCode());
		
		System.out.println("i2 : "+i2.hashCode());
		
		Person p1=new Person(100);
		Person p2=new Person(100);
		System.out.println("p1 : "+p1.hashCode());
		
		System.out.println("p2 : "+p2.hashCode());
		
		
	}

}
class Person{
	int id;
	public Person(int id) {this.id=id;}
	}