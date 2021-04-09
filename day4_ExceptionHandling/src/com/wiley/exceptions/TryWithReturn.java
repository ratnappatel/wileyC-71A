package com.wiley.exceptions;

public class TryWithReturn {
	
	int a=10,b=10,c;
	public void print()
	{
		try
		{
			c=a/b; 
			//return ;
		} 
		catch (Exception e)
		{
			System.out.println("I am capable to handle any type of exception ");
			return;
		}
		finally
		{
			System.out.println("I should get executed in any condition...");
			//return; // ignore java statements in function
		}
		System.out.println("c = "+c);
	}
	public void get()
	{
		System.out.println("get invoked");
		print(); // completed what ever suppose to do 
		System.out.println("get completed..");
	}
	public static void main(String[] args) {
		new TryWithReturn().get();
		
	}

}
