package com.wiley.dsa.trees;


// removal of node having single child / no child
public class BinarySearchTreeDemo {

	static EmployeeNode root;
	public BinarySearchTreeDemo() {
		root=null;
	}
	static class EmployeeNode implements Comparable<EmployeeNode>
	{
		//must be comparable
		int id;
		String name;
		double salary;
		EmployeeNode left;
		EmployeeNode right;
		public EmployeeNode(int id) {
			this.id=id;
		}
		
		public EmployeeNode(int id,String name,double salary) {
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.left=null;
			this.right=null;
		}
		@Override
		public int compareTo(EmployeeNode that) {
			return this.id-that.id;
		}
		@Override
		public String toString() {
			return "EmployeeNode [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
		}
	}
	
	public EmployeeNode searchRec(EmployeeNode root2,int id)
	{
		EmployeeNode found=null;
		
		if(root2!=null && id==root2.id)
			found=root2;
		if(id<root2.id)
			found=searchRec(root2.left,id);
		else if(id>root2.id)
			found=searchRec(root2.right,id);
		
		return found;
	}
	
	public void insert(EmployeeNode node)
	{
		root=insertRec(root,node);
	}
	private EmployeeNode insertRec(EmployeeNode root2, EmployeeNode node) {
		if(root2==null)
			root2=node;
		if(node.id<root2.id)
			root2.left=insertRec(root2.left,node);
		else if(node.id>root2.id)
			root2.right=insertRec(root2.right,node);
		return root2;
	}
	
	// starts with left most leaf node --> parent --> right child
	public static void inorder()
	{
		inorderRec(root);
	}
	private static void inorderRec(EmployeeNode root2) {
		if(root2!=null)
		{
			inorderRec(root2.left);
			System.out.println(root2);
			inorderRec(root2.right);
		}
	}
	
	//Iterative Search
	public EmployeeNode searchItr(EmployeeNode root2,EmployeeNode node)
	{
		EmployeeNode found=null;
		while(root2!=null)
		{
			if(node.id==root2.id)
				found=root2;
			if(node.id<root2.id)
				root2=root2.left;
			else
				root2=root2.right;
		}
		return found;
	}
	// To Remove Node with Single Children /no children
	public EmployeeNode removeRec(EmployeeNode root2,int id)
	{
		if(root2==null)
			return root2;
		if(id<root2.id)
			root2.left=removeRec(root2.left,id);
		else if(id>root2.id)
			root2.right=removeRec(root2.right,id);
		else if(id==root2.id)
		{
			// 2. having single child to node 
			if(root2.left == null)
				return root2.right;
			else if(root2.right ==null)
				return root2.left;
			
			EmployeeNode minNode=inorderSuccessor(root2.right);
			root2.id=minNode.id;
			root2.name=minNode.name;
			root2.salary=minNode.salary;
			root2.right=removeRec(root2, id);
		
		}
		return root2;
	}
	
	
	private EmployeeNode inorderSuccessor(EmployeeNode root2) {
		EmployeeNode minNode=root2;
		
		while(root2.left!=null)
		{
			minNode=root2.left;
			root2=root2.left;
		}
		
		return minNode;
	}

	public static void main(String[] args) {
		
		BinarySearchTreeDemo bst=new BinarySearchTreeDemo();
		EmployeeNode e1=new EmployeeNode(36, "a1", 10000.00);
		EmployeeNode e2=new EmployeeNode(27, "b1", 20000.00);
		EmployeeNode e3=new EmployeeNode(19, "c1", 30000.00);
		EmployeeNode e4=new EmployeeNode(4, "d1", 40000.00);
		EmployeeNode e5=new EmployeeNode(81, "e1", 50000.00);
		EmployeeNode e6=new EmployeeNode(25, "f1", 60000.00);
		EmployeeNode e7=new EmployeeNode(3, "g1", 70000.00);
		
		
		bst.insert(e1);
		bst.insert(e2);
		bst.insert(e3);
		bst.insert(e4);
		bst.insert(e5);
		bst.insert(e6);
		bst.insert(e7);
		
		bst.inorder();
		
		EmployeeNode toSearch=new EmployeeNode(4);
		
		System.out.println("Searching for Employee with ID : 4");
		EmployeeNode found=bst.searchItr(root, toSearch);
		
		found=bst.searchRec(root, 4);
		
		
		if(found.left!=null )
			System.out.print(found.left.id+" --> ");
		
		System.out.print(found);
		
		if(found.right!=null)
				System.out.print(found.right.id);
		
			
			  System.out.println("\n\nRemoving Node having No children : id=4 ");
			  bst.removeRec(root, 4); System.out.println(""); bst.inorder();
			 
		
		}
	
}


// practice by adding removal of node having two children 

// 9:00 A.M TO 3:00 P.M 12:00 2HRS = KEPT FOR PRACTICE 1:00 P.M


