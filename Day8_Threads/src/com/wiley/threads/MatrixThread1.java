package com.wiley.threads;

public class MatrixThread1 extends Thread
{
	Matrix m;
	public MatrixThread1(Matrix m) {
		this.m=m;
	}
	public  void run()
	{
		m.printMatrix(2);
	}

}
