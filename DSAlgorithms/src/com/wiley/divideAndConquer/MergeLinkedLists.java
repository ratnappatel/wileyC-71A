package com.wiley.divideAndConquer;


public class MergeLinkedLists {
	
	static class Node
	{
		int value;
		Node next;}
		static Node newNode(int value)
		{
			Node temp=new Node();
			temp.value=value;
			temp.next=null;
			return temp;
		}
	
	public static Node mergeList(Node head1,Node head2)
	{
		Node p1=head1;
		Node p1Prev=null;
		Node p2=head2;
		while(p1!=null && p2!=null)
		{
			if(p1.value<p2.value)
			{
				p1Prev=p1;
				p1=p1.next;
			}
			else 
			{
				if(p1Prev !=null)
					p1Prev.next=p2;
				p1Prev=p2;
				p2=p2.next;
				p1Prev.next=p1;
			}
		}
		if(p1==null)
				p1Prev.next=p2;
		return head1.value<head2.value? head1 : head2;
	}
	static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
	public static void main(String[] args) {
			
		Node head1=newNode(1);
		head1.next=newNode(3);
		head1.next.next=newNode(5);
		
		Node head2=newNode(0);
		head2.next=newNode(2);
		head2.next.next=newNode(4);
		Node mergedList=mergeList(head1,head2);
		printList(mergedList);
	}
}
