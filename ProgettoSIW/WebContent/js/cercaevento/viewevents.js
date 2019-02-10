/**
 * 
 */
var ok = [];
var data1 = [
	{
		"nome": "Pasta 4Formaggi",
		"categoria": "Cibo",
		"inizio": "84/37/4841",
		"fine": "84/37/4841",
		"scadenza": "84/37/4841",
		"creatore": "oppi96",
		"numattualeprenotati": 30,
		"nummaxprenotati": 40,
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	},
	{
		"nome": "Pasta 4Formaggi",
		"categoria": "Cibo",
		"inizio": "84/37/4841",
		"fine": "84/37/4841",
		"scadenza": "84/37/4841",
		"creatore": "oppi96",
		"numattualeprenotati": 30,
		"nummaxprenotati": 40,
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	}];
console.log("Prima");
console.log(data1);
console.log("End Prima");
$.ajax({
        url: "CercaEventi",
        type: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        mimeType: 'application/json',
 
        success: function (data) {
          var test = JSON.parse(JSON.stringify(data));
          ok = data1.concat(test);
          console.log("Json");
          console.log(ok);
          console.log("End Json");
        },
        error:function() {
            alert("error");
        }
    });
console.log("Dopo");
console.log(test);
console.log("End Dopo");
/*data = [
	{
		"nome": "Pasta 4Formaggi",
		"categoria": "Cibo",
		"datainizio": "84/37/4841",
		"fine": "84/37/4841",
		"scadenza": "84/37/4841",
		"creatore": "oppi96",
		"numattualeprenotati": 30,
		"nummaxprenotati": 40,
		"image":"http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763"
	}];
data = [
	{
		"nomeevento": "Pasta 4Formaggi",
		"categoria": "Cibo",
		"datainizio": "84/37/4841",
		"datafine": "84/37/4841",
		"datascadenza": "84/37/4841",
		"creatoreevento": "oppi96",
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
*/
var nomeevento = "";
var categoria = "";
var datainizio = "";
var datafine = "";
var datascadenza = "";
var creatoreevento = "";
var postidisponibili = "";
var image="";
var products="";

for (var i = 0; i < data1.length; i++) {if (window.CP.shouldStopExecution(1)){break;}
	var nomeevento = data1[i].nome,
		categoria = data1[i].categoria,
		datainizio = data1[i].inizio,
		datafine = data1[i].fine,
		datascadenza = data1[i].scadenza,
		creatoreevento = data1[i].creatore,
		postidisponibili = data1[i].nummaxprenotati - data1[i].numattualeprenotati,
		image = "http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763";

		
		//create product cards
		products += "<div class='col-sm-4 product' data-nomeevento='"+nomeevento+"' data-categoria='"+categoria+"' data-datainizio='"+datainizio+"' data-datafine='"+datafine+"' data-datascadenza='"+datascadenza+"' data-creatoreevento='"+creatoreevento+"' data-postidisponibili='"+postidisponibili+"'><div class='product-inner text-center'><img src='"+image+"'><br />Nome evento: "+nomeevento +"<br />Categoria: "+categoria+"<br />Data inizio: "+datainizio+"<br />Data fine: "+datafine+"<br />Data scadenza: "+datascadenza+"<br />Creatore : "+creatoreevento+"<br />Posti disponibili: "+postidisponibili+"</div></div>";

	}
	window.CP.exitedLoop(1);


	$("#products").html(products);
	$(".filter-nomeutente").append(nomeevento);
	$(".filter-categoria").append(categoria);
	$(".filter-datainizio").append(datainizio);
	$(".filter-datafine").append(datafine);
	$(".filter-datascadenza").append(datascadenza);
	$(".filter-creatoreevento").append(creatoreevento);
	$(".filter-postidisponibili").append(postidisponibili);

	var filtersObject = {};

	//on filter change
	$(".filter").on("change",function() {
		var filterName = $(this).data1("filter"),
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
			var nomeevento = $(this).data1("nomeevento").toLowerCase(),
				categoria = $(this).data1("categoria").toLowerCase(),
				datainizio = $(this).data1("datainizio").toLowerCase(),
				datafine = $(this).data1("datafine").toLowerCase(),
				datascadenza = $(this).data1("datascadenza").toLowerCase(),
				creatoreevento = $(this).data1("creatoreevento").toLowerCase(),
				postidisponibili = $(this).data1("postidisponibili").toLowerCase();

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