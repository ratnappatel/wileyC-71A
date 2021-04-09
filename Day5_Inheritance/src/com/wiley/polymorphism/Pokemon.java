package com.wiley.polymorphism;

public class Pokemon {

	int runCapacity;
	String color;
	String type;
	int points;
	public Pokemon(int runCapacity, String color, String type) {
		super();
		this.runCapacity = runCapacity;
		this.color = color;
		this.type = type;
	}
	public void canRun()
	{
		System.out.println("I can Run..");
	}
	public void fight() {System.out.println("I can only fight to ");}

	@Override
	public String toString() {
		return "Pokemon [runCapacity=" + runCapacity + ", color=" + color + ", type=" + type + "]";
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public void canFly() {System.out.println("I am Basic Pokemon so can't fly");}
	public void canSwim() {System.out.println("I am Basic Pokemon so can't swim");}
	
}
