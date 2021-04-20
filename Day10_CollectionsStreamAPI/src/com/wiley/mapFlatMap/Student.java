package com.wiley.mapFlatMap;

public class Student {

	private int rollno;
	private String subject;
	
	public Student(int rollno, String subject) {
		super();
		this.rollno = rollno;
		this.subject = subject;
	}
	public int getRollno() {
		return rollno;
	}
	public String getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", subject=" + subject + "]";
	}
	
}
