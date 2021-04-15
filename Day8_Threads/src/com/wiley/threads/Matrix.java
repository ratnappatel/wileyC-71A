package com.wiley.threads;

public class Matrix {

	public synchronized void printMatrix(int x)
	{ // TELL OTHER THREADS THAT METHOD IS NOW LOCKED BY T1 HENCE WAIT[T2 UNTILE T.NOTIFY/NOTIFYaLL]
		for(int i=1;i<=5;i++)
		{
			System.out.println(x * i);
			try
			{
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void printMatrix1(int x)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(x * i);
			try
			{
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
