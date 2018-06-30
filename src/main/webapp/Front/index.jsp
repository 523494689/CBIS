<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
	<!--<![endif]-->

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<link rel="icon" type="image/png" href="assetss/img/favicon.png" />
		<title>Travel</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
		<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

		<!-- Facebook and Twitter integration -->
		<meta property="og:title" content="" />
		<meta property="og:image" content="" />
		<meta property="og:url" content="" />
		<meta property="og:site_name" content="" />
		<meta property="og:description" content="" />
		<meta name="twitter:title" content="" />
		<meta name="twitter:image" content="" />
		<meta name="twitter:url" content="" />
		<meta name="twitter:card" content="" />

<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js">
</script>

		<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
		<link rel="shortcut icon" href="favicon.ico">

		<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>

		<!-- Animate.css -->
		<link rel="stylesheet" href="css/animate.css">
		<!-- Icomoon Icon Fonts-->
		<link rel="stylesheet" href="css/icomoon.css">
		<!-- Bootstrap  -->
		<link rel="stylesheet" href="css/bootstrap.css">
		<!-- Superfish -->
		<link rel="stylesheet" href="css/superfish.css">
		<!-- Magnific Popup -->
		<link rel="stylesheet" href="css/magnific-popup.css">
		<!-- Date Picker -->
		<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
		<!-- CS Select -->
		<link rel="stylesheet" href="css/cs-select.css">
		<link rel="stylesheet" href="css/cs-skin-border.css">

		<link rel="stylesheet" href="css/style.css">

		<!-- TABLE STYLES-->
		<link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />

		<!-- Modernizr JS -->
		<script src="js/modernizr-2.6.2.min.js"></script>
		<!-- FOR IE9 below -->
		<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
		<script type="text/javascript">
			$(document).ready(function() {
				/*$(".scroll").click(function(event) {
					event.preventDefault();
					$('html,body').animate({
						scrollTop: $(this.hash).offset().top
					}, 1000);
				});*/
				
				$(".login").click(function () {
					$("#loginBody").show();
				})
				$(".signin").click(function () {
					$("#loginBody").hide();
					$(".login").hide();
					$(".myself").show();
				})
				$(".signup").click(function () {
					$("#registerBody").show();
					$("#loginBody").hide();
				})
				$(".register").click(function () {
					$("#registerBody").hide();
					$("#loginBody").show();
				})
			});
		</script>

	</head>

	<body>
		<div id="fh5co-wrapper">
			<div id="fh5co-page">

				<header id="fh5co-header-section" class="sticky-banner">
					<div class="container">
						<div class="nav-header">
							<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
							<h1 id="fh5co-logo"><a href="index.html">Travel</a></h1>
							<!-- START #fh5co-menu-wrap -->
							<nav id="fh5co-menu-wrap" role="navigation">
								<ul class="sf-menu" id="fh5co-primary-menu">
									<li class="active">
										<a href="index.html">Home</a>
									</li>

									<li>
										<a href="#Train List">Train</a>
									</li>
									<li>
										<!--写遮罩-->
										<a href="#" class="login">Login</a>
										<a href="mySelf.html" class="myself" style="display: none;">MySelf</a>
									</li>
								</ul>
							</nav>
						</div>
					</div>
				</header>

				<!-- end:header-top -->

				<div class="fh5co-hero">
					<div class="fh5co-overlay"></div>
					<div class="fh5co-cover" data-stellar-background-ratio="0.5" style="background-image: url(images/cover_bg_1.jpg);">
						<div class="desc">
							<div class="container" align="center">
								<div class="row">
									<div class="col-sm-5 col-md-5">
										<div class="tabulation animate-box">

											<!-- Tab panes -->
											<div class="tab-content">
												<div role="tabpanel" class="tab-pane active" id="flights">
													<div class="row">
														<div class="col-xxs-12 col-xs-6 mt">
															<div class="input-field">
																<label for="from">From</label>
																<input type="text" class="form-control" id="from-place" placeholder="厦门" />
															</div>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<div class="input-field">
																<label for="from">To</label>
																<input type="text" class="form-control" id="to-place" placeholder="福州" />
															</div>
														</div>
														<div class="col-xxs-12 col-xs-6 mt alternate">
															<div class="input-field">
																<label for="date-start">Check In</label>
																<input type="text" class="form-control" id="date-start" placeholder="28/06/2018" />
															</div>
														</div>
														<div class="col-xxs-12 col-xs-6 mt alternate">
															<div class="input-field">
																<label for="date-end">Check Out</label>
																<input type="text" class="form-control" id="date-end" placeholder="28/06/2018" />
															</div>
														</div>

														<div class="col-xs-12">
															<div class="input-field">
																<label for="Search">
																	<!--<input type="submit" class="btn btn-primary btn-block" value="Search">-->
																	<h2><a href="#Train List" class="scroll">Search</a></h2>
															</label>
															</div>
														</div>
													</div>
												</div>
											</div>

										</div>
									</div>
									<div class="col-sm-5 col-md-2"></div>
									<div class="col-sm-5 col-md-5">
										<div id="loginBody" class="tabulation animate-box" style="display: none;" >

											<!-- Tab panes -->
											<div class="tab-content">
												<fieldset id="body">
													<fieldset>
														<div class="col-xxs-12 col-xs-4 mt">
															<label for="email">Username</label>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<input type="text" name="email" id="email">
														</div>
													</fieldset>
													<fieldset>
														<div class="col-xxs-12 col-xs-4 mt">
															<label for="password">Password</label>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<input type="password" name="password" id="password">
														</div>
													</fieldset>
													<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
													<div class="col-xxs-12 col-xs-12 mt">
														<div style="visibility: hidden;"></div>
													</div>
													<input type="submit" class="btn btn-primary btn-block signin" value="Sign in">
												</fieldset>
												<span><a href="#">Forgot your password?</a></span>
												<div class="button-bottom">
													<span><label>New account?</label>
														<a href="#" class="signup">Signup</a>
													</span>
												</div>
											</div>

										</div>
										<div id="registerBody" class="tabulation animate-box" style="display: none;" >

											<!-- Tab panes -->
											<div class="tab-content">
												<fieldset id="body">
													<fieldset>
														<div class="col-xxs-12 col-xs-4 mt">
															<label for="username">Username</label>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<input type="text" name="username" id="username">
														</div>
													</fieldset>
													<fieldset>
														<div class="col-xxs-12 col-xs-4 mt">
															<label for="password">Password</label>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<input type="password" name="password" id="password">
														</div>
													</fieldset>
													<fieldset>
														<div class="col-xxs-12 col-xs-4 mt">
															<label for="email">Email</label>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<input type="text" name="email" id="email">
														</div>
													</fieldset>
													<input type="submit" class="btn btn-primary btn-block register" value="Register">
											</div>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

				<div id="fh5co-tours" class="fh5co-section-gray">
					<div class="container">
						<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center heading-section animate-box" id="Train List">
								<h3>Train List</h3>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-12 col-md-12">
								<div class="tabulation animate-box">
									<div id="page-wrapper">
										<!-- Advanced Tables -->
										<div class="panel panel-default">
											<div class="panel-heading" align="center">
												<h3>Available</h3>
											</div>
											<div class="panel-body">
												<div class="table-responsive">
													<table class="table table-striped table-bordered table-hover" id="dataTables-example">
														<thead>
															<tr>
																<th>车次编号</th>
																<th>始发站</th>
																<th></th>
																<th>终点站</th>
																<th>价格</th>
																<th>操作</th>
															</tr>
														</thead>
														<tbody>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥123</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
															</tr>
															<tr align="center">
																<td>T1234</td>
																<td>厦门</td>
																<td>--></td>
																<td>福州</td>
																<td>￥233</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs">详情</button></td>
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
				</div>

			</div>
			<!-- END fh5co-page -->

		</div>
		<!-- END fh5co-wrapper -->

		<!-- jQuery -->
        
		<script src="js/jquery.min.js"></script>
		<!-- jQuery Easing -->
		<script src="js/jquery.easing.1.3.js"></script>
		<!-- Bootstrap -->
		<script src="js/bootstrap.min.js"></script>
		<!-- Waypoints -->
		<script src="js/jquery.waypoints.min.js"></script>
		<script src="js/sticky.js"></script>

		<!-- Stellar -->
		<script src="js/jquery.stellar.min.js"></script>
		<!-- Superfish -->
		<script src="js/hoverIntent.js"></script>
		<script src="js/superfish.js"></script>
		<!-- Magnific Popup -->
		<script src="js/jquery.magnific-popup.min.js"></script>
		<script src="js/magnific-popup-options.js"></script>
		<!-- Date Picker -->
		<script src="js/bootstrap-datepicker.min.js"></script>
		<!-- CS Select -->
		<script src="js/classie.js"></script>
		<script src="js/selectFx.js"></script>
		<!-- DATA TABLE SCRIPTS -->
		<script src="assets/js/dataTables/jquery.dataTables.js"></script>
		<script src="assets/js/dataTables/dataTables.bootstrap.js"></script>

		<script>
			$(document).ready(function() {
				$('#dataTables-example').dataTable();
			});

			$(function() {
				$(".bjs").on("click", function() {
					toInfo();
				});
			});

			function toInfo() {
				window.location.href = "info.html";
			}
		</script>

		<!-- Main JS -->
		<script src="js/main.js"></script>

	</body>

</html>