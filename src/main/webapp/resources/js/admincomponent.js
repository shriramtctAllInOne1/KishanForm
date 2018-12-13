
/* admin template */

function StaticsSection(id,newuserCount,membercss ,color,totalmemberlabel, totalmembercount, ntfclass,notificationcnt) {
	
	/*var modalHeader = $('<div/>', {
		"class": "row"
	});*/
	var outerdiv = $('<div/>', {
		"class": "col-md-3 col-sm-3 col-xs-6"
	});
		
	var a = $('<a/>', {
		"data-toggle": "tooltip",
		"class": "well top-block",
		"href" :"#",
		"title":newuserCount
	});
	
	var i = $('<i/>', {
		"class": membercss,
		"style": "color: "+color
	});
	
	var innerdiv = $('<div/>', {
		text:totalmemberlabel
	});
	
	var innerdivvalue = $('<div/>', {
		text:totalmembercount
	});
	
	var span = $('<span/>', {
		"class": ntfclass,
		 text:notificationcnt
			
	});

	
	i.appendTo(a);
	innerdiv.appendTo(a);
	innerdivvalue.appendTo(a);
	span.appendTo(a);
	a.appendTo(outerdiv);
	return outerdiv;
	
}

$(document).ready(function () {

	var memeber =  StaticsSection("memmber","6 new members","glyphicon glyphicon-user"," blue", "Total Members", "507","notification blue","6");
	
	var promember =  StaticsSection("promemmber","4 new pro members","glyphicon glyphicon-star", "green", "Pro Members", "228","notification green", "4");
	
	var sales =  StaticsSection("sales","$34 new sales","glyphicon glyphicon-shopping-cart","yellow", "sales", "$13320","notification yellow","6");

	var msg =  StaticsSection("msg","12 new messages","glyphicon glyphicon-envelope","red", "Message", "222","notification red","12");
	
	$("#mainContent").append(memeber).append(promember).append(sales ).append(msg);
	
	/*
	$('#dashboardId').bind('click', function() {
		$(location).attr('href', "/admin/adminPage");
	});

	$('#mguserId').bind('click', function() {
		$(location).attr('href', "/admin/manageUser");
	});*/
});


















