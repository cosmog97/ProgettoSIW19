function disdiciEvento(id) {
	$.ajax({
        url: "EliminaPrenotazione",
        type: 'POST',
        async: true,
        data: JSON.stringify(id),
        success: function (data) {
        	window.location.replace('eventiprenotati.jsp');
        },
        error: function() {
            alert("Errore. Non e' stato possibile disdire l'evento. Ricarica la pagina");
        }
    });
}