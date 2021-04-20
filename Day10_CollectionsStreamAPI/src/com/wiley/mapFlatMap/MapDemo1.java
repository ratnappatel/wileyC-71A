package com.wiley.mapFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo1 {

	public static void main(String[] args) {

		List<String> vowels=Arrays.asList("a","e","i","o","u");
		
		 // to convert list element into uppercase
		
		vowels.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		
		
		List<String> greet=new ArrayList<String>();
		
		greet.add("Hi");
		greet.add("Hello");
		greet.add("Hey");
		greet.add("haye");
		
		
		List<String> postGreet=new ArrayList<String>();
		
		postGreet.add("how are you?");
		postGreet.add("are there?");
		postGreet.add("don't worry");
		postGreet.add("not a problem");
		
		
		// nested list of greet and post greet messages.
		
		
		List<List<String>> nestedGreet = Arrays.asList(greet,postGreet); //complex collection type collection of collection object
		
		
		nestedGreet.stream().map(e->e.stream().map(e1->e1.toUpperCase())).forEach(e->System.out.println(e.toString()));
		System.out.println("******************************************************");
		nestedGreet.stream().flatMap(list->list.stream()).map(msg-> msg.toUpperCase()).forEach(System.out::println);
		
		
		
		
		
		
	}

}
