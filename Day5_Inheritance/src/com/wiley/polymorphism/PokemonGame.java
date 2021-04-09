package com.wiley.polymorphism;

public class PokemonGame {

	public static void main(String[] args) {

		Pokemon p1=new Pokemon(20, "Grey", "Basic");
		
		p1.setPoints(1000);
		p1.canRun();
		p1.canFly();
		p1.canSwim();
		System.out.println("=======================================================");
		if(p1.getPoints()>=1000)
			p1=new FlyingPokemon(45, "Green", "Flying", 50);
		p1.canRun();
		p1.canFly();
		p1.canSwim();
		
}

}
