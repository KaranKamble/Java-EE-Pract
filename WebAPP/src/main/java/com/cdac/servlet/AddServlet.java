package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add.servlet")
public class AddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt( request.getParameter("num1") );
		int num2 = Integer.parseInt( request.getParameter("num2") );
		int sum = num1 + num2;
		
		PrintWriter out = response.getWriter();
		out.write("<h1>The sum of "+num1+" And "+num2+" is "+sum+"</h1>");
	}

}
