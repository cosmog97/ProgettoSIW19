/**
 * 
 */

function controllaformregister(){
			
			var Username = $.trim($('#Username').val());
			var Email = $.trim($('#Email').val());
			var Cognome = $.trim($('#Cognome').val());
			var Nome = $.trim($('#Nome').val());
			var Password = $.trim($('#Password').val());
 			var Ripetipassword = $.trim($('#Ripetipassword').val());
			var NumeroTelefono = $.trim($('#Numerotelefono').val());
			var Datanascita = $.trim($('#Datanascita').val());
			var Provincia = $.trim($('#Provincia').val());
			var Citta = $.trim($('#Citta').val());
		  	
			
		    // Check if empty of not
		    
		    if (Username === '' || Email === '' || Cognome === '' || Nome === '' || Password === '' || Password === '' || Ripetipassword === '' || NumeroTelefono === '' || Datanascita === '' || Provincia === '' || Citta === '') 
		    {
		        alert('Tutti i campi sono obbligatori');
		        return false;
		    }
		    else {
		    	if (Password === Ripetipassword){
		    		return true;
		    	}
		    	else {
		    		alert("I campi Password e Ripeti Password deve essere identici.")
		    		return false;
		    	}
		    }
		    
		    
		    
}