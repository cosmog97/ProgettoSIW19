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

function setGrafico(data) {
	//Set new default font family and font color to mimic Bootstrap's default styling
	Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
	Chart.defaults.global.defaultFontColor = '#858796';
	
	// Pie Chart Example
	var ctx = document.getElementById("myPieChart");
	var myPieChart = new Chart(ctx, {
	  type: 'doughnut',
	  data: {
	    labels: ["Cinema", "Convegni", "Social","Sesso"],
	    datasets: [{
	      data: [55, 30, 10, 5],
	      backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc','#1cc88a'],
	      hoverBackgroundColor: ['#2e59d9', '#17a673', '#2c9faf','#17a673'],
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
}