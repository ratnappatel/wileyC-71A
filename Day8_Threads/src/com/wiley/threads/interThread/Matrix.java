package com.wiley.threads.interThread;

public class Matrix {
	int x;
	boolean flag=false; // 
	public synchronized void deliver(int x)
	{ 
		if(flag)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		this.x=x;
		flag=true; // Thread.wait(1000) +time to execute run method
		System.out.println("Data Deliverd : "+x);
		notify();
	}
	public synchronized int receiver()
	{
		if(!flag)
		{
			try 
			{
				wait();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
			System.out.println("Data Received : "+x);
			flag=false;
			notify();
			return x;
	}

}
