package com.wiley.threads.interThread;



public class MatrixThread1 extends Thread
{
	Matrix m;
	public MatrixThread1(Matrix m) {
		this.m=m;
	}
	public  void run()
	{
		for(int i=1;i<=5;i++)
		{
			m.deliver(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {		e.printStackTrace(); 	}
		}
	}

}