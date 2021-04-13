package com.wiley.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Student {

	private int id;
	private String name;
	private File file;
	
	public Student()
	{
		file=new File("studentList.doc");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details.");
		System.out.println("Student Id:");
		id=sc.nextInt();
		System.out.println("Student Name");
		name=sc.next();
	}
	public void writeStudentDetails()
	{
		try
		{
			//File file=new File("studentList.doc");
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
			dos.writeInt(id);
			dos.writeUTF(name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Data added to the file");
	}
	
	public void readStudentDetails()
	{
		try
		{
			//File file=new File("studentList.doc");
			DataInputStream dis=new DataInputStream(new FileInputStream(file));
			id=dis.readInt();
			name=dis.readUTF();
			System.out.println("Student Details from studentList.doc file is as below:");
			System.out.println("Student Id: "+id);
			System.out.println("Student Name: "+name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.writeStudentDetails();
		s1.readStudentDetails();

	}

}
