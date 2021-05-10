package com.wiley.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeSearch
 */
@WebServlet("/search")
public class EmployeeSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	String form="<form method=get action='http://localhost:90/EmployeeSearchProj/SearchEmp'>"
			+ "	Enter Employee Id<input type=text name='eid'><br>\r\n"
			+ "	<input type=submit value='Search Employee'><input type=reset value='Reset'>\r\n"
			+ "</form>";
    public EmployeeSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("lid");
		pw.println("Welcome "+name+" !");
		pw.println("<form method=get action=\"http://localhost:90/EmployeeSearchProj/SearchEmp\">");
		pw.println("Enter Employee Id<input type=text name='eid'><br>");
		pw.println("<input type=submit value=\"Search Employee\"><input type=reset value='Reset'></form>");
		
	}

}
