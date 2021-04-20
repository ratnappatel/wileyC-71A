package com.wiley.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class StatementPreparedStatementDemo {
	
	Connection con;
	Statement stat;
	int rollno;
	String name;
	PreparedStatement pre;
	
	public StatementPreparedStatementDemo()
	{
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root","Mysql@123");
			System.out.println("connected....");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student rollno.");
			rollno=sc.nextInt();
			System.out.println("Enter Student Name");
			name=sc.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void insertStatement()

	{
		try
		{
			stat=con.createStatement();
			int ra=stat.executeUpdate("insert into student1 values("+rollno+",'"+name+"')");
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void insertPreStatement(){
		try
		{
			pre=con.prepareStatement("insert into student1 values(?,?)");
			pre.setInt(1,rollno);
			pre.setString(2,name);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		StatementPreparedStatementDemo s=new StatementPreparedStatementDemo();
		//s.insertStatement();
		s.insertPreStatement();
	}

}
