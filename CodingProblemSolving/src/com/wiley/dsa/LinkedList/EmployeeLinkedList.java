package com.wiley.dsa.LinkedList;

public class EmployeeLinkedList {
	
	// reference in java
	Employee head;
	private int size;
	int n;
	
	public EmployeeLinkedList()
	{
		size=0;
		head=null;
	}
	public EmployeeLinkedList(Employee employee,int size)
	{
		head=employee;
		this.size=size;
	}
	public void add(Employee employee)
 // O(
	{
		if(head==null)
			head=employee;
		else
		{
			//head.next=employee;
		
		Employee cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=employee;}
		size++;
	}
	public int getSize()
	{
		return size;
	}
	public String toString()

	{
		String str="";
		Employee cur=head;
		while(cur.next!=null)
		{
			str+="\n"+cur.toString();
			cur=cur.next;
		}
		return str;
	}

	public boolean search(Employee emp) //O(n)  worst-case i may find the element /data at the end of list , may find the data in middle of list / before middle of list
	{
		
		Employee cur=head;
		while(cur!=null)
		{
			n++;
			System.out.println(cur);
			if(cur.equals(emp))
			{
				System.out.println("iteration : "+n);
				return true;
			}
			cur=cur.next;
		}
		System.out.println("iteration : "+n);
		return false;
	}
}
