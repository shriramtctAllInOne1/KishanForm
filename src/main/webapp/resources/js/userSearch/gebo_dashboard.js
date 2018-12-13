/* [ ---- Gebo Admin Panel - dashboard ---- ] */

	$(document).ready(function() {
		
		//* sortable/searchable list
		gebo_flist.init();
		var lastWindowHeight = $(window).height();
		var lastWindowWidth = $(window).width();		
	});




	//* filterable list
	gebo_flist = {
		init: function(){
			//*typeahead
			var list_source = [];
			$('.user_list li').each(function(){
				var search_name = $(this).find('.sl_name').text();
				//var search_email = $(this).find('.sl_email').text();
				list_source.push(search_name);
			});
		
			
			var options = {
					valueNames: [ 'sl_name', 'sl_status', 'sl_email' ],
					page: 5,
					plugins: [
						[ 'paging', {
							pagingClass	: "bottomPaging",
							innerWindow: 1,
							outerWindow: 2
						} ]
					]
				},
				userList = new List('user-list', options);
			
			$('#filter-online').on('click',function() {
				$('ul.filter li').removeClass('active');
				$(this).parent('li').addClass('active');
				userList.filter(function(item) {
					return item.values().sl_status == "online";
				});
				return false;
			});
			$('#filter-offline').on('click',function() {
				$('ul.filter li').removeClass('active');
				$(this).parent('li').addClass('active');
				userList.filter(function(item) {
					return item.values().sl_status == "offline";
				});
				return false;
			});
			$('#filter-none').on('click',function() {
				$('ul.filter li').removeClass('active');
				$(this).parent('li').addClass('active');
				userList.filter();
				return false;
			});
			
			$('#user-list').on('click','.sort',function(){
					$('.sort').parent('li').removeClass('active');
					if($(this).parent('li').hasClass('active')) {
						$(this).parent('li').removeClass('active');
					} else {
						$(this).parent('li').addClass('active');
					}
				}
			);
		}
	};
	