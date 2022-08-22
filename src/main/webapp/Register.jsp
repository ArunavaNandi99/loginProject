<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<center>
		<h2>Registration Form</h2>
	</center>
	<form name="form" action="<%= request.getContextPath() %>/RegisterServlet" method="post"
		onsubmit="return validate()">
		<table align="center">
			<tr>
				<td>Full Name</td>
				<td><input type="text"  id="fullname" name="fullname" required="required"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" id="email"name="email" required="required"/></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" id="username" name="username" required="required"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" id="password" name="password" required="required"/></td>
			</tr>
			<tr>
				<td>ConfirmPassword</td>
				<td><input type="text" id="conpassword" name="conpassword" required="required"/></td>
			</tr>
			<tr>
				<td><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
		</table>
		<br/>
		<p>Already Registered?<a href="Login.jsp">login</a></p>
	</form>
	
	
	<script>
	function validate() 
	{
		var fullname = document.getElementById("fullname");
		var email = document.getElementById("email");
		var username = document.getElementById("username");
		var password = document.getElementById("password");
		var conpassword = document.getElementById("conpassword");

		if (fullname == null || fullname == "") {
			alert("Full Name can't be blank");
			return false;
		} else if (email == null || email == "") {
			alert("Email can't be blank");
			return false;
		} else if (username == null ) {
			alert("Username can't be blank")
			return false;
		} else if (password.value.length < 6) {
			alert("password must be at least 6 characters");
			return false;
		} else if (password == conpassword) {
			alert("Confirm Password should match with the Password");
			return false;
		}
	}
</script>


</body>
</html>


