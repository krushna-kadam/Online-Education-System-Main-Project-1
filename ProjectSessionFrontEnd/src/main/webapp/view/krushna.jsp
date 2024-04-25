<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KrushnaKadam-OnlineEducationSystem</title>

<!-- Favicon  -->
<link rel="icon" href="Image/kk1.jpg">


</head>
<body>
	<br>
	<br>
	<br>
	<center>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img width="300" height="300"
			src="Image/k4.png">
	</center>
	<b> <br> <br> <br>
		<center>
<%

if(request.getAttribute("msg")!=null){
	out.print(request.getAttribute("msg"));
}
%>
			&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<u><font color="red">Login
					For Account</u></font><br> <br> <br> <br>
			<form action="krushna" method="post">
				<font color="blue"> Username: &nbsp &nbsp &nbsp<input
					type="text" name="Username"><br> <br> Password:
					&nbsp &nbsp &nbsp<input type="password" name="Password"></font> <br>
				<br> <input type="submit" value="Login">&nbsp&nbsp <input
					type="reset" value="Reset"> <br> <br> <br> <br>
				<a href="createaccount">Create New Account</a>

			</form>
		</center>
	</b>
</body>
</html>
<style>
body {
	background-image: url('Image/bg9.avif');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
