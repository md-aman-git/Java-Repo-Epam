
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- this below code snippet will work like import in java -->
	<!-- directives tags -->
	<%@page import="java.io.IOException" %>
	<%@ include file = "header.jsp" %>
	
	<!-- declaration tags -->
	<%!
		/* declaration block or tag */
		//this will go outside of service method of servlet
		//i.e, will work as global kind of thing
		int value1 = 10;//global variable declaration
		//below is same like method creation in a class
		String myMethod() throws IOException {
			String name = "Md Aman";
			return "Hello, " + name;
		}
	%>
	
	
	<!-- scriptlet tags -->
	<%
		//this will go inside service method of servlet
		int value1 = 10;
		int value2 = 20;
		int result = value1 + value2;
		out.println("Result : " + result);
		out.println();
		String message = myMethod();
		out.println("<br/>");
		out.println(message);
	%>
	<br/>
	<!-- Below is expression tag -->
	<div>Value of value1 = <%= value1 %></div>
</body>
</html>