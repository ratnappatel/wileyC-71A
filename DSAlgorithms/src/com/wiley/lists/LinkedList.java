package com.wiley.lists;

public class LinkedList {

	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	// Inserting node in middle of list
	
	public void insertInMiddle(int data,int node1,int node2)
	{
		Node curr=head;
		Node prev=null;
		Node newNode=new Node(data);
		while(curr!=null)
		{
			if(curr.data==node2)
			{
				newNode.next=curr;
				prev.next=newNode;
				break;
			}
			else
			{
				prev=curr;
				curr=curr.next;
			}
		}
		
	}
	
	public void insertBeg(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
		
	}
	public void insertLast(int data)
	{
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		Node node=new Node(data);
		curr.next=node;
	}
	
	public void deleteLastNode()
	{
		Node curr=head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=null;
	}
	public void deleteHeadNode()
	{
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			Node temp=head;
			head=temp.next;
			temp.next=null;
			temp.data=0;
		}
	}
	public void deleteMiddleNode(int data)
	{
		Node curr=head;
		Node pre=null;
		while(curr.next!=null)
		{
			if(curr.data==data)
			{
				pre.next=curr.next;
				curr.next=null;
			}
			else
			{
				pre=curr;
				curr=curr.next;
			}
		}
			
	}
	
	public void printList()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" --> ");
			//if(curr.next!=null)
				curr=curr.next;
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insertBeg(7);
		list.insertBeg(5);
		list.insertBeg(3);
		list.insertBeg(11);
		
		list.printList(); // 11->3->5->7
		
		/*
		 * list.deleteHeadNode(); System.out.println("After Deleting First Node...\n");
		 * list.printList();
		 */
		
		/*
		 * list.deleteLastNode(); System.out.println("After Deleting Last Node...\n");
		 * list.printList();
		 */
		/*System.out.println("\nAfter Deletion The list is as below:\n");
		list.deleteMiddleNode(5);
		list.printList();*/
		
		/*System.out.println("\nAfter Deletion The list is as below:\n");
		list.deleteMiddleNode(3);
		list.printList();*/
		System.out.println("\nAfter Inserting Nde in Middle .\n");
		list.insertInMiddle(6, 3, 5);
		
		list.printList();
		

	}

}
