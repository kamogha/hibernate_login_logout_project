<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="css/welcome.css">
</head>
<body class="welcome">
<%
if(session.getAttribute("name")!=null)
%>
<%
if(session.getAttribute("name")==null){
	response.sendRedirect("login.jsp");
}
%>
</body>
</html>