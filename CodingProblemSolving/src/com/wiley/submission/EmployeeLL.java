package com.wiley.submission;

import java.util.LinkedList;
import java.util.List;

public class EmployeeLL {

	static Node head;
	private int size;
	static Node cur;
	static EmployeeLL list;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public EmployeeLL(Node head, int size) {
		super();
		this.head= head;
		this.size=size;
	}

	public EmployeeLL() {
			head=null;
			cur =null;
	}

	public static void insert(Node add) {
		
		if(head == null) {
			head = add;
		}
		else {
			cur = head;
			while(cur.next!=null) {
				cur = cur.next;
			}
			cur.next = add;			
		}
		
	}
	
	
	public static void delete(Node del) {
	
		if(head==null) {
			System.out.println("no ele");
		}
		else if(head.next !=null){
			cur= head.next;
			head= cur;
		}
		 else {
			 if(del.next == null)
				 del = null;
			 
			 del.setData(del.next.getData());
			 del.next = del.next.next;
			 
//			 cur = head;
//			 Node prev = cur;
//			 while(cur.next != null) {
//				 if(del.getData() == cur.getData()) {
//					 prev.next = cur.next;
//				 }
//				 prev = cur;
//				 cur = cur.next;
//			 }
		 }
	}
	
	public static void print() {
		System.out.println(list);
	}
	
	

	@Override
	public String toString() {
		String str="";
		Node cur=head;
		
		while(cur.next!=null)
		{
			str+="\n"+cur.toString();
			cur=cur.next;
		}
		str+="\n"+cur.toString();
		return str;
	}

	public static void main(String[] args) {
		
		list = new EmployeeLL();
		
		Node b = new Node(43);
		list.insert(b);
		list.insert(new Node(12));
		//list.insertHead(); //
		/*
		 * Node a = new Node(54); list.insert(a); list.insert(new Node(2));
		 * list.insert(new Node(76)); list.insert(new Node(90));
		 */
	    System.out.println("Element inserted");
		
		list.print();
		list.delete(b); // delete node as 43 it must be at head position
		System.out.println("====================");
		list.print();
	}

}
