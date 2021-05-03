package com.wiley.queues;

import com.wiley.queues.LinkedQueue.Node;

public class PriorityQueue1 {
	
	Node front,rear;
	int size=0;
	public PriorityQueue1() {
		front=rear=new Node();
	}

	class Node
	{
		int data;
		int priority;
		Node next;
		Node()
		{
			this(0,0);
		}
		Node(int data,int priority)
		{
			this(data,priority,null);
		}
		Node(int data,int priority,Node next)
		{
			this.data=data;
			this.priority=priority;
			this.next=next;
		}
	}
	public boolean enqueue(int data,int priority)
	{
		Node newNode=new Node(data, priority);
		Node f=front;
		while(f!=null)
		{
			if(f.priority<newNode.priority)
			{
				newNode.next=f;
				f=newNode;
				break;
			}
		}
		rear.next=newNode;
		rear=newNode;
		size++;
		System.out.println("addedd  :"+data);
		return true;
	}
	public String dequeue()
	{
		if(rear==front)
			System.out.println("Queue is Empty ..");
		
		Node temp=front;
		front=front.next;
		int rValue=temp.data;
		int p=temp.priority;
		temp=null;
		
		return rValue+" : "+p;
	}
	
	public void print()
	{
		Node curr=front.next;
		System.out.print("[");
		while(curr!=null)
		{
			System.out.print(curr.data+" : "+curr.priority+", ");
			curr=curr.next;
		}
		System.out.print(" ] ");
		
	}
	public static void main(String[] args) {
		PriorityQueue1 q1=new PriorityQueue1();
		q1.enqueue(3, 10);
		q1.enqueue(10, 4);
		q1.enqueue(5, 8);
		q1.enqueue(6, 6);
		
		System.out.println("Before Deque");
		System.out.println("Size of Dequeue is "+q1.size);
	//	q1.print();
		
		System.out.println("\nBefore Deque");
		
		q1.enqueue(2, 15);
		System.out.println("Size of Dequeue is "+q1.size);
		//q1.print();
		
		System.out.println(q1.dequeue());
		System.out.println("Size of Dequeue is "+q1.size);
	}

}
