package com.wiley.deadlock1;

public class DataThread2 extends Thread{
	Data d1,d2;
	public DataThread2(Data d1,Data d2) {
		this.d1=d1;
		this.d2=d2;
	}
	public void run()
	{
		synchronized(d2)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		d1.display1(d1);
	}
}
