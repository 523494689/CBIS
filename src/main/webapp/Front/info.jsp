<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<link rel="apple-touch-icon" sizes="76x76" href="assetss/img/apple-icon.png" />
		<link rel="icon" type="image/png" href="assetss/img/favicon.png" />
		<title>Travel</title>

		<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
		<meta name="viewport" content="width=device-width" />

		<!-- CSS Files -->
		<link href="assetss/css/bootstrap.min.css" rel="stylesheet" />
		<link href="assetss/css/paper-bootstrap-wizard.css" rel="stylesheet" />

		<!-- PAY WAY STYLES-->
		<!--		<link rel="stylesheet" type="text/css" href="css/amazeui.min.css" />
		<link rel="stylesheet" type="text/css" href="css/main.css" />-->

		<!-- CSS Just for demo purpose, don't include it in your project -->
		<link href="assetss/css/demo.css" rel="stylesheet" />

		<!-- Fonts and Icons -->
		<link href="http://netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.css" rel="stylesheet">
		<link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
		<link href="assetss/css/themify-icons.css" rel="stylesheet">

		<!-- TABLE STYLES-->
		<link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />

	</head>

	<body>
		<div class="image-container set-full-height" style="background-image: url('assetss/img/paper-2.jpeg')">

			<!--  Made With Paper Kit  -->
			<a href="index.html" class="made-with-pk">
				<div class="brand">BK</div>
				<div class="made-with">Back to <strong>Home</strong></div>
			</a>
			<!--   Big container   -->
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2">

						<!--      Wizard container        -->
						<div class="wizard-container">
							<div class="card wizard-card" data-color="green" id="wizard">
								<form action="" method="">
									<!--        You can switch " data-color="green" "  with one of the next bright colors: "blue", "azure", "orange", "red"       -->

									<div class="wizard-header">
										<h3 class="wizard-title">List your place</h3>
										<p class="category">This information will let us know more about your place.</p>
									</div>
									<div class="wizard-navigation">
										<div class="progress-with-circle">
											<div class="progress-bar" role="progressbar" aria-valuenow="1" aria-valuemin="1" aria-valuemax="4" style="width: 15%;"></div>
										</div>
										<ul>
											<li>
												<a href="#details" data-toggle="tab">
													<div class="icon-circle">
														<i class="ti-map"></i>
													</div>
													Details
												</a>
											</li>
											<li>
												<a href="#information" data-toggle="tab">
													<div class="icon-circle">
														<i class="ti-direction-alt"></i>
													</div>
													Information
												</a>
											</li>
											<li>
												<a href="#check" data-toggle="tab">
													<div class="icon-circle">
														<i class="ti-panel"></i>
													</div>
													Check
												</a>
											</li>
											<li>
												<a href="#submit" data-toggle="tab">
													<div class="icon-circle">
														<i class="ti-panel"></i>
													</div>
													Submit
												</a>
											</li>
										</ul>
									</div>
									<div class="tab-content">
										<div class="tab-pane" id="details">
											<div class="row">
												<div class="col-sm-12 col-md-12">
													<div class="tabulation animate-box">
														<div id="page-wrapper">
															<!-- Advanced Tables -->
															<div class="panel panel-default">
																<div class="panel-body">
																	<div class="table-responsive">
																		<table class="table table-striped table-bordered table-hover" id="dataTables-example">
																			<thead>
																				<tr>
																					<th>站序</th>
																					<th>站名</th>
																					<th>到时</th>
																					<th>发时</th>
																					<th>停留</th>
																				</tr>
																			</thead>
																			<tbody>
																				<tr align="center">
																					<td>1</td>
																					<td>厦门</td>
																					<td>----</td>
																					<td>06:50</td>
																					<td>----</td>
																				</tr>
																				<tr align="center">
																					<td>2</td>
																					<td>泉州</td>
																					<td>07:37</td>
																					<td>07:41</td>
																					<td>4分钟</td>
																				</tr>
																				<tr align="center">
																					<td>3</td>
																					<td>莆田</td>
																					<td>08:06</td>
																					<td>08:08</td>
																					<td>2分钟</td>
																				</tr>
																				<tr align="center">
																					<td>4</td>
																					<td>福清</td>
																					<td>08:27</td>
																					<td>08:29</td>
																					<td>2分钟</td>
																				</tr>
																				<tr align="center">
																					<td>5</td>
																					<td>福州南</td>
																					<td>08:44</td>
																					<td>08:49</td>
																					<td>5分钟</td>
																				</tr>
																				<tr align="center">
																					<td>6</td>
																					<td>连江</td>
																					<td>09:09</td>
																					<td>09:11</td>
																					<td>2分钟</td>
																				</tr>
																				<tr align="center">
																					<td>7</td>
																					<td>罗源</td>
																					<td>09:26</td>
																					<td>09:28</td>
																					<td>2分钟</td>
																				</tr>
																				<tr align="center">
																					<td>8</td>
																					<td>宁德</td>
																					<td>09:39</td>
																					<td>09:41</td>
																					<td>2分钟</td>
																				</tr>
																			</tbody>
																		</table>
																	</div>
																</div>
															</div>
															<!--End Advanced Tables -->
														</div>
													</div>
												</div>
											</div>

										</div>
										<div class="tab-pane" id="information">
											<div class="col-sm-12">
												<h5 class="info-text"> Let's start with the basic details</h5>
											</div>
											<div class="col-sm-12">
												<div class="col-sm-4">
													<input class="btn btn-primary btn-block" type="button" id="first" value="一等 ￥100" />
												</div>
												<div class="col-sm-4">
													<input class="btn btn-primary btn-block" type="button" id="second" value="二等 ￥80" />
												</div>
												<div class="col-sm-4">
													<input class="btn btn-primary btn-block" type="button" id="third" value="无座 ￥80" />
												</div>
												<div class="col-sm-12">
													<label></label>
												</div>
												<div class="col-sm-4 col-sm-offset-1">
													<div class="form-group">
														<label>Name</label>
														<input type="text" class="form-control" id="name" placeholder="臭臭泥">
													</div>
												</div>
												<div class="col-sm-5 col-sm-offset-1">
													<div class="form-group">
														<label>Identity Card</label>
														<input type="text" class="form-control" id="name" placeholder="350***********1234">
													</div>
												</div>
												<div class="pull-right">
													<input class="btn btn-primary btn-block" type="button" id="addPassenger" value="添加乘客" />
												</div>
											</div>
										</div>
										<div class="tab-pane" id="check">
											<div class="col-sm-12" align="center">
												<!--<h5 class="info-text">Please check again your information. </h5>-->
												<p>Please check again your information. </p>
											</div>
											<div class="row">
												<div class="col-sm-12 col-md-12">
													<div class="tabulation animate-box">
														<div id="page-wrapper">
															<!-- Advanced Tables -->
															<div class="panel panel-default">
																<div class="panel-body">
																	<div class="table-responsive">
																		<table class="table table-striped table-bordered table-hover" id="dataTables-example">
																			<thead>
																				<tr>
																					<th>序号</th>
																					<th>车次信息</th>
																					<th>用户信息</th>
																					<th>席位信息</th>
																					<th>票款金额</th>
																				</tr>
																			</thead>
																			<tbody>
																				<tr>
																					<td>1</td>
																					<td>T1234 厦门-福州 28/06/2018-28/06/20118</td>
																					<td>臭臭泥 350*******1234</td>
																					<td>05车厢 03F 二等座</td>
																					<td>成人票 ￥80</td>
																				</tr>
																			</tbody>
																		</table>
																	</div>
																</div>
															</div>
															<!--End Advanced Tables -->
														</div>
													</div>
												</div>
												<div class="col-sm-12">
													<span>付款方式：</span>
													<label>
														<input type="radio" name="rd1" id="rd1" value="" />
														<img src="images/wechatpay.png">
													</label>
													<label>
														<input type="radio" name="rd1" id="rd1" value="" />
														<img src="images/zfbpay.png">
													</label>
												</div>
											</div>
										</div>
										<div class="tab-pane" id="submit">
											<h3 class="info-text"> Successful payment </h3>
											<div class="row">
												<div class="col-sm-4 col-md-4"></div>
												<div class="col-sm-4 col-md-4">
													<img src="images/shoukuanma.jpg">
												</div>
											</div>
										</div>
									</div>
									<div class="wizard-footer">
										<div class="pull-right">
											<input type='button' class='btn btn-next btn-fill btn-success btn-wd' name='next' value='Next' />
											<!--做付钱的遮罩窗体-->
											<input type='button' class='btn btn-finish btn-fill btn-success btn-wd' name='finish' value='Confirm' />
										</div>
										<div class="pull-left">
											<input type='button' class='btn btn-previous btn-default btn-wd' name='previous' value='Previous' />
										</div>
										<div class="clearfix"></div>
									</div>
								</form>
							</div>
						</div>
						<!-- wizard container -->
					</div>
				</div>
				<!-- row -->
			</div>
			<!--  big container -->

		</div>

	</body>

	<!--   Core JS Files   -->
	<script src="assetss/js/jquery-2.2.4.min.js" type="text/javascript"></script>
	<script src="assetss/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="assetss/js/jquery.bootstrap.wizard.js" type="text/javascript"></script>

	<!--  Plugin for the Wizard -->
	<script src="assetss/js/paper-bootstrap-wizard.js" type="text/javascript"></script>

	<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
	<script src="assetss/js/jquery.validate.min.js" type="text/javascript"></script>
	<!-- DATA TABLE SCRIPTS -->
	<script src="assets/js/dataTables/jquery.dataTables.js"></script>
	<script src="assets/js/dataTables/dataTables.bootstrap.js"></script>

	<script>
		$(document).ready(function() {
			$('#dataTables-example').dataTable();
		});
	</script>

</html>