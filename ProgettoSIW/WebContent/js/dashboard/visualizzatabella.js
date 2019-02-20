
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

	function json2table(json, classes) {
		  var cols = Object.keys(json[0]);
		  
		  var headerRow = '';
		  var bodyRows = '';
		  
		  classes = classes || '';

		  function capitalizeFirstLetter(string) {
		    return string.charAt(0).toUpperCase() + string.slice(1);
		  }

		  cols.map(function(col) {
		    headerRow += '<th>' + capitalizeFirstLetter(col) + '</th>';
		  });

		  json.map(function(row) {
		    bodyRows += '<tr>';

		    cols.map(function(colName) {
		      bodyRows += '<td>' + row[colName] + '</td>';
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

		/* Live example */

	/*	var dom = {
		  data: document.getElementById('data'),
		  table: document.getElementById('tableGoesHere'),
		};

		dom.data.value = JSON.stringify(defaultData);
		dom.data.addEventListener('input', function() {
		  dom.table.innerHTML = json2table(JSON.parse(dom.data.value), 'table');
		});
*/
}