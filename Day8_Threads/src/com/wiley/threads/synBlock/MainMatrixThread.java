package com.wiley.threads.synBlock;

public class MainMatrixThread {

	public static void main(String[] args) {
		Matrix m=new Matrix();
		
		MatrixThread t1=new MatrixThread("A", m);
		MatrixThread t2=new MatrixThread("B",m);
		
		t1.t.start();
		t2.t.start();
	}

}
