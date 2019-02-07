<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


<!DOCTYPE html><html class=''>
<head><script src='//production-assets.codepen.io/assets/editor/live/console_runner-079c09a0e3b9ff743e39ee2d5637b9216b3545af0de366d4b9aad9dc87e26bfd.js'></script><script src='//production-assets.codepen.io/assets/editor/live/events_runner-73716630c22bbc8cff4bd0f07b135f00a0bdc5d14629260c3ec49e5606f98fdd.js'></script><script src='//production-assets.codepen.io/assets/editor/live/css_live_reload_init-2c0dc5167d60a5af3ee189d570b1835129687ea2a61bee3513dee3a50c115a77.js'></script><meta charset='UTF-8'><meta name="robots" content="noindex"><link rel="shortcut icon" type="image/x-icon" href="//production-assets.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico" /><link rel="mask-icon" type="" href="//production-assets.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg" color="#111" /><link rel="canonical" href="https://codepen.io/ericwinton/pen/jqKyyq?depth=everything&order=popularity&page=7&q=product&show_forks=false" />

<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
<style class="cp-pen-styles">body {
	padding-top: 30px;
}
.product {
	margin-bottom: 30px;
}
.product-inner {
	box-shadow: 0 0 10px rgba(0,0,0,.2);
	padding: 10px;
}
.product img {
	margin-bottom: 10px;
}</style></head><body>
<div class="container">
	<div class="row" id="search">
		<form id="search-form" action="" method="POST" enctype="multipart/form-data">
			<div class="form-group col-xs-9">
				<input class="form-control" type="text" placeholder="Search" />
			</div>
			<div class="form-group col-xs-3">
				<button type="submit" class="btn btn-block btn-primary">Search</button>
			</div>
		</form>
	</div>
	<div class="row" id="filter">
		<form>
			<div class="form-group col-sm-3 col-xs-6">
				<select data-filter="make" class="filter-make filter form-control">
					<option value="">Select Make</option>
					<option value="">Show All</option>
				</select>
			</div>
			<div class="form-group col-sm-3 col-xs-6">
				<select data-filter="model" class="filter-model filter form-control">
					<option value="">Select Model</option>
					<option value="">Show All</option>
				</select>
			</div>
			<div class="form-group col-sm-3 col-xs-6">
				<select data-filter="type" class="filter-type filter form-control">
					<option value="">Select Type</option>
					<option value="">Show All</option>
				</select>
			</div>
			<div class="form-group col-sm-3 col-xs-6">
				<select data-filter="price" class="filter-price filter form-control">
					<option value="">Select Price Range</option>
					<option value="">Show All</option>
				</select>
			</div>
		</form>
	</div>
	<div class="row" id="products">
		
	</div>
</div>
<script src='//production-assets.codepen.io/assets/common/stopExecutionOnTimeout-b2a7b3fe212eaa732349046d8416e00a9dec26eb7fd347590fbced3ab38af52e.js'></script><script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.2/jquery.min.js'></script><script src='//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>
<script >data = [
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nomeevento": "Mamma",
		"categoria": "Sesso",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "sesso",
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	}

];

var nomeevento = "";
var categoria = "";
var datainizio = "";
var datafine = "";
var datascadenza = "";
var creatoreevento = "";
var postidisponibili = "1";
var image="";

