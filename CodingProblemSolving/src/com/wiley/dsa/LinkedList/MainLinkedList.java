package com.wiley.dsa.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		EmployeeLinkedList list=new EmployeeLinkedList();
		System.out.println("size of the Linked List is:"+list.getSize());
		
		list.add(new Employee("Ratna","Patel",101));
		list.add(new Employee("Uttam","Patel",209));
		list.add(new Employee("pinakin","Patel",298));
		list.add(new Employee("ketan","parmar",253));
		list.add(new Employee("Gargesh","Shah",153));
		list.add(new Employee("Neelkanth","Jain",735));
		
		System.out.println("size of the Linked List is:"+list.getSize());
		System.out.println(list+"\n");
		
		System.out.println(list.search(new Employee("Neelkanth","Jain",735)));
	}

}
/*
 * to implement remove method with complexity analysis
 * implement remove -head method  complexity
 */
