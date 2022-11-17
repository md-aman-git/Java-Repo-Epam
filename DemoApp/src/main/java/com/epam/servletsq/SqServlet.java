package com.epam.servletsq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//int z = (int) (req.getAttribute("zVal"));
		
		int z = Integer.parseInt(req.getParameter("zVal"));
		z = z * z;
		PrintWriter out = res.getWriter();
		out.println("Welcome to Square page");
		out.println("square of z : " + z);
	}
}
