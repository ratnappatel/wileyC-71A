package com.wiley.innerclass;
public class MemberInnerDemo {
	public static void main(String args[])
	{
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		in.print();
	}
}
class Outer 
{
	class Inner // non-static inner class = member inner class
	{
		public void print()
		{
			System.out.println("Member Inner Class");
		}
	}
}