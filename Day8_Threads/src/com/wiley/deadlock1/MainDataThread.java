package com.wiley.deadlock1;

public class MainDataThread {

	public static void main(String[] args) {

		Data d1=new Data();
		Data d2=new Data();
		
		DataThread1 t1=new DataThread1(d1, d2);
		DataThread2 t2=new DataThread2(d1, d2);
		
		t1.start();
		t2.start();
	}

}
