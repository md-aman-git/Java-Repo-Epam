<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page Form</title>
<style type="text/css">
body {
	background: #000;
	color: #fff;
}
</style>
</head>
<body>
	<%
	int a = Integer.parseInt(request.getParameter("num1"));
	int b = Integer.parseInt(request.getParameter("num2"));
	
	int sub = a - b;
	out.println("Subtraction : " + sub);
	%>
	
</body>
</html>