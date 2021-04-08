package com.wiley.exceptions;

public class BankApp {

	private int age;
	private String name;
	public BankApp(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void processRequest() throws AgeException
	{
		if(age>21)
			System.out.println("Your Service Request Submitted Successfully\nYour ServiceRequest No is : SR"+(int)(Math.random()*1000000));
		else
			throw new AgeException();
	}
	public static void main(String[] args) {
		BankApp mayur=new BankApp(28, "Mayur");
		BankApp uttam=new BankApp(12,"Uttam");
		
		try {
			mayur.processRequest();
			uttam.processRequest();
		} catch (AgeException e) {
			System.out.println(e);
		}
	}

}
