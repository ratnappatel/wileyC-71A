package com.wiley.lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<Employee>();
		
		emps.add(new Employee(1, "Ratna", "Patel",4500.678, 20));
		emps.add(new Employee(25, "Kilpa", "Jain",1238.678, 30));
		emps.add(new Employee(126, "Mayur", "Shah",7645.98, 40));
		emps.add(new Employee(341, "Pujabhai", "Patel",735.8, 20));
		emps.add(new Employee(3, "John", "Smith",1437.678, 30));
		
		/*
		 * System.out.println(emps);
		 * 
		 * System.out.println("------------------------------------------------------");
		 * // enhanced-for loop for(Employee e:emps) System.out.println(e);
		 * System.out.println("-----------------------------------------------------");
		 * // iterator:iterate in forward direction / list-iterator[iterate in
		 * forward+backward] , Employee e; Iterator<Employee> itr=emps.iterator();
		 * 
		 * while(itr.hasNext()) { e=itr.next(); // return employee as Object type
		 * if(e.getDeptId()==20) emps.remove(e); else System.out.println(e);
		 * 
		 * } System.out.println(emps);
		 */

		ListIterator<Employee> litr=emps.listIterator();
		
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		// enumerator
	}

}
