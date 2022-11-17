package com.epam.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieClient extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		Cookie c1 = new Cookie("myEmail", email);
		Cookie c2 = new Cookie("myPass", pass);
		
		res.addCookie(c1);
		res.addCookie(c2);
		
		res.sendRedirect("loggedInCookie");
		
	}

}
