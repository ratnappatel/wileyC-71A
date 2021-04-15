package com.wiley.deadlock1;

public class Data {
	synchronized void display1(Data d2)
	{
		System.out.println("Thread1 waiting for Thread2  to release lock.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d2.display2(d2);
		System.out.println("Deadlock Occured....");
	}
	synchronized void display2(Data d1)
	{
		System.out.println("Thread2 waiting for Thread1  to release lock.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {e.printStackTrace();	}
		d1.display1(d1);
			System.out.println("Deadlock Occured....");
		
	}
}
