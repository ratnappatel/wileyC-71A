package com.wiley.university;

public class University {
	private int id;
	private int marks;
	private String semester;
	private String name;
	private String address;
	public University() {}
	public University(int id, int marks, String semester, String name,String address) {
		super();
		this.id = id;
		this.marks = marks;
		this.semester = semester;
		this.name = name;
		this.address=address;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", marks=" + marks + ", semester=" + semester + ", name=" +
	name + ", address="+address+"]";
	}
	
	private void addMarks(int id,int marks)
	{
		if(this.id==id)
			this.marks=marks;
	}

	public void changeAdrress(int id,String address)
	{
		if(this.id==id)
			this.address=address;
	}
}
