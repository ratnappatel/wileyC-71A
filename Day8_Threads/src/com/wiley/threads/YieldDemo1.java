package com.wiley.threads;

 class YieldDemo extends Thread{

	 // run as a child thread of main thread
	 public YieldDemo() {
		 this.setPriority(MAX_PRIORITY);
	 }
		public void run()
		{
			for (int i=0; i<5 ; i++)
				System.out.println(Thread.currentThread().getName()
									+ " in control");
		}
	}

	// Driver Class
 public class YieldDemo1
	{
		public static void main(String[]args)
		{
			YieldDemo t = new YieldDemo();
			t.start();

			for (int i=0; i<5; i++)
			{
				// Control passes to child thread
				//Thread.yield();

				// After execution of child Thread
				// main thread takes over
				System.out.println(Thread.currentThread().getName()
									+ " in control");
			}
		}
	}



