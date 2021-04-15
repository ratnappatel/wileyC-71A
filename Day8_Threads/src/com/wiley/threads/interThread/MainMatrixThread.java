package com.wiley.threads.interThread;

public class MainMatrixThread {

	public static void main(String[] args) {
		Matrix m=new Matrix();
	MatrixThread1 t1=new MatrixThread1(m);
	MatrixThread2 t2=new MatrixThread2(m);
	
	t1.start();
	t2.start();
	}

}
