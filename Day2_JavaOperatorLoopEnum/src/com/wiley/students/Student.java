package com.wiley.students;

public class Student implements Comparable{
	private int rollno;
	private String name;
	private String subject;
	private int marks;
	public Student(){}
	public Student(int rollno, String name, String subject, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nStudent [rollno=" + rollno + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
	
	@Override // this.compareTo(obj)
	public int compareTo(Object obj)
	{
		Student s=(Student)obj;
		//return this.rollno-s.rollno;
		int r=s.name.compareTo(this.name);
		return r;
	}
}
