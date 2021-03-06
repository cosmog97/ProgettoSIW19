/**
 * 
 */
$.ajax({
        url: "VisualizzaEventiPrenotati",
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

	function json2table(json, classes) {
		  var cols = Object.keys(json[0]);

		  //cols.splice(3,1); //controllare bene
		  cols.splice(0,1);
		  cols.push('Azione');
		  
		  var headerRow = '';
		  var bodyRows = '';
		  
		  classes = classes || '';

		  function capitalizeFirstLetter(string) {
	
			  if(string == 'nummaxprenotati') {
					 return "Num. max prenotati";
				 }
				 if(string == 'numattualeprenotati'){
					 return "Num. prenotati";
				 }
				 if(string == 'citta') {
					 return "Citta'";
				 }
		    return string.charAt(0).toUpperCase() + string.slice(1);
		  }

		  cols.map(function(col) {
		    headerRow += '<th>' + capitalizeFirstLetter(col) + '</th>';
		  });

		  json.map(function(row) {
		    bodyRows += '<tr>';

		    cols.map(function(colName) {
		      if (colName != 'Azione') {
		    	  bodyRows += '<td>' + row[colName] + '</td>';
		      }
		      else {
		    	  id = row['id'];
		    	  bodyRows += '<td>' + '<button class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" onclick="disdiciEvento('+id+')">Disdici</button>' + '</td>';
		      }
		      
		    })

		    bodyRows += '</tr>';
		  });

		  return '<table class="' +
		         classes +
		         '"><thead><tr>' +
		         headerRow +
		         '</tr></thead><tbody>' +
		         bodyRows +
		         '</tbody></table>';
		}

		/* How to use it */

	


function visualizzaTuoiEventi(data) {
	
	var defaultData = data;

	document.getElementById('tableGoesHere').innerHTML = json2table(defaultData, 'table');

}