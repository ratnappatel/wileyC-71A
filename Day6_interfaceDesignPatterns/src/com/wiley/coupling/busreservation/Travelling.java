package com.wiley.coupling.busreservation;

import java.util.Scanner;

public class Travelling {

	public static void main(String[] args) {
		Vehicle v;
		Scanner sc=new Scanner(System.in);
		System.out.println("Tell me the no of KM you would like to travel");
		
		int miles=sc.nextInt();
		if(miles>300) //dynamic polymorphism will decide to go by bike or by car
			v=new Bike();
		else
		{
			v=new Car();
		
		}
		
		Traveler ratna=new Traveler(v);
		ratna.travelToABC();
		v.get();
		
		
	}

}
