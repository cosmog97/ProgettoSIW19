<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>Contatti</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/index/bootstrap.min.css" />
	

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/homeCSS.css" />
	<link type="text/css" rel="stylesheet" href="css/headerCSS.css" />

	

</head>

<body>
	
	<div class="header">
		<a href="#default" class="logo">EBOOKER</a>
		<div class="header-right">
			<a><button class="btn" onclick="window.location.href='index.jsp';">Home</button></a>
			<c:choose>
			    <c:when test="${sessionScope.Nome == null}">
			        <a><button class="btn btn-primary btn-user btn-block" onclick="window.location.href='login.jsp';">Accedi</button></a>
            		<a><button class="btn btn-primary btn-user btn-block" onclick="window.location.href='register.jsp';">Registrati</button></a>
			        
			    </c:when>    
			    <c:otherwise>
			        <a><button class="btn btn-primary btn-user btn-block" onclick="window.location.href='dashboard.jsp';">Dashboard</button></a>
			        <a><button class="btn btn-primary btn-user btn-block" onclick="window.location.href='logout.jsp';">Logout</button></a>
			    </c:otherwise>
			</c:choose>
		</div>
	</div>
	

</body>
</html>