function indexToCercaEvento () {
	var nome = $('#Nome').val();
	var categoria = $('#Categoria').val();
	var provincia = $('#Provincia').val();
	var dataEvento = $('#DataEvento').val();
	location.replace("cercaevento.jsp");
	$(document).ready(function(){
		    $('#Nomeevento').val(nome);
			$('#Categoria').val(categoria);
			$('#Provincia').val(provincia);
			$('#Datainizio').val(dataEvento);
	});
}