package com.wiley.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String name="",pwd="";
		
		  name=request.getParameter("name");
		  pwd=request.getParameter("password");
		 
		
		pw.println("<h1>I am Get From Hello Servlet</h1>");
		pw.println("Hello<h2>"+name+"<br>Your Password is "+pwd);
		System.out.println("<h1>I am Get From Hello Servlet</h1>");
		System.out.println("Hello "+name+"\nYour Password is : "+pwd);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException , IOException
	{
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String pwd=request.getParameter("password");
		
		pw.println("<h1>I am Get From Hello Servlet</h1>");
		pw.println("Hello<h2>"+name+"<br>Your Password is "+pwd);
		System.out.println("<h1>I am Get From Hello Servlet</h1>");
		System.out.println("Hello "+name+"\nYour Password is : "+pwd);
	}
	
}
