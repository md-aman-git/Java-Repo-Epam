<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Class.forName("com.mysql.jdbc.Driver");
	String username = "root", password = "aman@123";
	String sql = "SELECT * FROM employee_info WHERE id = 6";
	Connection con = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/employee",
			username, password);
	Statement statement = con.createStatement();
	ResultSet rs = statement.executeQuery(sql);
	rs.next();
	%>
	ID : <%=  rs.getInt(1) %> <br>
	Name : <%= rs.getString(2) %> <br>
	Department : <%= rs.getString(3) %> <br>
</body>
</html>