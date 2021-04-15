package com.wiley.threads;

public class MatrixThread2 extends Thread
{
	Matrix m;
	public MatrixThread2(Matrix m) {
		this.m=m;
	}
	public  void run()
	{
		m.printMatrix1(10);
	}
}
