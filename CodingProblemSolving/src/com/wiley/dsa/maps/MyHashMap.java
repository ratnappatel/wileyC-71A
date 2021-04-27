package com.wiley.dsa.maps;



// 
public class MyHashMap {
	
	int size;
	LinkedList[] buckets;
	
	public MyHashMap(int size) {
		this.size=size;
		buckets=new LinkedList[this.size];
		for(int i=0;i<size;i++)
			buckets[i]=new LinkedList();
	}
	
	public int hashing(int key)
	{
		// custom logic to generate hash value
		int hash=key%size; //34%7 = 6 
		if(hash<0)
			hash+=size;
		return hash;
	}
	public void insertHash(int key)
	{
		int hash=hashing(key);
		buckets[hash].insert(key);
	}
	
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print("Bucket [ "+i+"] = ");
			System.out.println(buckets[i].display());
		}
	}
	

	public static class LinkedList
	{
		private Node first; //34 : 6 
		public LinkedList() {
			first=null;
		}
		
		public String display()
		{
			return display(first);
		}
		public String display(Node first) {
			if(first==null)
					return null;
			else
				return first.getKey()+"-->"+display(first.getNext());
		}
		
		public void insert(int key)
		{
			if(isEmpty()) {
				first=new Node(key);
			return;}
			Node temp=findEnd(first);
			temp.setNext(new Node(key)); // the java way of hashmap collision outcome
		}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return first==null;
	}
	public Node findEnd(Node first) {
			if(first.getNext()==null)
				return first;
			else
				return findEnd(first.getNext());
	}
	
}
	
}
class Node
{
	int key;
	Node next;

	// REAL TIME OBJECT / GENERICS
	public Node(int key) {
		super();
		this.key = key;
	}

	public void setNext(Node node) {
		this.next=node;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	
	
}