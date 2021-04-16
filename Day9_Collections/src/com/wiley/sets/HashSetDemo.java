package com.wiley.sets;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		// its an implementation of set type it gurantees unique elements collection 
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ratna");
		System.out.println(hs.add("Uttam"));
		hs.add("Pinakin");
		hs.add("Bihari");
		hs.add("Manorama");
		System.out.println(hs.add("Uttam"));
		hs.add("Pinakin");
		hs.add("Bihari");
		hs.add("Manorama");
		hs.add("Ketan");
		
		System.out.println(hs);
	}

}
