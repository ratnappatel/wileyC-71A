package com.wiley.threads;

public class MultipleThreadData extends Thread{
	static int x=0;
	
	public MultipleThreadData(String name)
	{
		this.setName(name);
		this.start();
		try {
			this.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void setX()
	{
		x++;
	}
	public int getX()
	{
		return x;
	}
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			setX();
			System.out.println(this.getName()+" : "+getX());
		}
	}
	public static void main(String[] args) {
		MultipleThreadData m1=new MultipleThreadData("A");
		MultipleThreadData m2=new MultipleThreadData("B");
	}

}
