package com.wiley.interfaceDemo;

public abstract class Product implements iProduct
{
	int id;
	String name;
	double price;
	public abstract void calc_sale_price();
	
}
