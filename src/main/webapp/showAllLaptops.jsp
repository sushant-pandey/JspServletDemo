<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Laptop" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Laptop> laptops = (List<Laptop>)request.getAttribute("laptops");
		for(Laptop laptop : laptops){
			out.println(laptop);
			out.println("<br/>");
		}
	%>
</body>
</html>