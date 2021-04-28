package com.wiley.test1;

public class Hospital implements Building{
	int floors[];
	public Hospital(int n) {
		floors=new int[n];
		System.out.println("A Hospital is being Constructed...."+n);
	}

	public void floorCompleted(int floorNumber)
	{
		if(floorNumber<=floors.length)
		{
			floors[floorNumber]=1;
			System.out.println("Construction for floor number"+floorNumber+" completed in hospital.");
		}
		else
			System.out.println("Floor number "+floorNumber+" does not exist in hospital");
	}
	public void printStatus(int floorNumber)
	{
		if(floorNumber>floors.length)
			System.out.println("Floor number "+floorNumber+" does not exist in hospital");
		else if(floors[floorNumber]==1)
			System.out.println("Construction for floor number"+floorNumber+" completed in hospital.");
		else if(floors[floorNumber]==0)
			System.out.println("Construction for floor number"+floorNumber+" Not completed in hospital.");
	}
	public void printNumberOfFloors()
	{
		System.out.println("The hospital has "+  floors.length+" floors");
	}

}
