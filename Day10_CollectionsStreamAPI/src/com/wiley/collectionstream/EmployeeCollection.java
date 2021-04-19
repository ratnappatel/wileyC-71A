package com.wiley.collectionstream;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeCollection {

	private static Employee[] emps={
			new Employee(1,"Jeff Bezos",100000.00),
			new Employee(2,"Pratik",200000.00),
			new Employee(3, "Bill Gates",300000.00),
			new Employee(4,"Neelkanth",450000.00)
	};
	
	public static void main(String[] args) {

		// 1. obtain list and stream outof array
		List<Employee> empList=Arrays.asList(emps);
		
		Map<Integer,Employee> eMap=empList.stream()
				.filter(e->e.getSalary()>200000.00 && e.getName().startsWith("B"))
				.collect(Collectors.toMap(e->e.getId(), e->e));
		
		System.out.println(eMap);
		
		// java 8 : method reference :: instance :: methodname e->sysout(e)
		empList.stream().forEach(System.out::println);
		
		
		
	}

}
