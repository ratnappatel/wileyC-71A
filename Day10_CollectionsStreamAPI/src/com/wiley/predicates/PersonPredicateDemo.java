package com.wiley.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
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

public class PersonPredicateDemo {

	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		
		persons.add(new Person(12,"Sarah"));
		persons.add(new Person(10,"Saurabh"));
	//	persons.add(null);
		persons.add(new Person(11,"Taun"));
		persons.add(new Person(29,"Rinku"));
		persons.add(new Person(45,"Gayatri"));
		persons.add(new Person(27,"Surabhi"));
		
		Predicate<Person> isMinor= p-> p.getAge()<18;
		
		Predicate<Person> startsS=p->p.getName().startsWith("S");
		
		
		Integer id=100;
		
		Function<Integer,Integer> ids= i-> i+1;
		
		// create multiple predicates to be applied to single filter operation by using predicate method
		persons.stream().filter(isMinor).forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		
		persons.stream().filter(isMinor.and(startsS)).forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		
		
		persons.stream().filter(isMinor.negate().and(startsS)).forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		
		
		persons.stream().filter(isMinor.and(startsS.negate())).forEach(System.out::println);
		
		
	}

}









