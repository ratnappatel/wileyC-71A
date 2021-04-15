package com.wiley.threads.synBlock;

public class MatrixThread extends Matrix implements Runnable{

	Thread t;
	Matrix m;
	public MatrixThread(String name,Matrix m) {
		t=new Thread(this,name);
		this.m=m;
	}
	
	public void run()
	{
		synchronized (m) { //marking a blok/method as a critical section [where only one thread is executing at a time]
			m.printMatrix(t.getName());
		}
		System.out.println("Thread  "+t.getName()+"  exiting");
	}
	
}
