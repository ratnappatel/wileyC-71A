package com.wiley.dbConnect;

import java.util.List;

public class ReduceEmployee {

	public static void main(String[] args) {

		EmployeeList list=new EmployeeList();
		List<Employee> emps=list.addEmployees();
		
		
		double totalSalary=emps.stream().filter(e->e.getDeptId()==50).map(e->e.getSalary()).reduce(0.00,(s1,s2)->s1+s2);
		
		System.out.println("Total Salary of all employees in department 50 is : "+totalSalary);
		
		
		// list employee having minimum salary 
		
		double minSalary=emps.stream().mapToDouble(e->e.getSalary()).min().getAsDouble();
		System.out.println("Minimum Salary : "+minSalary);
		
	}

}
