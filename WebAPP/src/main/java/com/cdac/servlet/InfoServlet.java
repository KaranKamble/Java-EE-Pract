package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/info.servlet")
public class InfoServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String  email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("Hey "+name+"</br>");
		out.write("Your email is "+email);
		out.write("</body></html>");
	}

}
