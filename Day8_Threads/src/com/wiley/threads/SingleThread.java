package com.wiley.threads;

public class SingleThread  extends Thread
{
	public void run()
	{
		this.setPriority(MAX_PRIORITY);
		System.out.println("Welcome to Threads World.....\nMy Name is :"+getName()+" \n Priority : "+getPriority());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// main method itself is a thread
		System.out.println("Main Started..."+Thread.currentThread().getPriority());
		SingleThread st=new SingleThread();// anonymous object of the class
		st.start();
		
	  try { Thread.sleep(2000); } catch (InterruptedException e) {
	  e.printStackTrace();}
	System.out.println("Thread is alive : "+st.isAlive());
		System.out.println("Main Exited...");
	
	}
}


//Thread-0 , Thread-1