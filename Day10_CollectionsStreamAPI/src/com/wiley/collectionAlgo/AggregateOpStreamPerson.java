package com.wiley.collectionAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggregateOpStreamPerson {

	public static void main(String[] args) {
		
		List<Person> persons=new ArrayList<Person>(Arrays.asList(
				new Person("Jone",17),
				new Person("Sam",25),
				new Person("Dan",20),
				new Person("William",10),
				new Person("Joe",20)));
		
		int od=persons.parallelStream().filter(p->p.getName()
										.contains("a"))
										.mapToInt(Person::getAge)
										.sum();// Person object
		
		/*
		 * if(od.isPresent()) System.out.println("The Average age is : "+od.getAsInt());
		 * else System.out.println("Collection does not contain any age value");
		 */
		
		System.out.println("Totla age is :"+od);


	}

}


// total an age of all person whose name contains a char 
