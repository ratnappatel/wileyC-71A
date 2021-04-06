package com.wiley.operators;

public class Electronics extends Product {

	private String manuf; 
	public Electronics(int id, String name, double price,String manuf) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.manuf=manuf;
	}
	
	public void print()
	{
		System.out.println(id+"  "+name+"  "+price+"  "+manuf);
	}
	
	public static void main(String args[])
	{
		Electronics e=new Electronics(1, "TV", 65000.900, "LG");
		e.print();
	}
}