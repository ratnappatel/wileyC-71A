package com.wiley.exceptions;

public class StackOverFlowDemo {
	public static void run(int i)
	{
		if(i==0)
			return ;
		else
			run(i++);
	}

	public static void main(String[] args) {
		
		StackOverFlowDemo.run(-5);

	}

}
