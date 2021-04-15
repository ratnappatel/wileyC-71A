package com.wiley.threads;

public class YieldPriority implements Runnable{

	public static void main(String[] args) {
		YieldPriority y1=new YieldPriority(); // task for thread defined as run method
		YieldPriority y2=new YieldPriority();
		
		Thread t1=new Thread(y1,"Child 1");
		Thread t2=new Thread(y2,"Child 2");
		
		t1.setPriority(4);
		t2.setPriority(8);
		
		t1.start();
		t2.start();
		
		
	}

	@Override
	public void run() {
		System.out.println("Start : "+Thread.currentThread());
		Thread.yield(); // current go back to runnable from running state
		
		System.out.println("End : "+Thread.currentThread());
		
	}

}
