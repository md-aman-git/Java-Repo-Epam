<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp Form</title>
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
	<h1>Student Docs List Page</h1>
	<table style="width:100%">
	<tr>
		<th>ID</th>
		<th>Category</th>
		<th>Image</th>
	</tr>
	<c:forEach items="${studInfoList}" var="item">
    	<tr>
			<td>${item.id}</td>
			<td>${item.doc_category}</td>
			<td><a href = "/stu/imageView/${item.file_path}">View Doc</a></td>
		</tr>
   	</c:forEach>
   	</table>
</body>
</html>