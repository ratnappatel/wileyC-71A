package com.wiley.servlet;

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
 * Servlet implementation class FindUpdateEmp
 */
@WebServlet("/FindUpdateEmp")
public class FindUpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
		DAOService  service =new DAOService();
    public FindUpdateEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		ResultSet res=service.findAll();
		
		if(res!=null)
		{
			try {
				pw.println(
						"<table border=3><tr><th>Employee_Id</th><th>First_name</th><th>salary</th><th>Department_id</th></tr>");
				while (res.next()) {
					pw.print("<tr><td>" + res.getInt("employee_id") + "</td>");
					pw.print("<td>" + res.getString("first_name") + "</td>");
					pw.print("<td>" + res.getInt("salary") + "</td>");
					pw.print("<td>" + res.getInt("department_id") + "</td></tr>");
				}
				pw.println("</table>");
				
			} catch (Exception e) {e.printStackTrace();	}
		}
		else
			pw.println("Employee Table is empty..");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		
		int eid=Integer.parseInt(request.getParameter("eid"));
		String fname=request.getParameter("fname");
		int salary=Integer.parseInt(request.getParameter("sal"));
		int did=Integer.parseInt(request.getParameter("did"));
		ResultSet res=service.updateEmp(eid, fname,salary,did);
		
		if(res!=null)
		{
			try {
				pw.println(
						"<table border=3><tr><th>Employee_Id</th><th>First_name</th><th>salary</th><th>Department_id</th></tr>");
				while (res.next()) {
					pw.print("<tr><td>" + res.getInt("employee_id") + "</td>");
					pw.print("<td>" + res.getString("first_name") + "</td>");
					pw.print("<td>" + res.getInt("salary") + "</td>");
					pw.print("<td>" + res.getInt("department_id") + "</td></tr>");
				}
				pw.println("</table>");
				
			} catch (Exception e) {e.printStackTrace();	}
		}
		else
			pw.println("Employee Details are not updated ...");
		
		
	}

}
