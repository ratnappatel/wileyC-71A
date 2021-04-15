package com.wiley.threads.interThread;

public class MatrixThread2 extends Thread{
	Matrix m;
	public MatrixThread2(Matrix m) {
		this.m=m;
	}
	public  void run()
	{
		for(int i=1;i<=5;i++)
		{
			m.receiver();
			try {
				Thread.sleep(500);
			} catch (Exception e) {e.printStackTrace();
			}
		}
		
	}
}
