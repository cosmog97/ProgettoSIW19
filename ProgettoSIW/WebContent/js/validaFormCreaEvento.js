function controllaform(){
			var NomeEvento = $.trim($('#NomeEvento').val());
			var Datainizio = $.trim($('#Datainizio').val());
			var DataFine = $.trim($('#DataFine').val());
			var DataScadenza = $.trim($('#DataScadenza').val());
			var Categoria = $.trim($('#Categoria').val());
 			var Provincia = $.trim($('#Provincia').val());
			var Citta = $.trim($('#Citta').val());
			var NumeroPosti = $.trim($('#NumeroPosti').val());
		  	
			
		    // Check if empty of not
		    
		    if (NomeEvento === '' || Datainizio === '' || DataFine === '' || DataScadenza === '' || Categoria === '' || Provincia === '' || Citta === '' || NumeroPosti == '') 
		    {
		        alert('Tutti i campi sono obbligatori');
		        return false;
		    }
		    else{
		   		if((Datainizio >= DataFine && DataScadenza >= DataFine) || (Datainizio >= DataFine && DataScadenza > DataFine) || (Datainizio <= DataFine && DataScadenza > DataFine)){
		    			alert("Controlla le date. La data della fine dell'evento non può essere precedente a quella dell'inizio. La data di scadenza delle prenotazioni deve essere antecedente rispetto all'inizio.");
		    			return false;
		    	}
		   		return true;
		    }
		  }