package com.wiley.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person
{
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
public class PersonComparison {

	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		
		persons.add(new Person(12,"Sarah"));
		persons.add(new Person(10,"Saurabh"));
		persons.add(null);
		persons.add(new Person(29,"Rinku"));
		persons.add(new Person(45,"Gayatri"));
		
		System.out.println(persons+"\n");
		
		/*
		 * List<Person>
		 * sortedPersons=persons.stream().sorted(Comparator.comparingInt(Person::getAge)
		 * ).collect(Collectors.toList());
		 * 
		 * System.out.println(sortedPersons+"\n\nReverse Ordered  List\n");
		 * 
		 * List<Person>
		 * rSortedPersons=persons.stream().sorted(Comparator.comparing(Person::getAge,
		 * Comparator.reverseOrder())).collect(Collectors.toList());
		 */
		
		
//		System.out.println(rSortedPersons);
		// query in interview to handle null entry while sorting any collection
		
		System.out.println("\n\n Considering Nulls as First [nulls as lesser than non-null value]");
		persons.sort(Comparator.nullsFirst(Comparator.comparing(Person::getAge)));
		
		System.out.println(persons);
		
		
		System.out.println("\n \n Considering Nulls as Last[nulls are greater than non-null value]");
		persons.stream().sorted(Comparator.nullsLast(Comparator.comparingInt(Person::getAge))).forEach(System.out::println);
		
	}

}











