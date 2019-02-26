function controllaform(){
			var NomeEvento = $.trim($('#NomeEvento').val());
			var DataInizio = $.trim($('#Datainizio').val());
			var DataFine = $.trim($('#DataFine').val());
			var DataScadenza = $.trim($('#DataScadenza').val());
			var Categoria = $.trim($('#Categoria').val());
 			var Provincia = $.trim($('#Provincia').val());
			var Citta = $.trim($('#Citta').val());
			var NumeroPosti = $.trim($('#NumeroPosti').val());
		  	
			
		    // Check if empty of not
		    
		    if (NomeEvento === '' || DataInizio === '' || DataFine === '' || DataScadenza === '' || Categoria === '' || Provincia === '' || Citta === '' || NumeroPosti == '') 
		    {
		        alert('Tutti i campi sono obbligatori');
		        return false;
		    }
		    else{
		    	var dataAttuale = Date.now();
		    	var timestamp = dataAttuale.getTime();
		    	console.log(timestamp);
		   		if(DataInizio > DataScadenza && DataFine > DataScadenza && DataFine > DataInizio){
		    			return true;
		    	}
		   		else{
		   			alert("Controlla le date. La data della fine dell'evento non può essere precedente a quella dell'inizio. La data di scadenza delle prenotazioni deve essere antecedente rispetto all'inizio. Le date non possono essere antecedenti all'ora attuale.");
		   			return false;
		   		}
		   		
		    }
		  }