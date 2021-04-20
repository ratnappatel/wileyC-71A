package com.wiley.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	Connection con;
	public TestConnection()
	{
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root","Mysql@123");
			System.out.println("Connected To Database....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TestConnection();
	}

}
