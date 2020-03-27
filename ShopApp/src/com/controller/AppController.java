package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// load jsp page
		String id = request.getParameter("id"); //null,page1,page2
		if(id == null){
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else
		if(id.equals("page1")){
			request.getRequestDispatcher("page1.jsp").forward(request, response);
		}
		else
		if(id.equals("page2")){
			request.getRequestDispatcher("page2.jsp").forward(request, response);
		}
		
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
