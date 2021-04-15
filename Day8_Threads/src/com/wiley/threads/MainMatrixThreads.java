package com.wiley.threads;

public class MainMatrixThreads {

	public static void main(String[] args) {
		Matrix m=new Matrix(); // shared object for both threads
		Matrix m1=new Matrix(); // shared object for both threads
		MatrixThread1 t1=new MatrixThread1(m);
		MatrixThread2 t2=new MatrixThread2(m1);
		
		t1.start();
		/*
		 * try { t1.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		t2.start();
		
	}

}
