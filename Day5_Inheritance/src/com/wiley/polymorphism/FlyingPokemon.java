package com.wiley.polymorphism;

public class FlyingPokemon extends Pokemon {
	int flyHeight;
	int flyAchievement;
	public FlyingPokemon(int runCapacity, String color, String type, int flyHeight) {
		super(runCapacity, color, type);
		this.flyHeight = flyHeight;
	}
	public void canFly()
	{
		System.out.println("I am Flying with arrow buttons ");
	}
	

}
