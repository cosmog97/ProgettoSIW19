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

  <title>Crea evento</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">



</head>

<body id="page-top">
  
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
            <h1 class="h3 mb-0 text-gray-800">Crea evento</h1>
            <a href="logout.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-power-off fa-sm text-white-50"></i>  Logout</a>
          </div>
          
           <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Crea il tuo evento</h6>
                </div>
          <div class="card-body">
          

          <!-- Content Row -->
          <div class="">
            <div class="p-5">
    <!--         <div class="text-center">
                <h2 class="h3 text-gray-900 mb-4">Dati personali</h2>
              </div>-->   
              <form class="user" name="CreaEvento" action="CreaEvento" method="post">

	            <div class="form-group">
                  <div align="center">Nome evento</div>
                  <input type="text" class="form-control" name="NomeEvento" id="NomeEvento" placeholder="Inserisci il nome dell'evento">
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Data inizio</div>
                    <input type="datetime" pattern="[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]:00" class="form-control" name="Datainizio" id="Datainizio" placeholder="yyyy-mm-dd hh:mm:00">
                  </div>
                  <div class="col-sm-6">
                    <div align="center">Data fine</div>
                    <input type="datetime" pattern="[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]:00" class="form-control" name="DataFine" id="DataFine" placeholder="yyyy-mm-dd hh:mm:00">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Data scadenza prenotazioni</div>
                    <input type="datetime" pattern="[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]:00" class="form-control" name="DataScadenza" id="DataScadenza" placeholder="yyyy-mm-dd hh:mm:00">
                  </div>
				<div class="col-sm-6">

                    <div align="center">Categoria</div>
	                    		<select class="form-control form-control" required id="Categoria" name="Categoria">
	                    							<option value="Cinema">Cinema</option>
								        			<option value="Convegni">Convegni</option>
								        			<option value="Feste">Feste</option>
								        			<option value="Musica">Musica</option>
								        			<option value="Teatro">Istruzione</option>
								        			<option value="Sport">Sport</option>
								          			<option value="Teatro">Teatro</option>
								          			<option value="Viaggi">Viaggi</option>
								</select>
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  		        <div align="center">Provincia</div>
	                    		<select class="form-control" name="Provincia" id="Provincia" required>
	                    		</select>
	                    		<script src='js/loadProvince.js'></script>
                  </div>
                  <div class="col-sm-6">
                    <div align="center">Città</div>
                    <input type="text" class="form-control" name="Citta" id="Citta" placeholder="Inserisci città">
                  </div>
                </div>
                
                <div class="form-group row">
                  
                  <div class="col-sm-6  mb-3 mb-sm-0">
                  	<div align="center"><div align="center">Posti totali</div>
	                <input type="number" class="form-control" name="NumeroPosti" id="NumeroPosti" placeholder="Numeri posti disponibili"></div>
                  </div>
                  <div class="col-sm-6">
                  		<br>
                         <button class="btn btn-primary btn-user btn-block" name="CreaEvento" type="submit">Crea evento</button>
                  </div>
                </div>
                
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