<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Modifica profilo</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">



</head>

<body id="page-top">
  <c:if test = "${sessionScope.Nome == null}">
         <script>window.location.replace("404.html");</script>
      </c:if>
  <!-- Page Wrapper -->
  <div id="wrapper">
	<jsp:include page="navbar.jsp" />
	

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        
        <!-- End of Topbar -->
		
        <!-- Begin Page Content -->
        <div class="container-fluid">
    		<br>
          <!-- Page Heading -->
          <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Modifica profilo</h1>
            <a href="logout.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-power-off fa-sm text-white-50"></i>  Logout</a>
          </div>
          
           <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Dati personali</h6>
                </div>
          <div class="card-body">
          

          <!-- Content Row -->
          <div class="">
            <div class="p-5">
    <!--         <div class="text-center">
                <h2 class="h3 text-gray-900 mb-4">Dati personali</h2>
              </div>-->   
              <form class="user" name="ModificaProfilo" action="ModificaProfilo" method="post">

                <div class="form-group row">
                  <div class="col-sm-6">
                  	<div align="center">Nome</div>
                    <input type="text" class="form-control form-control-user" name="Nome" id="Nome" placeholder="${sessionScope.Nome}">
                  </div>
                  <div class="col-sm-6">
                  	<div align="center">Cognome</div>
                    <input type="text" class="form-control form-control-user" name="Cognome" id="Cognome" placeholder="${sessionScope.Cognome}">
                  </div>
                </div>
                <div class="form-group">
                  <div align="center">Email</div>
                  <input type="email" class="form-control form-control-user" name="Email" id="Email" placeholder="${sessionScope.Email}">
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Provincia</div>
                    <input type="text" class="form-control form-control-user" name="Provincia" id="Provincia" placeholder="${sessionScope.Provincia}">
                  </div>
                  <div class="col-sm-6">
                    <div align="center">Città</div>
                    <input type="text" class="form-control form-control-user" name="Citta" id="Citta" placeholder="${sessionScope.Citta}">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Data di nascita</div>
                    <input type="text" onfocus="(this.type='date')" onblur="(this.type='text')" class="form-control form-control-user" id="Datanascita" name="Datanascita" placeholder="${sessionScope.Datanascita} ">
                  </div>
                  <div class="col-sm-6">
                    <br>
                   <button class="btn btn-primary btn-user btn-block" type="submit" name="ModificaProfilo" type=submit>Modifica dati personali</button>
                  </div>
                </div>
                
                
              </form>
              <br>
              <hr>
                   <form class="user" name="ModificaPassword" action="ModificaPassword" method="post">
                <div class="form-group row">
                  <div class="col-sm-6">
                    <div align="center">Vecchia password</div>
                    <input type="password" class="form-control form-control-user" id="Vecchiapassword" name="Vecchiapassword" placeholder="Vecchia password">
                  </div>
                  <div class="col-sm-6">
                  <div align="center">Nuova password</div>
                    <input type="password" class="form-control form-control-user" id="Nuovapassword" name="Nuovapassword" placeholder="Nuova password">
                  </div>
                </div>
				
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                 	<div align="center">Ripeti nuova password</div>
                    <input type="password" class="form-control form-control-user" id="Ripetinuovapassword" name="Ripetinuovapassword" placeholder="Ripeti nuova password">
                  </div>
                  <div class="col-sm-6">
                  <br>
                         <button class="btn btn-primary btn-user btn-block" name="ModificaPassword" type=submit>Modifica password</button>
                  </div>
                </div>

                <div align="center">Ultima modifica password: ${sessionScope.Ultimamodpassword}</div>
                
                
              </form>
              
              
            </div>

        </div>
        <!-- /.container-fluid -->

                </div>
              </div>

      </div>
      <!-- End of Main Content -->



    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->



  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>


  
</body>

</html>