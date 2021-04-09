package com.wiley.university;
import com.wiley.university.student.Student;

public class StudentApp {

	public static void main(String[] args) {
		University u; //reference var of base type
		
		u=new Student(243, 205, "3rd", "Uttam", "2/5 Heerabagh Flats", "Watching TV", "7976694711");
		u.changeAdrress(243, "New-Address");
		
		
		
		u=new University(111, 645, "4th", "Dipti","507-Dwarika Apartment");
		//u.addMarks(0, 0);
	}

}


//encapsulation : default,private , protected  only are not sufficient to implement encapsulation