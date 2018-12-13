$(document).ready(function() {

	$('#dashboardId').bind('click', function() {
		$(location).attr('href', "/admin/adminPage");
	});

	$('#mguserId').bind('click', function() {
		$(location).attr('href', "/admin/manageUser");
	});

});
