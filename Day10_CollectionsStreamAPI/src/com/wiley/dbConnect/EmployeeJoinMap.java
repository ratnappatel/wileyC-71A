package com.wiley.dbConnect;

import java.util.List;
import java.util.stream.Collectors;

// resulting employee details as single string object by concatenating all field values 
//: while sending all records as return object by any function

// map to perform conversion 

public class EmployeeJoinMap {

	public static void main(String[] args) {
		EmployeeList list=new EmployeeList();
		List<Employee> emps=list.addEmployees();
		
		
		// stream api operation can work on object an not on primitives
		
		String result=emps.stream().filter(e->e.getDeptId()==30).map(e-> Integer.toString(e.getId())).collect(Collectors.joining());
		
		String result1=emps.stream().filter(e->e.getDeptId()==30).map(e->e.toString()).collect(Collectors.joining(" $$ "));
		
		System.out.println(result1);
		

	}

}
/*
 *  to send entire collection as single object to ui javascript method  JSON object
 *  
 *  :
 */
