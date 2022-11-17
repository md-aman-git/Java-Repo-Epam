package com.epam.servletadd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		
		int z = x + y;
		
		res.sendRedirect("square?zVal=" + z); //URL Rewriting
		
		
		//below is calling another class using request obj.
//		req.setAttribute("zVal", z);
//		
//		RequestDispatcher reqDis = req.getRequestDispatcher("square");
//		reqDis.forward(req, res);
	}
//	public void dPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int x = Integer.parseInt(req.getParameter("num1"));
//		int y = Integer.parseInt(req.getParameter("num2"));
//		
//		int z = x + y;
//		
//		PrintWriter out = res.getWriter();
//		
//		out.println("Sum = " + z);
//	}
}
