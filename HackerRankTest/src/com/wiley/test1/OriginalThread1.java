package com.wiley.test1;

public class OriginalThread1 {

	public static void main(String[] args) {
		Odd o=new Odd();
		Thread t=new Thread(o);
		
		Even e=new Even();
		Thread t1=new Thread(e);
		
	
		t1.start();
		t.start();

		try {
            t1.join();
            t.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
	}
}
class Odd implements Runnable
{
	int i=1;
	
	public synchronized void run()
	{
		
			while(i<=100)
			{
				if(i%2==1)
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("Odd  "+i);
				notify();
				i=i+2;
				
			}
				
		}
	}


class Even implements Runnable
{
	int i=0;
	
	public synchronized void run()
	{
			while(i<=100)
			{
				if(i%2==1)
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("Even  "+i);
				notify();
				i=i+2;
				
			}
				
		}
	}
