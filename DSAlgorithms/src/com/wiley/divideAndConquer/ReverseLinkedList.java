package com.wiley.divideAndConquer;


public class ReverseLinkedList {

	
	static Node reverse(Node node)
	{
		Node prev=null;
		Node curr=node;
		Node next=null;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node=prev;
		return node;
	}
	public static void print(Node node)
	{
		while(node!=null)
		{
				System.out.print(node.data+"  ");
				node=node.next;
		}
		
	}
	public static void main(String[] args) {
		Node head1=newNode(23); // lowest element
		head1.next=newNode(35);
		head1.next.next=newNode(47);
		head1.next.next.next=newNode(67);
		Node newHead=ReverseLinkedList.reverse(head1);
		ReverseLinkedList.print(newHead);
		
		

	}
	static Node newNode(int value) // EmployeeLinkedList
	{
		Node temp=new Node(value);
		temp.data=value;
		temp.next=null;
		return temp;
	}

}
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}
