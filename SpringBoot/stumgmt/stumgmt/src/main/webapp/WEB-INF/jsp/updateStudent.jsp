<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Details</title>
<style>
table, th, td {
	border: 1px solid #999;
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
</style>
</head>
<body>
	<h1>Student Update Page</h1>
	<form method="post">
		ID : <input type="text" name="id" value = "${studUpdate.id}"  disabled/>
		Student ID : <input type="text" name="studId"  value = "${studUpdate.studId}" disabled/>
		User Name : <input type="text" name="userName"  value = "${studUpdate.userName}" /> 
		Full Name : <input type="text" name="fullName"  value = "${studUpdate.fullName}" disabled/>
		<input type="submit" />
	</form>
</body>
</html>