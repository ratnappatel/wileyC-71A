package com.wiley.collectionstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CreateFunction {

	public static void main(String[] args) {
		List<Employee> emps=Arrays.asList(
				new Employee(1,"Jeff Bezos",100000.00),
				new Employee(2,"Pratik",200000.00),
				new Employee(3, "Bill Gates",300000.00),
				new Employee(4,"Neelkanth",450000.00)
		);
		
		Function<Employee,Double> func=(Employee e)->{return e.getSalary();};
		
		List<Double> salaries=new ArrayList<Double>();
		
		for(Employee e:emps)
			salaries.add(func.apply(e));
		
		System.out.println(salaries);
		

	}

}
