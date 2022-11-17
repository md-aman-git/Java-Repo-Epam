<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Details</title>
<style>
table, th, td {
	border:1px solid #999;
	text-align: center;
	padding: 10px;
}
body {
background: #000;
color: #fff;
}
a {
text-decoration: none;
background: orange;
color: #000;
padding: 5px 10px;
}
.update {
background: green;
color: #fff;
}
</style>
</head>
<body>
	<h1>Student List Page</h1>
	<table style="width:100%">
	<tr>
		<th>ID</th>
		<th>Student ID</th>
		<th>User Name</th>
		<th>Password</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	<c:forEach items="${studList}" var="item">
    	<tr>
			<td>${item.getId()}</td>
			<td>${item.getStudId()}</td>
			<td>${item.getUserName()}</td>
			<td>${item.getPassword()}</td>
			<td><a href = "/stu/delete/${item.getId()}">delete</a></td>
			<td><a href = "/stu/update/${item.getId()}" class = "update">update</a></td>
		</tr>
   	</c:forEach>
   	</table>
</body>
</html>