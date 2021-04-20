package com.wiley.dbConnect;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEmps {

	public static void main(String[] args) {
		
		EmployeeList list=new EmployeeList();
		ArrayList<Employee> emps=list.addEmployees();
		
		System.out.println(emps);
		System.out.println("\n================================================================");
		
		Map<Integer,Double> avgSalary=emps.stream().collect(Collectors
						.groupingBy(Employee::getDeptId,
								Collectors
						.averagingDouble(Employee::getSalary)));
				//average salary department wise
		System.out.println(avgSalary);

		
		  Set<Integer> keys=avgSalary.keySet();
		  
		  for(Integer k:keys) // 2-times
			  emps.stream().filter(e->e.getDeptId()==k && e.getSalary()>avgSalary.get(k)).forEach(System.out::println);
		 
	}
}
