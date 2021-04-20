package com.wiley.dbConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeList {

	ArrayList<Employee> emps;
	DBConnect con;
	ResultSet res;
	Employee e;
	
	public EmployeeList() {
		emps=new ArrayList<Employee>();
		 con=new DBConnect();
	}
	public ArrayList<Employee> addEmployees()

	{
		res=con.getEmployees();
		try {
				while(res.next())
				{
					e=new Employee(
							res.getInt("Employee_id"),
							res.getString("first_name"),
							res.getString("last_name"),
							res.getDouble("salary"),
							res.getInt("department_id")
							);
					emps.add(e);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emps;
		
	}
	
	public void display()
	{
		System.out.println(emps);
	}
}
