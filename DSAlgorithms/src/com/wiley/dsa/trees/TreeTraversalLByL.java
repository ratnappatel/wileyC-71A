package com.wiley.dsa.trees;

public class TreeTraversalLByL {

	// Function to print all nodes of a given level from left to right
	 public static boolean printLevel(Nodes root, int level)
	 {
	     // base case
	     if (root == null) {
	         return false;
	     }

	     if (level == 1)
	     {
	         System.out.print(root.key + " ");

	         // return true if at least one node is present at a given level
	         return true;
	     }

	     boolean left = printLevel(root.left, level - 1);
	     boolean right = printLevel(root.right, level - 1);

	     return left || right;
	 }

	 // Function to print level order traversal of a given binary tree
	 public static void levelOrderTraversal(Nodes root)
	 {
	     // start from level 1 — till the height of the tree
	     int level = 1; //logical index to the level of tree 

	     // run till `printLevel()` returns false
	     while (printLevel(root, level)) {
	         level++;
	     }
	 }

	 public static void main(String[] args)
	 {
	     Nodes root = new Nodes(15);
	     root.left = new Nodes(10);
	     root.right = new Nodes(20);
	     root.left.left = new Nodes(8);
	     root.left.right = new Nodes(12);
	     root.right.left = new Nodes(16);
	     root.right.right = new Nodes(25);

	     levelOrderTraversal(root);
	 }

}
//A class to store a binary tree node
class Nodes
{
 int key;
 Nodes left = null, right = null;

 Nodes(int key) {
     this.key = key;
 }
}
