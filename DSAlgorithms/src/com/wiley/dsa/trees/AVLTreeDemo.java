package com.wiley.dsa.trees;

import java.util.Arrays;

class AVLNode
{
	int data;
	AVLNode left=null,right=null;
	 AVLNode(int data) {
		this.data=data;
	}
}

public class AVLTreeDemo {

	
	public static void main(String[] args) {
		int keys[]= {15,10,20,12,16,25,8};
		
		//convert to AVLTree /BBST
		AVLNode root= convertToAVL(keys);
		AVLTreeDemo avl=new AVLTreeDemo();
		avl.inorder(root);
		
	}
	public static AVLNode convertToAVL(int[] keys) {
		Arrays.sort(keys);
		return convert(keys,0,keys.length-1,null);
	}
	public static AVLNode convert(int[] keys, int low, int high, AVLNode root) 
	{
		
		if(low>high)
			return root;
		
		//find the middle element of the current array
		// DIVIDE AND CONQUER STRATEGIE
		int mid=(low+high)/2; // narrowing conversion assigning floor value to mid
		
		root = new AVLNode(keys[mid]);
		
		// left subtree of the root <middle element root.left/right is reflecting parent node
		root.left=convert(keys,low,mid-1,root.left);
		
		//right subtree of root 
		root.right=convert(keys,mid+1,high,root.right);
		
		return root;
	}

public void inorder(AVLNode root)
{
	if(root == null)
		return;
	inorder(root.left);
	
	if(root.left!=null)
		System.out.print("\n"+root.left.data+" <-- ");
	System.out.print(root.data);
	if(root.right!=null)
		System.out.print(" --> "+root.right.data+"\n\n");
	
	inorder(root.right);
}

}
