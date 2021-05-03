package com.wiley.queues;

public class Queues {

	// A queue backed by an array data structure
	
	
	
	
	public static void main(String[] args) {

		Queue q1=new Queue(); // FIFO
		q1.enqueue(10);
		q1.enqueue(2);
		q1.enqueue(5);
		q1.enqueue(3);
		
		System.out.println("The Size of Queue : "+q1.items);
		System.out.println(q1);
		
		q1.dequeue();
		System.out.println("After Dequeue . "+q1);
		
		
		
		
	}

}
class Queue
{
	final static int DEFAULT_CAPACITY=10;
	int maxSize;
	int [] queueArray;
	int front;
	int rear;
	int items;
	
	public Queue()
	{
		this(DEFAULT_CAPACITY);
	}
	public Queue(int size)
	{
		maxSize=size;
		queueArray=new int[size];
		front=0;
		rear=-1;
		items=0;
	}
	public boolean enqueue(int n)
	{
		if(isFull())
			return false;
		rear=(rear+1)%maxSize;
		queueArray[rear]=n;
		items++;
		return true;
		
	}
	
	public int dequeue()
	{
		if(isEmpty())
			return -1;
		int temp=queueArray[front];
		front=(front+1)%maxSize;
		items--;
		return temp;
	}
	public boolean isEmpty()
	{
		return items==0;
	}
	
	public boolean isFull()
	{
		return items==maxSize;
	}
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for(int i=front; ;i = ++i % maxSize)
		{
			sb.append(queueArray[i]).append(", ");
			if(i==rear)
				break;
			
		}
		sb.replace(sb.length()-2, sb.length(), "]");
		return sb.toString();
	}
}