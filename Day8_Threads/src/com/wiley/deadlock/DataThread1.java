package com.wiley.deadlock;

public class DataThread1 extends Thread {
	
	Data d1,d2;
	public DataThread1(Data d1,Data d2) {
		this.d1=d1;
		this.d2=d2;
	}
	public void run()
	{
		synchronized(d1)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		d2.display2(d2);
	}

}
