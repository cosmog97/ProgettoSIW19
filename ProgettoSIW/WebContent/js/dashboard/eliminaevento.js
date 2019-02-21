/**
 * 
 */

function eliminaEvento(id) {
	$.ajax({
        url: "EliminaEventoCreatore",
        type: 'POST',
        async: true,
        data: JSON.stringify(id),
        success: function (data) {
        	
        },
        error: function() {
            alert("Errore. Non è stato possibile eliminare l'evento. Ricarica la pagina");
        }
    });
}