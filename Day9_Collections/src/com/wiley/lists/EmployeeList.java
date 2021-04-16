package com.wiley.lists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeList {

	public static void main(String[] args) {
		
		LinkedList<Employee> emps=new LinkedList<Employee>();
		
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
		 * forward+backward] ,
		 */		Employee e;
		
		
		/*
		 * List<Employee> list=Collections.synchronizedList(emps); Iterator<Employee>
		 * itr=list.iterator();
		 * 
		 * while(itr.hasNext()) { e=itr.next(); // return employee as Object type
		 * if(e.getDeptId()==20) { e.setDeptId(90); emps.add(e); // remove from
		 * iterating it /ignores while iterating } else System.out.println(e);
		 * 
		 * }
		 */
		// element of collection are linked to each other as prev-next node
		ListIterator<Employee> litr=emps.listIterator();
		while(litr.hasNext())
		{
			litr.next();
		}
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		// enumerator
	}

}
