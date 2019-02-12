/**
 * 
 */
function cercaeventi () {
	data1 = [];
	console.log("Prima");
	
	$.ajax({
	        url: "CercaEventi",
	        type: 'POST',
	        async: false,
	        success: function (data) {
	          //console.log(data);
	          //data1 = JSON.parse(JSON.stringify(data));
	        	mostraeventi(JSON.parse(JSON.stringify(data)));

	        },
	        error: function() {
	            alert("Errore. La ricerca non è andata a buon fine. Ricarica la pagina");
	        }
	    });
	

	console.log("End Prima");	
}

function mostraeventi(data1) {
	var nomeevento = "";
	var categoria = "";
	var datainizio = "";
	var datafine = "";
	var datascadenza = "";
	var creatoreevento = "";
	var postidisponibili = "";
	var citta="";
	var provincia="";
	var image="";
	var products="";

	for (var i = 0; i < data1.length; i++) {
		var nomeevento = data1[i].nome,
			categoria = data1[i].categoria,
			datainizio = data1[i].inizio,
			datafine = data1[i].fine,
			datascadenza = data1[i].scadenza,
			creatoreevento = data1[i].creatore,
			postidisponibili = data1[i].nummaxprenotati - data1[i].numattualeprenotati,
			citta = data1[i].citta,
			provincia = data1[i].provincia,
			image = "http://www.sweetwater.com/images/items/120/HBII10BGWB-medium.jpg?982763";
	
			
			//create product cards
			products += "<div class='col-sm-4 product' data-nomeevento='"+nomeevento+"' data-categoria='"+categoria+"' data-datainizio='"+datainizio+"' data-datafine='"+datafine+"' data-datascadenza='"+datascadenza+"' data-creatoreevento='"+creatoreevento+"' data-postidisponibili='"+postidisponibili+"' data-citta='"+citta+"' data-provincia='"+provincia+"'><div class='product-inner text-center'><img src='"+image+"'><br />Nome evento: "+nomeevento +"<br />Categoria: "+categoria+"<br />Data inizio: "+datainizio+"<br />Data fine: "+datafine+"<br />Data scadenza: "+datascadenza+"<br />Creatore : "+creatoreevento+"<br />Posti disponibili: "+postidisponibili+"<br />Città: "+citta+" <br />Posti disponibili: "+provincia+"</div></div>";
	
		}


	$("#products").html(products);
}