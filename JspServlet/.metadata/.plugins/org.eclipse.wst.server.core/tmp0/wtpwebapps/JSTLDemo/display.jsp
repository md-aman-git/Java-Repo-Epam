<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- i have also first included library of jstl then will be able to use uri -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	color: #fff;
	background: #000;
	padding: 20px;
}
table {
	border: 2px solid #fed;
}
td {
	background: #999;
	padding: 10px;
}
</style>
</head>
<body>
	Hello World! <br>
	<div>${students}</div><br>
	<table>
	<c:forEach items="${students}" var="stud">
		<tr>
			<td>${stud.getId()}</td>
			<td>${stud.getName()}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>