

function cercaTuoiEventi() {

	$.ajax({
        url: "VisualizzaEventiCreati",
        type: 'POST',
        async: true,
        /*contentType: "application/json",
      /*  data: json,
       /* contentType: 'application/json',
        mimeType: 'application/json',*/
        success: function (data) {
        	visualizzaTuoiEventi(data);
        },
        error: function() {
            alert("Errore. La visualizzazione non è andata a buon fine. Ricarica la pagina");
        }
    });

}


function visualizzaTuoiEventi(data) {
	console.log(data);
}