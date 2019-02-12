/**
 * 
 */
function cercaeventi () {
	array = [];
	
	nomeevento = $("#Nomeevento").val();
	categoria = $("#Categoria").val();
	creatore = $("#Creatore").val();
	datainizio = $("#Datainizio").val();
	numeroposti = $("#Numposti").val();
	provincia = $("#Provincia").val();
	citta = $("#Citta").val();

	array.push(nomeevento);
	array.push(categoria);
	array.push(creatore);
	array.push(datainizio);
	array.push(numeroposti);
	array.push(provincia);
	array.push(citta);
	
	var json = JSON.stringify(array);
	console.log(json);
	$.ajax({
	        url: "CercaEventi",
	        type: 'POST',
	        async: true,
	        data: json,
	        contentType: 'application/json',
	        mimeType: 'application/json',
	        success: function (data) {
	          //console.log(data);
	          //data1 = JSON.parse(JSON.stringify(data));
	        	mostraeventi(JSON.parse(JSON.stringify(data)));

	        },
	        error: function() {
	            alert("Errore. La ricerca non è andata a buon fine. Ricarica la pagina");
	        }
	    });
}

function mostraeventi(data1) {
	var id = "";
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
			id = data1[i].id,
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
			products += "<div class='col-sm-4 product' data-nomeevento='"+nomeevento+"' data-categoria='"+categoria+"' data-datainizio='"+datainizio+"' data-datafine='"+datafine+"' data-datascadenza='"+datascadenza+"' data-creatoreevento='"+creatoreevento+"' data-postidisponibili='"+postidisponibili+"' data-citta='"+citta+"' data-provincia='"+provincia+"'><div class='product-inner text-center'><img src='"+image+"'><br />Nome evento: "+nomeevento +"<br />Categoria: "+categoria+"<br />Data inizio: "+datainizio+"<br />Data fine: "+datafine+"<br />Data scadenza: "+datascadenza+"<br />Creatore : "+creatoreevento+"<br />Posti disponibili: "+postidisponibili+"<br />Citta': "+citta+" <br />Provincia: "+provincia+"<br />Test</div></div>";
	
		}


	$("#products").html(products);
}