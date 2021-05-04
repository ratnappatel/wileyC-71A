package com.wiley.test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

// two thread simultaneously 

public class OriginalThread  {
	public static void main(String[] args) {
		int counter=100;
		printOdd odd = new printOdd(counter);
		printEven even = new printEven(counter);
		
		Thread t1=new Thread(new Runnable() {
		@Override
			public void run() {
				odd.runOdd();
			}
			
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				even.runEven();
			}
			
		});

		t2.start();
		

	}


}

class printOdd  {
	int count;
	int i=1;
	public printOdd(int count) {
		this.count=count;
	}
	public void runOdd() {
		
		synchronized (this) {
			while (i<=count ) {
				if (i%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd :" + i);
				i++;
				notify();
			}
		}
	}
}

class printEven  {
	int count = 0;
	int i=0;
	public printEven(int count) {

		this.count=count;
	}
	public void runEven() {
		
		synchronized (this) {
			while (i<count) {
				if (i%2==1) {
					try
					{
						wait();
					} catch (InterruptedException e) {	e.printStackTrace();	}
				}
				System.out.println("Even :" + i);
				i++;
				notify();
			}
		}
	}
}
