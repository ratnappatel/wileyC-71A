package com.wiley.exceptions;

public class FunctionOverloaded {

	public int product(int a,int b)
	{
		return a*b;
	}
	public double product(double a,double b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		FunctionOverloaded fo=new FunctionOverloaded();
		fo.product(45.34,67.89);

	}

}
