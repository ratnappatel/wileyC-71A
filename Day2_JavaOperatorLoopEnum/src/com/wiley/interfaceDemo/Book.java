package com.wiley.interfaceDemo;

// class must have a method called cal_sale_price
public class Book extends Author implements iProduct
{

	@Override
	
	public void calc_sale_price() {
		System.out.println("calculate sale price ");
	}
	public void m1()
	{
		System.out.println("From Book m1 ");
	}
	// regular method of my class
	public static void m2()
	{
		System.out.println("From Book m2 ");
	}
	public static void main(String args[])
	{
		Book b=new Book();
		b.calc_sale_price();
		b.m1();
		b.m2();
		
		iProduct p=new Book();
		p.calc_sale_price();
		p.m1();
		iProduct.m2();
	}

}
