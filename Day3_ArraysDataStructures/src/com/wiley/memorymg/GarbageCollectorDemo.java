package com.wiley.memorymg;

public class GarbageCollectorDemo {

	int x=10;
	public static void main(String[] args) {
		GarbageCollectorDemo g1=new GarbageCollectorDemo();
		GarbageCollectorDemo g2=new GarbageCollectorDemo();
		g1.x=100;
		System.out.println(g1.x);
		System.out.println("g1 : "+g1.toString());
		System.out.println("g2 : "+g2.toString());
		
		g2=null;
		
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println(g1.x);
		
		
	}
	protected void finalize()
            throws Throwable
            {
				System.out.println("I am Called by GC");
				System.out.println("Object Garbage Collected is : "+this);
            }

}
