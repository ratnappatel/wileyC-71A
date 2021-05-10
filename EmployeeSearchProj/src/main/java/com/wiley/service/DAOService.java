package com.wiley.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wiley.dao.DBConnection;

public class DAOService {
	Connection con;
	ResultSet res;
	PreparedStatement pre;
	
	public DAOService() {
		con=DBConnection.getConnection();
	}
	
	public ResultSet findById(int id)
	{
		try {
			
			pre=con.prepareStatement("select * from emps where employee_id=?");
			pre.setInt(1, id);
			
			res=pre.executeQuery();
			
		} catch (Exception e) {e.printStackTrace();		}
		return res;
	}

}
