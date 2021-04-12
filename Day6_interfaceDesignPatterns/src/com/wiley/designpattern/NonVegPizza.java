package com.wiley.designpattern;

public class NonVegPizza  extends Pizzas{

	String name;
	int size;
	String [] toppings= {"Suasages","Keema"};
	@Override
	
	
	public void price() {
		System.out.println("Calculation Non-veg Pizza Price by adding prefered toppings is "+1000);
		
	}
	public NonVegPizza(String name, int size) {
		super();
		this.name = name;
		this.size = size;
		//this.toppings = toppings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String[] getToppings() {
		return toppings;
	}
	
}


