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
               <br>
               <div align="center">	${sessionScope.Nome}, cerca i tuoi eventi preferiti. Compila il seguente modulo per perfezionare la ricerca.</div>
                <div class="p-4">
                  <div>
           
                  	<form class="user">
                  	    <div class="form-group">
                  			<div align="center">Nome evento</div>
                  			<input type="text" class="form-control" id="Nomeevento" placeholder="Nome evento">
                		</div>
                  		<div class="form-group row">
	                  		<div class="col-sm-6">
	                  			<div align="center">Categoria</div>
	                    		<select class="form-control" required id="Categoria">
	                    							<option value="Qualsiasi">Qualsiasi</option>
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
	                  		<div class="col-sm-6">
	                  			<div align="center">Creatore</div>
	                    		<input type="text" class="form-control" name="Creatore" id="Creatore" placeholder="Creatore">
	                  		</div>
	                  	</div>
                  		<div class="form-group row">
	                  		<div class="col-sm-6">
	                  			<div align="center">Data evento</div>
	                    		<input type="date" class="form-control" name="Datainizio" id="Datainizio" placeholder="Data inizio evento">
	                  		</div>
	                  		<div class="col-sm-6">
	                  			<div align="center">Posti disponibili</div>
	                    		<input type="number" class="form-control" name="Numposti" id="Numposti" placeholder="Numeri posti disponibili">
	                  		</div>
	                  	</div>
	                  	<div class="form-group row">
	                  		<div class="col-sm-6">
	                  		
	                  			<div align="center">Provincia</div>
	                    		<select class="form-control" id="Provincia" required>
	                    		</select>
	                    		<script src='js/loadProvince.js'></script>
	                  		</div>
	                  		<div class="col-sm-6">
	                  			<div align="center">Città</div>
	                    		<input type="text" class="form-control" name="Citta" id="Citta" placeholder="Città">
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