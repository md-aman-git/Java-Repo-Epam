package com.epam.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieExample extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		Cookie [] cookies = req.getCookies();
		String email = "", pass = "";
		for(Cookie cook : cookies) {
			if(cook.getName().equals("myEmail")) {
				email = cook.getValue();
			}
			if(cook.getName().equals("myPass")) {
				pass = cook.getValue();
			}
		}
		
		PrintWriter out = res.getWriter();
		out.println("Welcome to Login Cookie page");
		out.println("Email : " + email);
		out.println("Password : " + pass);
	}
}
