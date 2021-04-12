package com.wiley.designpattern;

public class MainPizza {

	public static void main(String[] args) {
		Pizzas p1=new NonVegPizza("Chicken Mania", 8);
		String tp[]=p1.getToppings();
		System.out.println("You can Select any one out of given toppings");
		for(String s:tp)
			System.out.println(s);
		
		p1.price();
	}

}

/*
 * builder patter is only preferred for complex object definition
 * */
