package com.wiley.deadlock;

public class Data {

	void display1(Data d1)
	{
		System.out.println("Thread1 waiting for Thread2  to release lock.");
		synchronized(d1)
		{
			System.out.println("Deadlock Occured....");
		}
		d1.display2(d1);
	}
	void display2(Data d2)
	{
		System.out.println("Thread2 waiting for Thread1  to release lock.");
		synchronized(d2)
		{
			System.out.println("Deadlock Occured....");
		}
		d2.display1(d2);
	}
}
