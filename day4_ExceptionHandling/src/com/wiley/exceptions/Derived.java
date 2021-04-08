package com.wiley.exceptions;
class Base
{
	protected void disp()
	{
		System.out.println("Protected from base...");
	}
}

public class Derived extends Base{

	@Override
	public void disp()
	{
		System.out.println("Derived public method..");
	}
	
	public static void main(String[] args) {
		Base b =new Derived();
		b.disp();
	}

}
// override : access specifier 