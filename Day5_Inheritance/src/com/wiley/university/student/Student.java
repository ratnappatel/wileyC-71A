package com.wiley.university.student;

import com.wiley.university.University;

public class Student extends University{
	private String hobby;
	private String mobileNo;
	public Student()
	{
		
	}
	
	public Student(int id, int marks, String semester, String name, String address, String hobby, String mobileNo) {
		super(id, marks, semester, name, address);
		this.hobby = hobby;
		this.mobileNo = mobileNo;
	}

	
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [hobby=" + hobby + ", mobileNo=" + mobileNo + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
