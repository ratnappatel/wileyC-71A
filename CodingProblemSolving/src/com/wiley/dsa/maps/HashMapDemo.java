package com.wiley.dsa.maps;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,Integer> person=new HashMap<String,Integer>();
		
		person.put("A",34);
		person.put("B",27);
		person.put("C",12);
		
		System.out.println(person);
		person.put("A",11);
		
		System.out.println(person);
	}

}
