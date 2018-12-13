$(document).ready(
		function() {
			var defaultTheme = 'classic';
			var currentTheme = $.cookie('currentTheme') == null ? defaultTheme
					: $.cookie('currentTheme');
			var msie = navigator.userAgent.match(/msie/i);
			$.browser = {};
			$.browser.msie = {};
			switchTheme(currentTheme);
			$('#themes a').click(function(e) {
				e.preventDefault();
				currentTheme = $(this).attr('data-value');
				$.cookie('currentTheme', currentTheme, {
					expires : 365
				});
				switchTheme(currentTheme);
			});

			function switchTheme(themeName) {
				if (themeName == 'classic') {
					$('#bs-css').attr('href', '/resources/css/bootstrap.min.css');
				} else {
					$('#bs-css').attr('href',
							'/resources/css/bootstrap-' + themeName + '.min.css');
				}
				$('#themes i').removeClass('glyphicon glyphicon-ok whitespace')
						.addClass('whitespace');
				$('#themes a[data-value=' + themeName + ']').find('i')
						.removeClass('whitespace').addClass(
								'glyphicon glyphicon-ok');
			}

		});
