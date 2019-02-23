<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Conferma Evento</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">
    <c:if test = "${sessionScope.Evento == null}">
         <script>window.location.replace("404.html");</script>
      </c:if>
  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Conferma la tua prenotazione</h1>
              </div>
              <form class="user" name="" action="ConfermaEvento" method="post">
                <div class="form-group">
                  <div align="center">Nome Evento</div>
                  <input type="text" class="form-control form-control-user" id="Nomeevento" value="${sessionScope.Evento.getNome()}" readonly>
                	<input type="hidden" id="eventoID" name="eventoID" value="${sessionScope.Evento.getId()}">
                </div>    
                <div class="form-group row">
                
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Categoria</div>
                    <input type="text" class="form-control form-control-user" id="Categoria" name="Categoria" placeholder="${sessionScope.Evento.getCategoria()}" readonly>
                  </div>
                  <div class="col-sm-6">
                  	<div align="center">Posti disponibili</div>
                    <input type="text" class="form-control form-control-user" id="Postidisponibili" name="Postidisponibili" placeholder="${sessionScope.Evento.getNumattualeprenotati()}" readonly>
                  </div>
                </div>
  
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<div align="center">Creatore evento</div>
                    <input type="text" class="form-control form-control-user" id="Creatoreevento" name="Creatoreevento" placeholder="${sessionScope.Evento.getCreatore()}" readonly>
                  </div>
                  
                  <div class="col-sm-6">
                  	<div align="center">Data scadenza prenotazione</div>
                    <input type="text" class="form-control form-control-user" id="Datascadenza" name="Datascadenza" placeholder="${sessionScope.Evento.getScadenza()}" readonly>
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                 	<div align="center">Data inizio evento</div>
                    <input type="tel" class="form-control form-control-user" id="Datainizio" name="Datainizio" placeholder="${sessionScope.Evento.getInizio()}" readonly>
                  </div>
                  <div class="col-sm-6">
                  	<div align="center">Data fine evento</div>
                    <input type="text" class="form-control form-control-user" id="Datafine" name="Datafine" placeholder="${sessionScope.Evento.getFine()}" readonly>
                  </div>
                </div>
                 <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                 	<div align="center">Provincia</div>
                    <input type="text" class="form-control form-control-user" id="Provincia" name="Provincia" placeholder="${sessionScope.Evento.getProvincia()}" readonly>
                  </div>
                  <div class="col-sm-6">
                  	<div align="center">Città</div>
                    <input type="text" class="form-control form-control-user" id="Citta" name="Citta" placeholder="${sessionScope.Evento.getCitta()}" readonly>
                  </div>
                </div>
                <div class="form-group">
                  <div align="center">Posti da prenotare</div>
                  <input type="number" min="1" value="1" max="${sessionScope.Evento.getNumattualeprenotati()}" class="form-control form-control-user" id="Postiprenotazione" name="Postiprenotazione" placeholder="Posti da prenotare">
                </div>  
				<div align="center" class="small">Devi aver fatto l'accesso per prenotarti all'evento.</div>
                <a>
                    <button class="btn btn-primary btn-user btn-block" type="submit" name="ConfermaEvento">Prenotati</button>
                </a>
                <hr>
              </form>

              <div class="text-center">
                <a class="small" href="cercaevento.jsp">Cerca un'altro evento</a>
              </div>
              <div class="text-center">
                <a class="small" href="dashboard.jsp">Vai alla Dashboard</a>
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