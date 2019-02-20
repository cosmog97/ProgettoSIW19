

function visualizzaEventi() {
	$.ajax({
        url: "VisualizzaEventiCreati",
        type: 'POST',
        async: true,
        /*contentType: "application/json",
      /*  data: json,
       /* contentType: 'application/json',
        mimeType: 'application/json',*/
        success: function (data) {
          //console.log(data);
          //data1 = JSON.parse(JSON.stringify(data));
        	console.log(data);

        },
        error: function() {
            alert("Errore. La visualizzazione non è andata a buon fine. Ricarica la pagina");
        }
    });
}