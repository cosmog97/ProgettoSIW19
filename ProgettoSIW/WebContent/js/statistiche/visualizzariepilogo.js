$.ajax({
	        url: "RiepilogoUtente",
	        type: 'POST',
	        async: true,
	       /* contentType: 'application/json',
	        mimeType: 'application/json',*/
	        success: function (data) {
	          visualizzaDati(data);
	          
	        },
	        error: function() {
	            alert("Errore. Le statistiche non sono state caricate. Ricarica la pagina");
	        }
	    });


function visualizzaDati (data) {
	$("#prossimo").text(data[3]);
	$("#scadenza").text(data[2]); 
	$("#prenotati").text(data[0]); 
	$("#creati").text(data[1]); 
}