package com.wiley.divideAndConquer;


public class MergeLinkedLists {
	
	static class Node
	{
		int value;
		Node next;
	}
		 
	static Node newNode(int value) // EmployeeLinkedList
		{
			Node temp=new Node();
			temp.value=value;
			temp.next=null;
			return temp;
		}
	
	public static Node mergeList(Node head1,Node head2) // passed in sorted sequence
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
				p1Prev.next=p2; // add last don't need to compare
		return head1.value<head2.value ? head1 : head2;
	}
	static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
	public static void main(String[] args) {
			
		Node head1=newNode(23); // lowest element
		head1.next=newNode(35);
		head1.next.next=newNode(47);
		head1.next.next.next=newNode(67);
		
		Node head2=newNode(91);
		head2.next=newNode(96);
		head2.next.next=newNode(98);
		Node mergedList=mergeList(head1,head2);
		printList(mergedList);
	}
}
