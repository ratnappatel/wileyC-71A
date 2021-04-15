package com.wiley.threads;

public class MultipleThread implements Runnable{

	Thread t;
	public  MultipleThread(String name) {
		t=new Thread(this,name);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi I am "+t.getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {e.printStackTrace();	}
		}
		
	}
	public static void main(String[] args) {
		MultipleThread t1=new MultipleThread("A");
		MultipleThread t2=new MultipleThread("B");
		MultipleThread t3=new MultipleThread("C");
	
	}

	

}