for (var i = 0; i < data.length; i++) {if (window.CP.shouldStopExecution(1)){break;}
	var nomeevento = data[i].nomeevento,
		categoria = data[i].categoria,
		datainizio = data[i].datainizio,
		datafine = data[i].datafine
		datascadenza = data[i].datascadenza,
		creatoreevento = data[i].creatoreevento,
		postidisponibili = "1",
		image = data[i].image;

		
		//create product cards
		products += "<div class='col-sm-4 product' data-nomeevento='"+nomeevento+"' data-categoria='"+categoria+"' data-datainizio='"+datainizio+"' data-datafine='"+datafine+"' data-datascadenza='"+datascadenza+"' data-creatoreevento='"+creatoreevento+"' data-postidisponibili='"+postidisponibili+"'><div class='product-inner text-center'><img src='"+image+"'><br />Nome evento "+nomeevento +"<br />Categoria: "+categoria+"<br />Data inizio: "+datainizio+"<br />Data fine: "+datafine+"<br />Data scadenza: "+datascadenza+"<br />Creatore : "+creatoreevento+"<br />Posti disponibili: "+postidisponibili+"</div></div>";
		
		//create dropdown of nomeevento
		if (nomeevento.indexOf("<option value='"+nomeevento+"'>"+nomeevento+"</option>") == -1) {
			nomeevento += "<option value='"+nomeevento+"'>"+nomeevento+"</option>";
		}
		
		//create dropdown of categoria
		if (categoria.indexOf("<option value='"+categoria+"'>"+categoria+"</option>") == -1) {
			categoria += "<option value='"+categoria+"'>"+categoria+"</option>";
		}
		
		//create dropdown of datainizio
		if (datainizio.indexOf("<option value='"+datainizio+"'>"+datainizio+"</option>") == -1) {
			datainizio += "<option value='"+datainizio+"'>"+datainizio+"</option>";
		}
		
		//create dropdown of datafine
		if (datafine.indexOf("<option value='"+datafine+"'>"+datafine+"</option>") == -1) {
			datafine += "<option value='"+datafine+"'>"+datafine+"</option>";
		}
		
		//create dropdown of datascadenza
		if (datascadenza.indexOf("<option value='"+datascadenza+"'>"+datascadenza+"</option>") == -1) {
			datascadenza += "<option value='"+datascadenza+"'>"+datascadenza+"</option>";
		}
		
		//create dropdown of creatoreevento
		if (creatoreevento.indexOf("<option value='"+creatoreevento+"'>"+creatoreevento+"</option>") == -1) {
			creatoreevento += "<option value='"+creatoreevento+"'>"+creatoreevento+"</option>";
		}
		
		//create dropdown of postidisponibili
		if (postidisponibili.indexOf("<option value='"+postidisponibili+"'>"+postidisponibili+"</option>") == -1) {
			postidisponibili += "<option value='"+postidisponibili+"'>"+postidisponibili+"</option>";
		}
	}
	window.CP.exitedLoop(1);


	$("#products").html(products);
	$(".filter-nomeutente").append(nomeutente);
	$(".filter-categoria").append(categoria);
	$(".filter-datainizio").append(datainizio);
	$(".filter-datafine").append(datafine);
	$(".filter-datascadenza").append(datascadenza);
	$(".filter-creatoreevento").append(creatoreevento);
	$(".filter-postidisponibili").append(postidisponibili);

	var filtersObject = {};

	//on filter change
	$(".filter").on("change",function() {
		var filterName = $(this).data("filter"),
			filterVal = $(this).val();
		
		if (filterVal == "") {
			delete filtersObject[filterName];
		} else {
			filtersObject[filterName] = filterVal;
		}
		
		var filters = "";
		
		for (var key in filtersObject) {if (window.CP.shouldStopExecution(2)){break;}
		  	if (filtersObject.hasOwnProperty(key)) {
				filters += "[data-"+key+"='"+filtersObject[key]+"']";
		 	 }
		}
	window.CP.exitedLoop(2);

		
		if (filters == "") {
			$(".product").show();
		} else {
			$(".product").hide();
			$(".product").hide().filter(filters).show();
		}
	});

	//on search form submit
	$("#search-form").submit(function(e) {
		e.preventDefault();
		var query = $("#search-form input").val().toLowerCase();

		$(".product").hide();
		$(".product").each(function() {
			var nomeevento = $(this).data("nomeevento").toLowerCase(),
				categoria = $(this).data("categoria").toLowerCase(),
				datainizio = $(this).data("datainizio").toLowerCase(),
				datafine = $(this).data("datafine").toLowerCase(),
				datascadenza = $(this).data("datascadenza").toLowerCase(),
				creatoreevento = $(this).data("creatoreevento").toLowerCase(),
				postidisponibili = $(this).data("postidisponibili").toLowerCase();

			if (   nomeevento.indexOf(query) > -1 
				|| categoria.indexOf(query) > -1 
				|| datainizio.indexOf(query) > -1 
				|| datafine.indexOf(query) > -1
				|| datascadenza.indexOf(query) > -1
				|| creatoreevento.indexOf(query) > -1
				|| postidisponibili.indexOf(query) > -1) {
				$(this).show();
			}
		});
	});
	//# sourceURL=pen.js

	
//# sourceURL=pen.js
</script>
</body>
</html>