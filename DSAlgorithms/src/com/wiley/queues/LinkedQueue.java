package com.wiley.queues;

public class LinkedQueue {

	Node front;
	Node rear;
	int size;
	
	public LinkedQueue() {
		front=rear=new Node();
	}
	class Node
	{
		int data;
		Node next;
		Node()
		{
			this(0);
		}
		Node(int data)
		{
			this(data,null);
		}
		Node(int data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
	public int dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is Empty..");
		
		Node temp=front.next;
		int rValue=temp.data;
		front.next=front.next.next;
		temp=null;
		size--;
		
		if(isEmpty())
			front=rear;
		
		return rValue;
	}
	public boolean enqueue(int data)
	{
		Node newNode=new Node(data);
		rear.next=newNode;
		rear=newNode;
		
		size++;
		
		return true;
	}
	public boolean isEmpty()
	{
		return size ==0;
	}
	
	public String toString()
	{
		if(isEmpty())
			return"[]";
		StringBuilder sb=new StringBuilder();
		Node curr=front.next;
		sb.append("[");
		while(curr!=null)
		{
			sb.append(curr.data).append(", ");
			curr=curr.next;
		}
		sb.replace(sb.length()-2,sb.length(), "]");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		LinkedQueue lq=new LinkedQueue();
		lq.enqueue(11);
		lq.enqueue(12);
		lq.enqueue(13);
		lq.enqueue(14);
		
		System.out.println(lq);
		
		lq.dequeue();
		System.out.println("After Dequeue :\n"+lq);
		

	}

}
