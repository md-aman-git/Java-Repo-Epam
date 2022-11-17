package com.epam.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionExample extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("myEmail");
		String pass = (String) session.getAttribute("myPass");
		
		PrintWriter out = res.getWriter();
		out.println("Welcome to Login Session page");
		out.println("Email : " + email);
		out.println("Password : " + pass);
	}
}
