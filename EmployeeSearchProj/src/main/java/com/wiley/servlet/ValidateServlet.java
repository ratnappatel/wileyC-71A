package com.wiley.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		String lid=request.getParameter("lid");
		String pwd=request.getParameter("password");
		
		
		if(lid.equals("admin") && pwd.equals("admin"))
		{
			pw.println("User Validated Successfully...");
			RequestDispatcher  rd=request.getRequestDispatcher("search");
			rd.forward(request, response);
		}
		else
		{
			pw.println("<font color=red>Your Login Id/Password is Incorrect ,Try Again !</font>");
			RequestDispatcher  rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}

}
