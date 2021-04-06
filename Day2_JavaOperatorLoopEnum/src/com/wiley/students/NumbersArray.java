package com.wiley.students;

import java.util.Arrays;
import java.util.Collections;

public class NumbersArray {

	public static void main(String[] args) {
		
		int arr[]= {34,67,12,80,91,52,73,13};
		// nested loops 8*8
		Arrays.sort(arr);
		for(int x:arr)
			System.out.print(x+", ");
		
	  
		
		String names[]= {"Gargesh","Neelkanth","Mayur","Ketan","Ratna","Manorama"};
		
		Arrays.sort(names);
		
		for(String s:names)
			System.out.println(s+", ");
		
		Student students[]=new Student[5];
		students[0]=new Student(34,"Chesta","science",87);
		students[1]=new Student(53,"Nannu","maths",69);
		students[2]=new Student(19,"Nimisha","science",71);
		students[3]=new Student(27,"Kilpz","english",60);
		students[4]=new Student(9,"KilpaHDGF","hindi",81);
		
		Arrays.sort(students);
		for(Student s: students)
			System.out.println(s);
	}

}
