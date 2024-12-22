package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		LocalTime time = LocalTime.now();
		if( time.getHour() > 4 && time.getHour() < 12 ) {
			out.write("Good Morning");
		}else if( time.getHour() >= 12 && time.getHour() < 16 ){
			out.write("Good Afternoon");
		}else if( time.getHour() >= 16 && time.getHour() < 23 ) {
			out.write("Good Evening");
		}else {
			out.write("Good Night");
		}
	}
}
