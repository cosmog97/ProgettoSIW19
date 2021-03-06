<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Registrati</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">
	
<script src="js/validationRegister.js"></script>
	
	
  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Crea un account</h1>
              </div>
              <form class="user" name="Register" action="Register" method="post">
                  <div class="form-group">
                  <div align="center">Nome utente</div>
                  <input type="text" class="form-control form-control-user" id="Username" name="Username" placeholder="Nome utente">
                </div>
                  <div class="form-group">
                  <div align="center">Email</div>
                  	<input type="email" class="form-control form-control-user" id="Email" name="Email" placeholder="Email">
                  </div>
                          
                <div class="form-group row">
                
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Cognome</div>
                    <input type="text" class="form-control form-control-user" id="Cognome" name="Cognome" placeholder="Cognome">
                  </div>
                  <div class="col-sm-6">
                  	<div align="center">Nome</div>
                    <input type="text" class="form-control form-control-user" id="Nome" name="Nome" placeholder="Nome">
                  </div>
                </div>
  
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Password</div>
                    <input type="password" class="form-control form-control-user" id="Password" name="Password" placeholder="Password">
                  </div>
                  
                  <div class="col-sm-6">
                  	<div align="center">Ripeti password</div>
                    <input type="password" class="form-control form-control-user" id="Ripetipassword" name="Ripetipassword" placeholder="Ripeti password">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                 	<div align="center">Numero di telefono</div>
                    <input type="tel" class="form-control form-control-user" id="Numerotelefono" name="Numerotelefono" placeholder="Numero di telefono">
                  </div>
                  <div class="col-sm-6">
                  	<div align="center">Data di nascita</div>
                    <input placeholder="Data di nascita" type="text" onfocus="(this.type='date')" onblur="(this.type='text')" class="form-control form-control-user" id="Datanascita" name="Datanascita" placeholder="Data di nascita">
                  </div>
                </div>
                 <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                 	<div align="center">Provincia</div>
                    <input type="text" class="form-control form-control-user" id="Provincia" name="Provincia" placeholder="Provincia">
                    <script src="js/loadProvince.js"></script>
                  </div>
                  <div class="col-sm-6">
                  	<div align="center">Citt�</div>
                    <input type="text" class="form-control form-control-user" id="Citta" name="Citta" placeholder="Citta">
                  </div>
                </div>
                <div class="text-center">
                	<a class="small">Tutti i campi sono obbligatori</a>
              	</div>
                <a>
                    <button class="btn btn-primary btn-user btn-block" type="submit" name="Register" type=submit onclick="return controllaformregister()">Registrati</button>
                </a>
                <hr>
              </form>
              <div class="text-center">
                <a class="small" href="login.jsp">Hai gi� un account? Accedi!</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>



  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>

</body>

</html>
