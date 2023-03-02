<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
  %>
  <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<%

String message = (String)request.getAttribute("key");
Integer x = (Integer)request.getAttribute("int");
List<String> l = (List<String>) request.getAttribute("list");
%>
  <h1><%=message%></h1>
  <h1><%=x%></h1>
<% for(String s:l){ %>
<h1><%=s%></h1>
<%}; %>
</body>
</html>
