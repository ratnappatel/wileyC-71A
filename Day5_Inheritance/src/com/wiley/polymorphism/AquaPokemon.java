package com.wiley.polymorphism;

public class AquaPokemon extends Pokemon {
	private int swimSpeed;

	public AquaPokemon(int runCapacity, String color, String type, int swimSpeed) {
		super(runCapacity, color, type);
		this.swimSpeed = swimSpeed;
	}

		public void canSwim()
		{
			System.out.println("I can Swim using shift+arrow buttons");
		}
	
	

}
