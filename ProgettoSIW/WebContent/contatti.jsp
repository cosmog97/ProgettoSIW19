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
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css">
</head>

<body>

	<div class="header">
		<a href="index.jsp" class="logo">EBOOKER</a>
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
	

	<div class="container">
	<h1 class="text-center">Contatti</h1>
	<hr>
	  <div class="row">
	    <div class="col-sm-8">
	      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d11479.550208271874!2d16.224324476612715!3d39.358698986860176!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x133f999aaa86af19%3A0xe6050cd7c28559ba!2sUniversit%C3%A0+della+Calabria!5e0!3m2!1sit!2sit!4v1550656419300" width="100%" height="320" frameborder="0" style="border:0" allowfullscreen></iframe>
	    </div>
	
	    <div class="col-sm-4" id="contact2">
	        <h3>eBooker S.r.l.</h3>
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
		<h1 class="text-center">EBOOKER si racconta</h1>
		<hr>
		<div class="" id="staff">
			<h4 class="text-center">La piattaforma <a href="index.jsp">EBOOKER</a> � stata sviluppata da <a href="https://github.com/antoscal97">Antonio Scalisi</a> e <a href="https://github.com/cosmog97/">Cosmo Greco</a> per il progetto didattico del corso "Web Computing" del CdL "Informatica" presso il <a href="https://www.mat.unical.it/demacs">Dipartimento di Matematica e Informatica</a> dell'<a href="http://www.unical.it/">Universit� della Calabria</a>. L'idea nasce da una mancata organizzazione di una classica "serata fra colleghi", per poi sfociare in un event booker dove � possibile cercare, creare e organizzare eventi di qualunque genere in tutta Italia.</h4>
		</div>

	</div>
	
	  <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; EBOOKER 2019</span>
          </div>
        </div>
      </footer>

</body>
</html>