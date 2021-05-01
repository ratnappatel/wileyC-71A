package com.wiley.dsa.trees;

public class BinaryTree {
	private Node root;
	private int size=0;
	public BinaryTree() {
		root=null;
	}
	
	public void add(int data)
	{
		size++;
		Node newNode=new Node(data);
		if(root==null)
			root=newNode;
		else
		{
			Node parent=find(data);
			if(data<parent.data)
			{
				parent.left=newNode;
				parent.left.parent=parent;
				return;
			}
			else 
			{
				parent.right=newNode;
				parent.right.parent=parent;
				return ;
			}
		}
	}
	
	public int getSize()
	{
		return size;
	}
	public Node find(int data)
	{
		Node curr=root;
		while(curr!=null)
		{
			if(data<curr.data)
			{
				if(curr.left==null) 
					return curr;
				curr=curr.left;
			}
			else if(data>curr.data)
			{
				if(curr.right==null)
						return curr;
				curr=curr.right;
			}
			else
				return curr;
		}
		return curr;
	}
	
	
	public void inOrder()
	{
		System.out.println("Total Elements are : "+size);
		System.out.print(root.data+"\n");
		Node temp=root.left;
		while(temp!=null)
		{
			System.out.print(temp.data+"   ");
			if(temp.right!=null)
			{
				while(temp.right!=null)
				{
					System.out.print(temp.data+"  ");
					temp=temp.right;
				}
			}
			temp=temp.left;
		}
		System.out.println("");
		  Node temp1=root.right;
		  while(temp1!=null)
		  {
			  System.out.print(temp1.data+"   "); 
			  if(temp.left!=null)
				{
					while(temp.left!=null)
					{
						System.out.print(temp.data+"  ");
						temp=temp.left;
					}
				}
			  temp1=temp1.right;
		  }
		 
		/*
		 * Node localRoot=find(data); if(localRoot!=null) {
		 * inOrder(localRoot.right.data); System.out.print(localRoot.data+" <-- ");
		 * inOrder(localRoot.left.data); }
		 */
		}

	public static void main(String[] args) {
		BinaryTree tree1=new BinaryTree();
		tree1.add(10);
		tree1.add(7); //left to 10
		tree1.add(15); //right to 10
		tree1.add(4); //left to 7
		tree1.add(2); // left to 4
		tree1.add(12); // left[child] to 15 
		tree1.add(18); // 12 left & 18 right of 15
		tree1.add(5); // left to 7 and parent to 4
		
		tree1.inOrder();
	}

}
class Node
{
	public int data;
	public Node left;
	public Node right;
	public Node parent;

	public Node(int data) //root node
	{
		this.data=data;
		left=null;
		right=null;
		parent=null; // parent != root in binary tree 
	}
}