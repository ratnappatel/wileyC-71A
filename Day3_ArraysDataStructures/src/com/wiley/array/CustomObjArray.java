package com.wiley.array;

public class CustomObjArray {

	public static void main(String[] args) {
		
		Node nodes[]=new Node[5]; // array of custom object : default is null
		nodes[0]=new Node("A",1);
		
		nodes[1]=new Node("B",2);
		nodes[2]=new Node("C",3);
		nodes[3]=new Node("D",4);
		nodes[4]=new Node("E",5);
		
		for(int i=0;i<=5;i++)
			System.out.println(nodes[i].node+"   @  "+nodes[i].next);
	}

}
class Node
{
	String node;
	int next;
	
	public Node() {}
	public Node(String node,int next)
	{
		this.node=node;
		this.next=next;
	}
}


//no.of bytes required by one node object is not known by JVM



