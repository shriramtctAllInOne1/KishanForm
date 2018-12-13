<div class="col-sm-8 col-lg-8">
	<div class="tabbable">
		<ul class="nav nav-tabs">
			<li class="active"><a href="#tab1" data-toggle="tab">BarChart</a></li>
			<li><a href="#tab2" data-toggle="tab">PieChart</a></li>
			<li><a href="#tab3" data-toggle="tab">jqBarchart</a></li>
			<li><a href="#tab4" data-toggle="tab">jqPiechart</a></li>
		</ul>
		<div class="tab-content">
			<%@ include file="canvasbarchart.jsp"%>
			<%@ include file="canvaspiechart.jsp"%>
			<%@ include file="flotbarchart.jsp"%>
			<%@ include file="flotpiechart.jsp"%>
		</div>
	</div>
</div>