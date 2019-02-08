<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>eBookers</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/index/bootstrap.min.css" />
	

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/homeCSS.css" />
	<link type="text/css" rel="stylesheet" href="css/headerCSS.css" />

	

</head>

<body>
	
	<div class="header">
		<a href="#default" class="logo">eBooker</a>
		<div class="header-right">
			<a><button class="btn" onclick="window.location.href='contatti.jsp';">Contatti</button></a>
            <a><button class="btn btn-primary btn-user btn-block" onclick="window.location.href='dashboard.jsp';">Dashboard</button></a>
			<a><button class="btn btn-primary btn-user btn-block" onclick="window.location.href='login.jsp';">Accedi</button></a>
            <a><button class="btn btn-primary btn-user btn-block" onclick="window.location.href='register.jsp';">Registrati</button></a>
		</div>
	</div>


	<div id="booking" class="section">

		<div class="section-center">
			<div class="container">
				<div class="row">
					<div class="col-md-7 col-md-push-5">
						<div class="booking-cta">
							<h1>Organize yourself!</h1>
							<p>	
								Vuoi organizzare un evento? 
								Sei nel posto giusto.
							</p>
						</div>
					</div>
					<div class="col-md-4 col-md-pull-7">
											
						<div class="booking-form">
							<h2 align="center">Cerca il tuo evento</h2>
							<br>
							<form>
								<div class="form-group">
									<span class="form-label">Nome Evento</span>
									<input class="form-control" id="Nome" name="Nome" type="text" placeholder="Inserire nome evento...">
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<span class="form-label">Categoria Evento</span>
											<form>
												<select class="form-control" id="Categoria" name="Categoria" required>
								        			<option value="Cinema">Cinema</option>
								        			<option value="Convegni">Convegni</option>
								        			<option value="Escursioni">Escursioni</option>
								        			<option value="Feste">Feste</option>
								        			<option value="Musica">Musica</option>
								        			<option value="Teatro">Istruzione</option>
								        			<option value="Sport">Sport</option>
								          			<option value="Teatro">Teatro</option>
												</select>
											</form>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<span class="form-label">Data inizio evento</span>
											<input class="form-control" type="date" required>
										</div>
									</div>
								</div>
								<div class="form-btn">
									<a>
                      					<button class="btn btn-primary btn-user btn-block" type="submit" name="CercaEvento" type=submit>Cerca Evento</button>
                    				</a>
	
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>