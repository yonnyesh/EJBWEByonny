<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Listado Personas</h1>
<ul>
	<c:forEach items="${personas}" var="persona">
		<li>${persona}</li>
	</c:forEach>

</ul>
</body>
</html>