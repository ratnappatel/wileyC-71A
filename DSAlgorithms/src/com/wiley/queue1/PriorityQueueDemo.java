package com.wiley.queue1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		pq1.add(50);
		pq1.add(30);
		
		pq1.add(20);
		pq1.add(15);
		pq1.add(10);
		pq1.add(8);
		pq1.add(16);
		
		Iterator<Integer> itr=pq1.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" -- > ");
		}
	}

}
