package com.wiley.test1;

public class School implements Building {
	int floors[];
	public School(int n) 
	{
		floors=new int[n];
		System.out.println("A School is being Constructed...."+n);
	}

	public void floorCompleted(int floorNumber)
	{
		
		if(floorNumber<=floors.length)
			System.out.println("Construction for floor number "+floorNumber+" completed in school.");
		else
			System.out.println("Floor number "+floorNumber+" does not exist in school");
		
	}
	public void printStatus(int floorNumber)
	{
		if(floorNumber>floors.length)
			System.out.println("Floor number "+floorNumber+" does not exist in school");
		else if(floors[floorNumber]==1)
			System.out.println("Construction for floor number"+floorNumber+" completed in school.");
		else if(floors[floorNumber]==0)
			System.out.println("Construction for floor number"+floorNumber+" Not completed in school.");
	}
	public void printNumberOfFloors()
	{
		System.out.println("The school has "+  floors.length+" floors");
	}
}
