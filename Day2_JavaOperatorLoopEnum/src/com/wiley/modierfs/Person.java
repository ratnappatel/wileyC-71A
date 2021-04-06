package com.wiley.modierfs;


// containing data initialization , modification , data display logic 
public class Person {
	
	private String name; // getter-read property /setter-update property
	private int id;
	
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString()
	{
		return "\nId : "+id+"    Name : "+name;
	}
	
}
