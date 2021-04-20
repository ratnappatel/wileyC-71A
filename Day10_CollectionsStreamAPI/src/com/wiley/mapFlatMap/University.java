package com.wiley.mapFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class University {

	public static void main(String[] args) {
		
		List<Student> computerDepartment=new ArrayList<Student>();
		computerDepartment.add(new Student(1,"computer1"));
		computerDepartment.add(new Student(2,"computer2"));
		computerDepartment.add(new Student(3,"computer3"));
		
		
		List<Student> mechanicalDepartment=new ArrayList<Student>();
		mechanicalDepartment.add(new Student(10,"mechanical1"));
		mechanicalDepartment.add(new Student(20,"mechanical2"));
		mechanicalDepartment.add(new Student(30,"mechanical3"));
		mechanicalDepartment.add(new Student(40,"mechanical4"));
		
		
		List<List<Student>> allStudents=Arrays.asList(computerDepartment,mechanicalDepartment);
		//count no of student available in each department 
		
		long noOfStudents=allStudents.stream().count();
		List<Student> cs=allStudents.stream().flatMap(l->(l.stream())).collect(Collectors.toList());
		
		List<Stream<Student>> cs1=allStudents.stream().map(l->(l.stream())).collect(Collectors.toList());
		
		System.out.println(cs);
		cs1.forEach(System.out::println);
		
		long nos=allStudents.stream().flatMap(d->d.stream()).map(s->s).count(); // resulting as aggregate output
		
		System.out.println("No. of Student : "+noOfStudents);
		System.out.println("No. of Student : "+nos);
		
		// optional interface provides null saftey 
		
		//Optional.of("String").map(s->String::toUpperCase); //map operation implementation does not wrap internally
		
		
	}

}
