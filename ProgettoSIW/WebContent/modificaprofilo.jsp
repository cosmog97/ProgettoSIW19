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

  <title>Modifica profilo</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">



  <script>
    function show(shown, hidden) {
        document.getElementById(shown).style.display='block';
        document.getElementById(hidden).style.display='none';
        return false;
    }
  </script>

  <script>
    $("#myspan").click(function(){
      alert('I got a click');
    });
  </script>



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
                    <input type="text" class="form-control form-control-user" name="Nome" id="exampleFirstName" placeholder="Nome">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" name="Cognome" id="exampleLastName" placeholder="Cognome">
                  </div>
                </div>
                <div class="form-group">
                  <input type="email" class="form-control form-control-user" id="exampleInputEmail" placeholder="Email">
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" onfocus="(this.type='date')" onblur="(this.type='text')" class="form-control form-control-user" id="Datanascita" placeholder="Data di nascita">
                  </div>
                  <div class="col-sm-6">
                    <input type="password" class="form-control form-control-user" id="exampleRepeatPassword" placeholder="Password">
                  </div>
                </div>
                <button class="btn btn-primary btn-user btn-block" type="submit" name="ModificaProfilo" type=submit>Modifica Dati</button>
              </form>
              <br>
                   <form class="user">
                <div class="form-group row">
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="exampleFirstName" placeholder="Vecchia password">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="exampleLastName" placeholder="Nuova password">
                  </div>
                </div>
				
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Ripeti nuova password">
                  </div>
                  <div class="col-sm-6">
                                    <a href="INSERIRECLASSE" class="btn btn-primary btn-user btn-block">
                  Aggiorna password
                </a>
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

  <!-- Page level plugins -->
  <script src="vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="js/demo/chart-area-demo.js"></script>
  <script src="js/demo/chart-pie-demo.js"></script>

  
</body>

</html>