package com.wiley.exceptions;

public class AgeException extends Exception{
	private int age;
	public AgeException() {}
	public AgeException(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "Having an age below 18 are not consider for any loan/insurance/credit-card/account";
	}
}
