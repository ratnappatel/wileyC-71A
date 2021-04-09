package com.wiley.multipleinheritance;

interface One
{
	// fields static , final 
	// method: public abstract 
	public void greet();

}
interface Two
{
	// fields static , final 
	// method: public abstract 
	public void greet();

}
interface Three extends One, Two // multiple inheritance
{
	// fields static , final 
	// method: public abstract 
	public void greet();

}

interface Four
{
	public void greet(); // abstract method
}

class Derived implements Three , Four
{
	@Override
	public void greet() {

		System.out.println("Greet From Interface One");
		
	}

}

public class MainTest  
{

	public static void main(String[] args) {
		Derived d=new Derived();
		d.greet();
		}

	

}
