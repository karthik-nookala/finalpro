package com.nissan.projecttest;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Testserv
 */


public class Testserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		String number1=(request.getParameter("n1"));
		String number2=(request.getParameter("n2"));
		//int result =number1+number2;
		
		//out.println("<h1>Result :"+ result+"<h1>");
		out.println(Add(number1,number2));
	}
	
	public String Add(String number1, String number2)
	{
		try{
			float result =Float.parseFloat(number1) + Float.parseFloat(number2);
			return (Float.toString(result));
		}
		catch(Exception e){
			return ("please type int or float");
		}
	}
}
