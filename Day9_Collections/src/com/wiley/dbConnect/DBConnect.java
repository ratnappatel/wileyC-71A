package com.wiley.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnect {
	Connection con;
	ResultSet res;
	Statement stat;
	Employee e;
	
	public DBConnect() {
		
		try 
		{
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "Mysql@123");
			 stat=con.createStatement();
			 int id=50,id1=30;
			 res=stat.executeQuery("select employee_id,first_name,"
					+ "last_name,salary,department_id from employees"
					+ " where department_id in ("+id+","+id1+")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet getEmployees()
	{
		return res;
	}
}
