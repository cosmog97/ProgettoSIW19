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

	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<style>hr {border-top: 1px solid #000; width:50%;}

			a {color: #000;}
			
			a:link{text-decoration:none;}
			
			#contact2{
			    letter-spacing:3px;
			}
	</style>
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
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">

	<div class="container">
	<h1 class="text-center">Contatti</h1>
	<hr>
	  <div class="row">
	    <div class="col-sm-8">
	      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d11479.550208271874!2d16.224324476612715!3d39.358698986860176!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x133f999aaa86af19%3A0xe6050cd7c28559ba!2sUniversit%C3%A0+della+Calabria!5e0!3m2!1sit!2sit!4v1550656419300" width="100%" height="320" frameborder="0" style="border:0" allowfullscreen></iframe>
	    </div>
	
	    <div class="col-sm-4" id="contact2">
	        <h3>Sedi e Contatti</h3>
	        <hr align="left" width="50%">
	        <h4 class="pt-2">Sede operativa</h4>
	        <i class="fas fa-globe" style="color:#000"></i> Via Pietro Bucci, 87036 Arcavacata, Rende (CS)<br>
	        <h4 class="pt-2">Contatti</h4>
	        <i class="fas fa-phone" style="color:#000"></i> <a href="tel:+"> +39 3338884441 </a><br>
	        <i class="fab fa-whatsapp" style="color:#000"></i><a href="tel:+"> +39 3338884442 </a><br>
	        <h4 class="pt-2">Email</h4>
	        <i class="fa fa-envelope" style="color:#000"></i> <a href="mailto:ebookersiw@gmail.com">ebookersiw@gmail.com</a><br>
	      </div>
	  </div>
	
		<br><br>
		<h1 class="text-center">Lo staff di eBooker</h1>
		<hr>
	</div>


</body>
</html>