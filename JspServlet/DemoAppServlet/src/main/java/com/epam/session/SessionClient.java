package com.epam.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionClient extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		HttpSession session = req.getSession();
		session.setAttribute("myPass", pass);
		session.setAttribute("myEmail", email);
		
		res.sendRedirect("loggedIn");
		
	}
}
