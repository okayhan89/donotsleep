<script type="text/javascript">
	
</script>

<style type="text/css">
.form-horizontal .form-group {
	padding-top: 10px;
}
</style>

<div class="bg-light lter b-b wrapper-md">
	<h1 class="m-n font-thin h5 font-bold">Content Manange > Total HashTag Information1</h1>
</div>

<div class="wrapper-md" ng-controller="TotalHashTagInfoController">
	<!-- search part -->
	<div class="row col-md-8 col-md-offset-4">
		<div class="panel panel-default"
			style="padding-left: 10px; padding-right: 10px;">
			<form class="form-horizontal" action="formActionBody" method="POST"
				name="frm">
				<div class="row" style="padding-top: 10px;">
					<div class="col-md-1">
						<label class="control-label">Search</label>
					</div>
					<div class="col-md-3">
						<select class="form-control" id="select" name="select">
							<option>ALL</option>
							<option>Primary HashTag</option>
							<option>Optional HashTag</option>
							<option>User Alias</option>
						</select>
					</div>
					<div class="col-md-8">
						<input type="text" class="form-control" id="text" name="text"
							placeholder="입력하세요." />
					</div>
				</div>
				<div class="row" style="padding-bottom: 10px; padding-top: 10px;">
					<div class="col-sm-1 col-xs-12">
						<label class="control-label">Period</label>
					</div>
					<div class="col-sm-2 col-xs-4">
						<input id="date" name="date" ui-jq="daterangepicker"
							ui-options="{
										singleDatePicker: true,
						                format: 'YYYY-MM-DD',
						                showDropdowns: true
						              }"
							class="form-control w-md" style="width: 90px" />
					</div>
					<div class="col-sm-1 col-xs-1">~</div>
					<div class="col-sm-2 col-xs-4">
						<input id="date" name="date" ui-jq="daterangepicker"
							ui-options="{
										singleDatePicker: true,
						                format: 'YYYY-MM-DD',
						                showDropdowns: true
						              }"
							class="form-control w-md" style="width: 90px" />
					</div>
					<div class="col-sm-4 col-xs-8">
						<button type="submit" class="btn btn-sm btn btn-default">Today</button>
						<button type="submit" class="btn btn-sm btn btn-default">1Week</button>
						<button type="submit" class="btn btn-sm btn btn-default">1Month</button>
						<button type="submit" class="btn btn-sm btn btn-default">1Year</button>
						<button type="submit" class="btn btn-sm btn btn-default">All</button>
					</div>
					<div class="col-sm-1 col-xs-4">
						<button type="submit" class="btn btn-sm btn-info"
							style="font-size: 15px;">Search</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- / search part -->


	<!-- table button top part -->
	<div class="row">
		<div class="col-md-4">
			<div class="btn-group">
				<button class="btn btn-default"  ng-click="selectExcel()" ng-mouseover="button1=' select excel'" ng-mouseout="button1=''">
					<i class="fa fa-check-square-o">{{button1}}</i>
				</button>
				<button class="btn btn-default " ng-click="allExcel()" ng-mouseover="button2=' All excel'" ng-mouseout="button2=''">
					<i class="glyphicon glyphicon-download-alt">{{button2}}</i>
				</button>
				<button class="btn btn-default" ng-click="selectAdvancedExcel()" ng-mouseover="button3=' select Advanced excel'" ng-mouseout="button3=''">
					<i class="fa fa-copy">{{button3}}</i>
				</button>
				<button class="btn btn-default" ng-click="oneVideoDown()" ng-mouseover="button4=' one clip down'" ng-mouseout="button4=''">
					<i class="fa fa-video-camera">{{button4}}</i>
				</button>
			</div>
		</div>
		<div class="col-md-3 col-md-offset-5">
			<label class="checkbox m-n i-checks"> <input type="checkbox"> <i></i>Gif_img
		</div>
	</div>
	<!-- / table button top part -->

	<!-- table -->
	<form>
		<div class="table-responsive" style="overflow-x: auto;">
			<table class="table table-striped">
				<tr>
					<th width="15"><label class="checkbox m-n i-checks"> <input
							type="checkbox"> <i></i>
					</label></th>
					<th>Primary HashTag</th>
					<th>Banner</th>
					<th>Share Count</th>
					<th>View Count</th>
					<th>Heart Count</th>
					<th>Comment Count</th>
					<th>Admin HashTag YN</th>
					<th>Created Date</th>
				</tr>
				<tr>
					<th width="15"><label class="checkbox m-n i-checks"> <input
							type="checkbox"> <i></i>
					</label></th>
					<th>#서울예고</th>
					<th>#서울예고_banner</th>
					<th>30</th>
					<th>40</th>
					<th>150</th>
					<th>50</th>
					<th>Y</th>
					<th>1/12/16 10:48</th>
				</tr>
				<tr>
					<th width="15"><label class="checkbox m-n i-checks"> <input
							type="checkbox"> <i></i>
					</label></th>
					<th>#서울예고</th>
					<th>#서울예고_banner</th>
					<th>30</th>
					<th>40</th>
					<th>150</th>
					<th>50</th>
					<th>Y</th>
					<th>1/12/16 10:48</th>
				</tr>
				<tr>
					<th width="15"><label class="checkbox m-n i-checks"> <input
							type="checkbox"> <i></i>
					</label></th>
					<th>#서울예고</th>
					<th>#서울예고_banner</th>
					<th>30</th>
					<th>40</th>
					<th>150</th>
				