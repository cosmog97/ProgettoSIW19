$.ajax({
	        url: "InviaStatistiche",
	        type: 'POST',
	        async: true,
	       /* contentType: 'application/json',
	        mimeType: 'application/json',*/
	        success: function (data) {
	          setGrafico(data);
	          
	        },
	        error: function() {
	            alert("Errore. Le statistiche non sono state caricate. Ricarica la pagina");
	        }
	    });

function setGrafico(data1) {
	//Set new default font family and font color to mimic Bootstrap's default styling
	Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
	Chart.defaults.global.defaultFontColor = '#858796';
	var numEventi = data1[8];
	var numUtenti = data1[9];
	data1.splice(9,1);
	data1.splice(8,1);
	// Pie Chart Example
	var ctx = document.getElementById("myPieChart");
	var myPieChart = new Chart(ctx, {
	  type: 'doughnut',
	  data: {
	    labels: ["Cinema", "Convegni", "Feste","Musica","Istruzione","Sport","Teatro","Viaggi"],
	    datasets: [{
	      data: data1,
	      backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc','#ff69b4','#ff0000', '#FFD700', '#BA55D3','#ADD8E6'],
	      hoverBackgroundColor: ['#2e59d9', '#17a673', '#2c9faf','#ff1493','#DC143C', '#BDB76B', '#9932CC','#87CEEB'],
	      hoverBorderColor: "rgba(234, 236, 244, 1)",
	    }],
	  },
	  options: {
	    maintainAspectRatio: false,
	    tooltips: {
	      backgroundColor: "rgb(255,255,255)",
	      bodyFontColor: "#858796",
	      borderColor: '#dddfeb',
	      borderWidth: 1,
	      xPadding: 15,
	      yPadding: 15,
	      displayColors: false,
	      caretPadding: 10,
	    },
	    legend: {
	      display: false
	    },
	    cutoutPercentage: 80,
	  },
	});
	
	$("#numeventi").text("Su eBooker sono stati creati "+numEventi+" eventi.");
	$("#numutenti").text("Su eBooker sono presenti "+numUtenti+" utenti.");
}