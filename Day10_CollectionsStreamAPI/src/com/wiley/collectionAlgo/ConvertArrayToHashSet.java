package com.wiley.collectionAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertArrayToHashSet {

	public static void main(String[] args) {
		String [] arr= {"G","C","Y","D","W","A","C","Y","D"};
		Set<String>  set=new HashSet<String>(Arrays.asList(arr));
		
		System.out.println(set);
		
		String result[]=new String[set.size()];
		
		set.toArray(result); // returned as array of java.lang.object type
		
		
		Person [] p= {
				new Person("Jone",17),
				new Person("Sam",25),
				new Person("Dan",20),
				new Person("William",10),
				new Person("Joe",20)};
		
		List<Person> ps=new ArrayList<Person>(Arrays.asList(p));
		
		Person[] persons=new Person[ps.size()]; // array must be initialized with its size in advance
		
		ps.toArray(persons); 
		
		for(Person p1: persons)
			System.out.println(p1);
		
		
	}

}
