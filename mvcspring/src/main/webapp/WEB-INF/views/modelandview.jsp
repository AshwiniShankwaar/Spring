<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored= "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% /*String name = (String)request.getAttribute("name");*/ %>
<p>${name}</p>
<c:forEach var="text" items="${list }">
  <h1><c:out value="${text }"></c:out></h1>
</c:forEach>
</body>
</html>