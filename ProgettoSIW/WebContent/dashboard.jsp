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

  <title>Dashboard</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">
  <link href="css/playerresponsive.css" rel="stylesheet">


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
            <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
            <a href="logout.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-power-off fa-sm text-white-50"></i>  Logout</a>
          </div>
          
           <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Riepilogo</h6>
                </div>
          <div class="card-body">
          <div align="center">Ecco un breve riepilogo sull'attività del tuo profilo, ${sessionScope.Nome}.</div>
          <br>
          <div class="row">
			
            <!-- Earnings (Monthly) Card Example -->
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-primary shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">Prossimo evento</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800" id="prossimo"></div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-calendar fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- Earnings (Monthly) Card Example -->
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-success shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-success text-uppercase mb-1">Eventi in scadenza</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800" id="scadenza"></div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-business-time fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- Earnings (Monthly) Card Example -->
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-info shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-info text-uppercase mb-1">Eventi prenotati</div>
                      <div class="row no-gutters align-items-center">
                        <div class="col-auto">
                          <div class="h5 mb-0 mr-3 font-weight-bold text-gray-800" id="prenotati"></div>
                        </div>
                      </div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- Pending Requests Card Example -->
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-warning shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-warning text-uppercase mb-1">Eventi creati</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800" id="creati"></div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-paint-brush fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          


        <!-- /.container-fluid -->

         </div>
       </div>
              <div class="row">

            <div class="col-xl-8 col-lg-7">

              <!-- Area Chart -->
              <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Cos'è EBOOKER</h6>
                </div>
                <div class="card-body">
                	<strong>EBOOKER</strong> è un'innovativa piattaforma Web, nata dall'idea di due giovani studenti dell'<a href="http://www.unical.it">Università della Calabria</a>. L'idea è quella di aumentare la coesione sociale fra chi organizza gli eventi, in particolar modo gli enti pubblici, e gli studenti del Campus. Organizzare una partita di calcio fra amici e conoscenti non è mai stato così semplice! <strong>Organize yourself!</strong> 
                	<hr>
                   <div class="rwd-video">
               		<iframe width="560" height="315" src="https://www.youtube.com/embed/kJQK6r0Tj0c?autoplay=1" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
               	 </div>
                  
                </div>
              </div>


            </div>

            <!-- Donut Chart -->
            <div class="col-xl-4 col-lg-5">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Statistiche</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <div class="chart-pie pt-4">
                    <canvas id="myPieChart"></canvas>
                  </div>
                  <hr> <div id="numeventi"></div> 
                  <div id="numutenti"></div>
                </div>
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

  <!-- Page level plugins -->
  <script src="vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
 

  <script src="js/statistiche/visualizzastatistiche.js"></script>
  <script src="js/statistiche/visualizzariepilogo.js"></script>
  
</body>

</html>