<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String username = null; %>
<% 
	response.setHeader("Cache_Control", "no-cache, no-store, must_revalidate");
	if(session.getAttribute("username") == null){
		response.sendRedirect("Login.jsp");
	} else{
		username = session.getAttribute("username").toString();
	}
%>
Videos for you...
<iframe width="560" height="315" src="https://www.youtube.com/embed/MNgliKze8oI" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>