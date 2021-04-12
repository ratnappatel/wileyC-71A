package com.wiley.dst.arraylist1;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(1,"ratna","patel"));
		list.add(new Employee(2,"sapna","das"));
		list.add(new Employee(3,"gargesh","shah"));
		list.add(new Employee(4,"pinakin","patel"));
		list.add(new Employee(4,"ketan","joshi"));
		
		
		System.out.println(list);
		
		
	}

}
