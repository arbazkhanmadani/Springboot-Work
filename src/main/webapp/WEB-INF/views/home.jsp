<%@ page import="javax.servlet.jsp.PageContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link type="text/css" rel="stylesheet" href="/css/style.css"/>
</head>

<body>
	
	<h1>Arbaz Khan : <%= request.getServletPath() %></h1>
	<img src="/image/profile-pic.png" alt="profile" width="100"/>



<!-- ${pageContext.request.contextPath} -> for getting context path -->
<script src="/js/myjs.js"></script>

</body>
</html>