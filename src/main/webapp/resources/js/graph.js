
$(document).ready(function () {
	
	var barLabelArray=["January","February","March","April","May","June","July"];
	var barchartdataArray= [1,2,3,4,5,6,7];
	createbarChart( barLabelArray, barchartdataArray)
	createpiechart();
	
	
});
	

function createbarChart( barLabelArray, barchartdataArray){
	var barChartData = {
			labels : barLabelArray,
			datasets : [
				{
					fillColor : "#FB9C87",
					strokeColor : "rgba(220,220,220,0.8)",
					highlightFill: "rgba(220,220,220,0.75)",
					highlightStroke: "rgba(220,220,220,1)",
					data : barchartdataArray
				}
			]

		}
		window.onload = function(){
			var ctx = document.getElementById("barcanvas").getContext("2d");
			window.myBar = new Chart(ctx).Bar(barChartData, {
				responsive : true
			});
		}
	
}


function createpiechart() {
	var pieData = [

	{
		value : 300,
		color : "#F7464A",
		highlight : "#FF5A5E",
		label : "Red",
		labelColor : 'white',
		labelFontSize : '16'
	}, {
		value : 50,
		color : "#46BFBD",
		highlight : "#5AD3D1",
		label : "Green",
		labelColor : 'white',
		labelFontSize : '16'
	}, {
		value : 100,
		color : "#FDB45C",
		highlight : "#FFC870",
		label : "Yellow",
		labelColor : 'white',
		labelFontSize : '16'
	}, {
		value : 40,
		color : "#949FB1",
		highlight : "#A8B3C5",
		label : "Grey",
		labelColor : 'white',
		labelFontSize : '16'
	}, {
		value : 120,
		color : "#4D5360",
		highlight : "#616774",
		label : "Dark Grey",
		labelColor : 'white',
		labelFontSize : '16'
	} ];
	
	 var options= {
		        //Boolean - Whether we should show a stroke on each segment
		        segmentShowStroke : true,

		      /*  //String - The colour of each segment stroke
		        segmentStrokeColor : "#fff",

		        //Number - The width of each segment stroke
		        segmentStrokeWidth : 2,

		        //The percentage of the chart that we cut out of the middle.
		        percentageInnerCutout : 50,

		        //Boolean - Whether we should animate the chart
		        animation : true,

		        //Number - Amount of animation steps
		        animationSteps : 100,

		        scaleShowLabels : false,

		        //String - Animation easing effect
		        animationEasing : "easeOutBounce",

		        //Boolean - Whether we animate the rotation of the Doughnut
		        animateRotate : true,

		        //Boolean - Whether we animate scaling the Doughnut from the centre
		        animateScale : true,*/

		        //Function - Will fire on animation completion.
		        onAnimationComplete : null,

		        scaleLabelPaddingX: 35,
		        scaleFontFamily : "'Arial'",
		        scaleFontSize : 12,
		        scaleFontStyle : "normal",
		        scaleFontColor : "#666",
		        scaleLabel : "23"
		    };
	var myPie = new Chart(document.getElementById("piecanvas").getContext("2d"))
			.Pie(pieData,options, {
				animationSteps : 100,
				animationEasing : 'easeInOutQuart',
				legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>",
				scaleShowLabels: true,
				scaleLabelPaddingX: 35,
				scaleFontFamily : "'Arial'",
				scaleFontSize : 12,
				scaleFontStyle : "normal",
				scaleFontColor : "#666",
				scaleLabel : "<%=value%>",
			});


 
var legend = myPie.generateLegend();
$("#legend").html(legend);
}
