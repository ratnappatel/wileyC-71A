package com.wiley.designpattern;

public class VegPizza  extends Pizzas{
	String name;
	int size;
	String [] toppings= {"mashroom","olives","capcicum"};
	@Override
	public void price() {
		System.out.println("Calculating a price of Veg Pizza by adding toppings is :"+954);
		
	}
	@Override
	public String[] getToppings() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
