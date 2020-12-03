<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
<%! String username = null; %>
<% 
	response.setHeader("Cache_Control", "no-cache, no-store, must_revalidate");
response.setHeader("Pragma", "no-cache");
	if(session.getAttribute("username") == null){
		response.sendRedirect("Login.jsp");
	} else{
		username = session.getAttribute("username").toString();
	}
%>
Welcome... <%=username %>
<br>
<a href="Videos.jsp">Videos</a>
<form action="logout">
	<input type="submit" value = "Logout">
</form>
</body>
</html>