package com.wiley.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.wiley.dao.DBConnection;

public class DAOService {
	Connection con;
	ResultSet res;
	PreparedStatement pre;
	Statement stat;
	public DAOService() {
		con=DBConnection.getConnection();
	}
	
	
	// http get request method
	public ResultSet findById(int id)
	{
		try {
			
			pre=con.prepareStatement("select * from emps where employee_id=?");
			pre.setInt(1, id);
			
			res=pre.executeQuery();
			
		} catch (Exception e) {e.printStackTrace();		}
		return res;
	}

	// http get request method
	public ResultSet findAll()
	{
		try {
			
			stat=con.createStatement();
			res=stat.executeQuery("select * from emps");
			
		} catch (Exception e) { e.printStackTrace();	}
		return res;
	}

	// http put request method
	public ResultSet updateEmp(int eid,String fname,int salary , int deptid)
	{
		try {
			
			pre=con.prepareStatement("update emps set salary=? , first_name=?, department_id=? where employee_id=?");
			
			pre.setInt(1, salary);
			pre.setString(2, fname);
			pre.setInt(3, deptid);
			pre.setInt(4, eid);
			
			int ra=pre.executeUpdate();
			
			if(ra>0)
				res=findAll();
			else
				res=null;
			
		} catch (Exception e) {e.printStackTrace();	}
		return res;
	}
	
	public String deleteEmp(int eid)
	{
		String r="";
		try {
			
			pre=con.prepareStatement("delete from emps where employee_id=?");
			pre.setInt(1, eid);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				r="Successfull";
			else
				r="Unsucessfull";
		} catch (Exception e) {e.printStackTrace();		}
		return r;
	}
	
	public ResultSet insertEmp(int eid,String fname,int salary , int deptid)
	{
		try {
			
			pre=con.prepareStatement("insert into emps values(?,?,?,?)");
			pre.setInt(3, salary);
			pre.setString(2, fname);
			pre.setInt(4, deptid);
			pre.setInt(1, eid);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				res=findAll();
			else
				res=null;
			
		} catch (Exception e) { e.printStackTrace();		}
		return res;
	}
}
