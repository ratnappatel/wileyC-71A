package com.wiley.maps;

import java.util.LinkedHashMap;

public class UniversityMap {

	public static void main(String[] args) {
		LinkedHashMap<Student,Stream> enrollment=new LinkedHashMap<Student, Stream>();
		
		enrollment.put(new Student(12,"abc"),new Stream("ECE",8));
		enrollment.put(new Student(25,"pqr"),new Stream("IT",6));
		enrollment.put(new Student(71,"xyz"),new Stream("CS",10));
		enrollment.put(new Student(12,"abc"),new Stream("EEE",6));
		enrollment.put(new Student(71,"xyz"),new Stream("MECH",10));
		
		System.out.println(enrollment);
	}

}
