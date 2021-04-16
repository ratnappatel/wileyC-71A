package com.wiley.sets;

import java.util.HashSet;

public class FollowerList {

	public static void main(String[] args) {
		HashSet<Followers> followers=new HashSet<Followers>();
		
		followers.add(new Followers(23,"Abdul","Music"));
		followers.add(new Followers(45,"Iliyaz","Dance"));
		followers.add(new Followers(87,"Vaibhav","Yoga"));
		followers.add(new Followers(23,"Abdul","Music"));
		
		System.out.println(followers);
	}

}

// compare natural data types in java 8-primitive[wrapper] + string 
