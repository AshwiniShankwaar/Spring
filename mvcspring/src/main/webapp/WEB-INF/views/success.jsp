<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored= "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${extra }</p>
<% 
//String email = (String)request.getAttribute("email");
//String pass = (String)request.getAttribute("pass");
%>
<p>${user.email } and password is ${user.pass }</p>
</body>
</html>