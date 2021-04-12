package com.wiley.coupling.busreservation;

public class Traveler {
	//Car c=new Car(); // hire a car [santro ,]
	
	Vehicle v;
	public Traveler(Vehicle v)
	{
		this.v=v;
	}
	public void travelToABC()
	{
		v.move();
	}
}
