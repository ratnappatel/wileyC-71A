package com.wiley.multipleinheritance;

public class DefaultInterface implements One1, Four4{

	public void greet()
	{
		System.out.println("From Derived ");
	}
	public  void let() {System.out.println("child");} //can't make it as class scope/copy
	
	public static void main(String[] args) {
	
		DefaultInterface d=new DefaultInterface();
		d.greet();
		One1.let();
		//DefaultInterface.let(); // polymorphism
		
		Four4 f=new DefaultInterface();
		f.let();
		
	}
}

interface Four4
{
	public default void greet() {System.out.println("From Four");}

	public void let();
}

interface One1
{
	// fields static , final 
	// method: public abstract 
	public default void greet() {System.out.println("From One");}
	public static void let() {}

}
interface Two2 extends One1
{
	// fields static , final 
	// method: public abstract 
	public default void greet() {System.out.println("From Two");}

}
interface Three3 extends One1, Two2 // multiple inheritance
{
	// fields static , final 
	// method: public abstract 
	public default void greet() {System.out.println("From Three");}

}