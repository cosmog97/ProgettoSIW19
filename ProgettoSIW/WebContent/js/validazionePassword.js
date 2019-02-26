function validazionepassword() {

	var vecchiapws = $('#Vecchiapassword').val();
	var nuovapsw = $('#Nuovapassword').val();
	var ripetipws = $('#Ripetinuovapassword').val();

	if (vecchiapws === '' || nuovapsw === '' || ripetipws === '') {
		alert("Controlla i campi. Non possono essere vuoti.");
		return false;
	}
	else {
		if (nuovapsw == ripetipws) {
			return true;
		} else {
			alert("Nuova password e Ripeti nuova password non coincidono.");
			return false;
		}
		
	}
}