<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src='js/cercaevento/viewevents.js'></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
 	<link href="css/sb-admin-2.css" rel="stylesheet">
	<link rel='stylesheet prefetch' href='css/bootstrap.min.css'>
	<style class="cp-pen-styles"> body {
		padding-top: 0px;
	}
	.product {
		margin-bottom: 30px;
	}
	.product-inner {
		box-shadow: 0 0 10px rgba(0,0,0,.2);
		padding: 10px;
		background: white;
	}
	.product img {
		margin-bottom: 10px;
	}</style>
	
</head>
<body>
	<div class="bg-gradient-primary">
	 <div class="container">
	 <div id="content">

        <!-- Topbar -->
        
        <!-- End of Topbar -->
		
        <!-- Begin Page Content -->
        <div class="container-fluid">
    		<br>
           <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary text-center">Cerca il tuo evento</h6>
                </div>
                <div class="p-5">
                  <div>
                  	<form class="user">
                  	    <div class="form-group">
                  			<div align="center">Nome evento</div>
                  			<input type="text" class="form-control form-control-user" id="Nomeevento" placeholder="Nome evento">
                		</div>
                  		<div class="form-group row">
	                  		<div class="col-sm-6">
	                  			<div align="center">Categoria</div>
	                    		<input type="text" class="form-control form-control-user" name="Categoria" id="Categoria" placeholder="Categoria">
	                  		</div>
	                  		<div class="col-sm-6">
	                  			<div align="center">Creatore</div>
	                    		<input type="text" class="form-control form-control-user" name="Creatore" id="Creatore" placeholder="Creatore">
	                  		</div>
	                  	</div>
                  		<div class="form-group row">
	                  		<div class="col-sm-6">
	                  			<div align="center">Data evento</div>
	                    		<input type="date" class="form-control form-control-user" name="Datainizio" id="Datainizio" placeholder="Data inizio evento">
	                  		</div>
	                  		<div class="col-sm-6">
	                  			<div align="center">Posti disponibili</div>
	                    		<input type="text" class="form-control form-control-user" name="Numposti" id="Numposti" placeholder="Numeri posti disponibili">
	                  		</div>
	                  	</div>
	                  	<div class="form-group row">
	                  		<div class="col-sm-6">
	                  			<div align="center">Provincia</div>
	                    		<input type="text" class="form-control form-control-user" name="Provincia" id="Provincia" placeholder="Provincia">
	                  		</div>
	                  		<div class="col-sm-6">
	                  			<div align="center">Città</div>
	                    		<input type="text" class="form-control form-control-user" name="Citta" id="Citta" placeholder="Città">
	                  		</div>
	                  	</div>
                  	</form>
                  	<br>
                	<button class="btn btn-primary btn-user btn-block" onclick="cercaeventi()">Cerca eventi</button>
                  </div>
		   		</div>
           </div>

		</div>
		
    </div>
	<div class="container-fluid">
		<br>
		<div class="row" id="products"></div>
	</div>
	</div>
</div>
</body>
</html>