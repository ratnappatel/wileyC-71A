package com.wiley.interfaceDemo;

public interface iProduct {
	
	public abstract void calc_sale_price();
	public default void m1() {System.out.println("m1 invoked");} // concrete method in interface 
	public static void m2() {System.out.println("static m2");}
}
