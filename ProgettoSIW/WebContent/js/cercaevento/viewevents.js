/**
 * 
 */
data = [
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
var postidisponibili = "";
var image="";
var products="";

for (var i = 0; i < data.length; i++) {if (window.CP.shouldStopExecution(1)){break;}
	var nomeevento = data[i].nomeevento,
		categoria = data[i].categoria,
		datainizio = data[i].datainizio,
		datafine = data[i].datafine
		datascadenza = data[i].datascadenza,
		creatoreevento = data[i].creatoreevento,
		postidisponibili = "",
		image = data[i].image;

		
		//create product cards
		products += "<div class='col-sm-4 product' data-nomeevento='"+nomeevento+"' data-categoria='"+categoria+"' data-datainizio='"+datainizio+"' data-datafine='"+datafine+"' data-datascadenza='"+datascadenza+"' data-creatoreevento='"+creatoreevento+"' data-postidisponibili='"+postidisponibili+"'><div class='product-inner text-center'><img src='"+image+"'><br />Nome evento: "+nomeevento +"<br />Categoria: "+categoria+"<br />Data inizio: "+datainizio+"<br />Data fine: "+datafine+"<br />Data scadenza: "+datascadenza+"<br />Creatore : "+creatoreevento+"<br />Posti disponibili: "+postidisponibili+"</div></div>";

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