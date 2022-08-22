<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/LoginServlet"
		method="post">
		Username:<input type="text" name="username"  required="required"/><br /> Password:<input
			type="text" name="password" required="required"/><br />		
			<input type="submit" value="login"><br/>
			
			<%= (request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage") %>
			
	</form>

</body>
</html>