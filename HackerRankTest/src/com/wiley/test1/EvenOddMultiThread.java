package com.wiley.test1;

public class EvenOddMultiThread {

	// Starting counter
		int counter = 1;

		static int N;

		// Function to print odd numbers
		public void printOddNumber()
		{
			synchronized (this)
			{
				// Print number till the N
				while (counter < N) {

					// If count is even then print
					while (counter % 2 == 0) {

						// Exception handle
						try {
							wait();
						}
						catch (
							InterruptedException e) {
							e.printStackTrace();
						}
					}

					// Print the number
					System.out.print(counter + " ");

					// Increment counter
					counter++;

					// Notify to second thread
					notify();
				}
			}
		}

		// Function to print even numbers
		public void printEvenNumber()
		{
			synchronized (this)
			{
				// Print number till the N
				while (counter < N) {

					// If count is odd then print
					while (counter % 2 == 1) {

						// Exception handle
						try {
							wait();
						}
						catch (
							InterruptedException e) {
							e.printStackTrace();
						}
					}

					// Print the number
					System.out.print(
						counter + " ");

					// Increment counter
					counter++;

					// Notify to 2nd thread
					notify();
				}
			}
		}

		// Driver Code
		public static void main(String[] args)
		{
			// Given Number N
			N = 100;

			EvenOddMultiThread mt = new EvenOddMultiThread();

			
			Thread t1 = new Thread(new Runnable() {
				public void run()
				{
					mt.printEvenNumber();
				}
			});

			Thread t2 = new Thread(new Runnable() {
				public void run()
				{
					mt.printOddNumber();
				}
			});

			
			t1.start();
			t2.start();
		}
	}