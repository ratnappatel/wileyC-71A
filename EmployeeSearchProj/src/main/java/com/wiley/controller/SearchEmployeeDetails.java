package com.wiley.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wiley.service.DAOService;

/**
 * Servlet implementation class SearchEmployeeDetails
 * @WebServlet annotation is used to map actual servlet class with its alias name
 */
@WebServlet("/SearchEmp")

public class SearchEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int n=0;
	DAOService service;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		n++;
		PrintWriter pw=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("eid")); // string ==> int
		
		service=new DAOService();
		try {
			ResultSet res = service.findById(id);
			pw.println(
					"<table border=3><tr><th>Employee_Id</th><th>First_name</th><th>salary</th><th>Department_id</th></tr>");
			pw.println("<tr>");
			while (res.next()) {
				pw.print("<td>" + res.getInt("employee_id") + "</td>");
				pw.print("<td>" + res.getString("first_name") + "</td>");
				pw.print("<td>" + res.getInt("salary") + "</td>");
				pw.print("<td>" + res.getInt("department_id") + "</td>");
			}
			pw.println("</tr></table>");
			
			pw.println("This Web Site  accessed for<b> "+n+"</b>No of Times");
			
		} catch (Exception e) {e.printStackTrace();	}
	}

}
