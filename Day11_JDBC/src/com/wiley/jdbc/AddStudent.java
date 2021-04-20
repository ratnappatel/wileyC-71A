package com.wiley.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddStudent {

	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	int rollno;
	String name;
	
	
	public AddStudent()
	{
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root","Mysql@123");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void insert()


	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student RollNo.");
			rollno=sc.nextInt();
			System.out.println("Enter Student Name.");
			name=sc.next();
			
			pre=con.prepareStatement("insert into student1 values(?,?)");
			pre.setInt(1, rollno);
			pre.setString(2,name);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Student Details Committed..");
			else
				System.out.println("Student Details are Not Committed..");
			pre.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printStudentDetails()

	{
		try
		{
			stat=con.createStatement();
			res=stat.executeQuery("select * from student1");
			while(res.next())
			{
				System.out.println("Rollno : "+res.getInt("rollno"));
				System.out.println("Name : "+res.getString("name"));
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateStudentDetails()


	{
		try
		{
			pre=con.prepareStatement("update student1 set name=? where rollno=?");
			pre.setString(1, "ghanu");
			pre.setInt(2,679);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Name updated for rollno 111");
			else
				System.out.println("Name is not updated..");
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteStudentDetails()

	{
		try
		{
			pre=con.prepareStatement("delete from student1 where rollno=?");
			pre.setInt(1,111);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		AddStudent uttam=new AddStudent();
		uttam.insert();
		uttam.printStudentDetails();
		System.out.println("=======================================================");
		uttam.updateStudentDetails();
		uttam.printStudentDetails();
		uttam.deleteStudentDetails();
		uttam.printStudentDetails();
	}

}
