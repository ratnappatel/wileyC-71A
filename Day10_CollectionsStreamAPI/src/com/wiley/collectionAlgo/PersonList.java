package com.wiley.collectionAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Person
{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class PersonList {

	public static void main(String[] args) {
		
		// how to convert array of object into list
		Person p[]=new Person[5];
		List<Person> persons=new ArrayList<Person>(Arrays.asList(
													new Person("Jone",17),
													new Person("Sam",25),
													new Person("Dan",20),
													new Person("William",10),
													new Person("Joe",20)));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Sort by \n1. Age \n2. Name  ?");
		int ch=sc.nextInt();
		if(ch==1)
			Collections.sort(persons, new Comparator<Person>() { // defining anonymous class for overriding compare method a way till java 7
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getAge()-p2.getAge();
				}
			});
		else if(ch==2)
			Collections.sort(persons,(p1, p2)->p1.getName().compareTo(p2.getName())); //better readable and simple , reduces code length
		
		System.out.println(persons);
	} 

}
