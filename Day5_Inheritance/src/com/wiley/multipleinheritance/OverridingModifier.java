package com.wiley.multipleinheritance;

interface Test1
{
	public void doSomething(); // abstract 
}
public class OverridingModifier implements Test1 {

	public static void main(String[] args) {
		Test1 t=new OverridingModifier();
		t.doSomething();
	}

	@Override
	public //static
	void doSomething() {
		System.out.println("I am Responsible to do task ...");
		
	}

}
