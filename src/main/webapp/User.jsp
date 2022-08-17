<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User DashBoard</title>
</head>
<%
if ((request.getSession(false).getAttribute("User") == null)) {
%>
<jsp:forward page="login.jsp"></jsp:forward>
<%
}
%>
<body>
	<h2>User DashBoard</h2>
	welcome <%=request.getAttribute("userName")%>
	<br />
	<form action="<%=request.getContextPath()%>/LogoutServlet">
		
		<input type="submit" value="logout">
	</form>


</body>
</html>