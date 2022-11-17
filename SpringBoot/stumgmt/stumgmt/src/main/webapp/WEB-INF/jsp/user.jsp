<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#btnAdd").click(function() {
			var uname = $("#username").val();
			var upass = $("#password").val();
			var urole = $("#role").val();

			$.ajax({
				type : 'POST',
				url : 'http://localhost:8080/userAdd',//rest controller url
				data : JSON.stringify({
					"userName" : uname,
					"password" : upass,
					"role" : urole
				}),
				success : function(data) {
					alert('data saved : ' + data);
				},
				contentType : "application/json",
				dataType : 'text'
			});
		});
		// $.ajax({
		// url: "http://localhost:8081/user/1"
		// }).then(function(data) {
		// $('.greeting-id').append(data.);
		// $('.greeting-category').append(data.category);
		// });
	});
</script>
<title>User Create Page</title>
</head>
<body>
	<form method="post">
		User Name : <input type="text" name="userName" id="username" /><br><br>
		Role : <input type="text" name="role" id="role" /><br><br>
		Password : <input type="password" name="password" id="password" /><br><br>
		<input type="button" id = "btnAdd" value = "Add User" />
	</form>
</body>
</html>