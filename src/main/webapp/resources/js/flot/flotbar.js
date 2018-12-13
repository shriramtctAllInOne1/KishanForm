	
$(document).ready(function () {
	createbarGraph();
	createflotpieChart();
});

function createbarGraph(){
	var data = [ ["January", 10], ["February", 8], ["March", 4], ["April", 13], ["May", 17], ["June", 9] ];

	$.plot("#barplaceholder", [ data ], {
		series: {
			bars: {
				show: true,
				barWidth: 0.6,
				align: "center"
			}
		},
		xaxis: {
			mode: "categories",
			tickLength: 0
		},

	});	
}


function createflotpieChart() {

	data = [{
		label: "series1",
		data: 10
	},
	{
		label: "series2",
		data: 20
	},
{
	label: "series3",
	data: 30
}

];
var placeholder = $("#pieflotplaceholder");

$("#example-7").click();

}




// A custom label formatter used by several of the plots

function labelFormatter(label, series) {
return "<div style='font-size:8pt; text-align:center; padding:2px; color:white;'>" + label + "<br/>" + Math.round(series.percent) + "%</div>";
}

//

function setCode(lines) {
$("#code").text(lines.join("\n"));
}
	
	

$("#example-7").click(function() {

	placeholder.unbind();

	$("#title").text("Hidden Labels");
	$("#description").text("Labels can be hidden if the slice is less than a given percentage of the pie (10% in this case).");

	$.plot(placeholder, data, {
		series: {
			pie: { 
				show: true,
				radius: 1,
				label: {
					show: true,
					radius: 2/3,
					formatter: labelFormatter,
					threshold: 0.1
				}
			}
		},
		legend: {
			show: false
		}
	});

	setCode([
		"$.plot('#placeholder', data, {",
		"    series: {",
		"        pie: {",
		"            show: true,",
		"            radius: 1,",
		"            label: {",
		"                show: true,",
		"                radius: 2/3,",
		"                formatter: labelFormatter,",
		"                threshold: 0.1",
		"            }",
		"        }",
		"    },",
		"    legend: {",
		"        show: false",
		"    }",
		"});"
	]);
});
