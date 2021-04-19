package com.wiley.collectionstream;

interface MyInterface1
{
	void display();
	//void get();
}

class Example1
{
	public void display()
	{
		System.out.println("Instance Method By Reference is Called..");
	}
	public void put()
	{
		System.out.println("I am another instance method");
	}
}

public class InstanceMethodReference {

	public static void main(String[] args) {
		
		Example1 e1=new Example1();
		
		// method reference 
		MyInterface1 mf1=e1::put;
			
		mf1.display();
	
	}

}
