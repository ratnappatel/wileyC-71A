package com.wiley.io;

import java.io.Serializable;

public class Person implements Serializable{

	private int id;
	private String name;
	private transient String gender;
	public Person(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", Gender = "+gender+", name=" + name + "]";
	}
	
	
}
