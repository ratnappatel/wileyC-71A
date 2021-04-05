package com.wiley.innerclass;

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer1 o1=new Outer1();
		o1.display();
	}

}
class Outer1 
{
	int x=10;
	
	public void display()
	{
		 final int x=20;
		class Inner1
		{
			//int x=30;
			public void print()
			{
				System.out.println("x = "+x);
				
				System.out.println("x = "+Outer1.this.x);
			}
		}
	
		Inner1 i1=new Inner1();
		i1.print();
	}
}