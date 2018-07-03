<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assetss/img/favicon.png" />
		<title>Travel &mdash; 100% Free Fully Responsive HTML5 Template by FREEHTML5.co</title>
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
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/animate.css">
		<!-- Icomoon Icon Fonts-->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/icomoon.css">
		<!-- Bootstrap  -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/bootstrap.css">
		<!-- Superfish -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/superfish.css">
		<!-- Magnific Popup -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/magnific-popup.css">
		<!-- Date Picker -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/bootstrap-datepicker.min.css">
		<!-- CS Select -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/cs-select.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/cs-skin-border.css">

		<link rel="stylesheet" href="${pageContext.request.contextPath}/Front/css/style.css">

		<!-- Modernizr JS -->
		<script src="${pageContext.request.contextPath}/Front/js/modernizr-2.6.2.min.js"></script>
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

				$(".login").click(function() {
					$("#loginBody").show();
				})
				$(".signin").click(function() {
					$("#loginBody").hide();
					$(".login").hide();
					$(".myself").show();
				})
				$(".signup").click(function() {
					$("#registerBody").show();
					$("#loginBody").hide();
				})
				$(".register").click(function() {
					$("#registerBody").hide();
					$("#loginBody").show();
				})
// 				验证器
$("#formcheck").validate({
			rules : {
				pName : {
					required : true,
					minlength : 2,
					maxlength : 10
				},
				pIDCard : {
					required : true,
					minlength : 15
				},
				pTelphone : {
					required : true,
					number : true,
					minlength : 7,
				},
				userEmail : {
					required : true,
					email : true
				},
				topic : {
					required : "#newsletter:checked",
					minlength : 2
				},
				agree : "required"
			},
			messages : {
				pName : {
					required : "*请输入真实姓名",
					minlength : "*姓名不能少于两个字或英文",
					maxlength : "*姓名长度过长"
				},
				pIDCard : {
					required : "*请输入身份证",
					minlength : "*身份证不能少于15位"
				},
				pTelphone : {
					required : "*请输入手机号",
					number : "*请输入合法的数字",
					minlength : "请检验手机号码长度"
				},

				userEmail : "请输入一个正确的邮箱",
				agree : "请接受我们的声明",
				topic : "请选择两个主题"
			}
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
										<!-- <a href="#" class="login">Login</a> -->
										<a href="#" class="myself">MySelf</a>
									</li>
								</ul>
							</nav>
						</div>
					</div>
				</header>

				<!-- end:header-top -->

				<div class="fh5co-hero">
					<div class="fh5co-overlay"></div>
					<div class="fh5co-cover" data-stellar-background-ratio="0.5" style="background-image: url(${pageContext.request.contextPath}/Front/images/cover_bg_1.jpg);">
						<div class="desc">
							<div class="container">
								<div class="row">
									<div class="col-sm-2 col-md-2"></div>
									<div class="col-sm-8 col-md-8">
										<div class="tabulation animate-box">

											<!-- Nav tabs -->
											<ul class="nav nav-tabs" role="tablist">
												<li role="presentation" class="active">
													<a href="#mySelfBody" aria-controls="flights" role="tab" data-toggle="tab">MySelf</a>
												</li>
												<li role="presentation">
													<a href="#history" aria-controls="hotels" role="tab" data-toggle="tab">History</a>
												</li>
											</ul>

											<!-- Tab panes -->
											<div class="tab-content">
												<div role="tabpanel" class="tab-pane active" id="mySelfBody">
												<form action="register" id="formcheck" method="post">
												<fieldset>
													<div class="row">
														<div class="col-xxs-12 col-xs-6 mt">
															<div class="input-field">
																<label for="UserName">UserName:</label>
																<input type="text" style="display:none" name="userId" value="${userInfo.userId}"  id="userId">
																<input type="text" class="form-control" name="userName" id="from-place" placeholder="真实姓名" />
															</div>
														</div>

														<div class="col-xxs-12 col-xs-6 mt">
															<div class="input-field">
																<label for="pName">Name:</label>
																<input type="text" class="form-control" name="pName" id="from-place" placeholder="香香泥" value="${userInfo.userName}" readonly="readonly"/>
															</div>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<div class="input-field">
																<label for="userEmail">Email:</label>
																<input type="text" class="form-control" name="userEmail" id="to-place" placeholder="admin@qq.com" value="${userInfo.userEmail}" />
															</div>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<div class="input-field">
																<label for="pTelphone">Phone:</label>
																<input type="text" class="form-control" id="from-place" name="pTelphone" placeholder="12345678912" />
															</div>
														</div>
														<div class="col-xxs-12 col-xs-6 mt">
															<div class="input-field">
																<label for="pIDCard">Identity Card:</label>
																<input type="text" class="form-control" id="to-place" name="pIDCard" placeholder="350***********1234" />
															</div>
														</div>
														<div class="col-xs-12">
															<input type="submit" class="btn btn-primary btn-block" value="Confirm">
														</div>
													</div>
													</fieldset>
													</form>
												</div>

												<div role="tabpanel" class="tab-pane" id="history">
													<div class="row">
														
														<div class="col-xxs-12 col-xs-12 mt alternate">
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
												</div>
											</div>

										</div>
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

		<script src="${pageContext.request.contextPath}/Front/js/jquery.min.js"></script>
		<!-- 验证器引入 -->
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
		<!-- jQuery Easing -->
		<script src="${pageContext.request.contextPath}/Front/js/jquery.easing.1.3.js"></script>
		<!-- Bootstrap -->
		<script src="${pageContext.request.contextPath}/Front/js/bootstrap.min.js"></script>
		<!-- Waypoints -->
		<script src="${pageContext.request.contextPath}/Front/js/jquery.waypoints.min.js"></script>
		<script src="${pageContext.request.contextPath}/Front/js/sticky.js"></script>

		<!-- Stellar -->
		<script src="${pageContext.request.contextPath}/Front/js/jquery.stellar.min.js"></script>
		<!-- Superfish -->
		<script src="${pageContext.request.contextPath}/Front/js/hoverIntent.js"></script>
		<script src="${pageContext.request.contextPath}/Front/js/superfish.js"></script>
		<!-- Magnific Popup -->
		<script src="${pageContext.request.contextPath}/Front/js/jquery.magnific-popup.min.js"></script>
		<script src="${pageContext.request.contextPath}/Front/js/magnific-popup-options.js"></script>
		<!-- Date Picker -->
		<script src="${pageContext.request.contextPath}/Front/js/bootstrap-datepicker.min.js"></script>
		<!-- CS Select -->
		<script src="${pageContext.request.contextPath}/Front/js/classie.js"></script>
		<script src="${pageContext.request.contextPath}/Front/js/selectFx.js"></script>

		<!-- Main JS -->
		<script src="${pageContext.request.contextPath}/Front/js/main.js"></script>

	</body>

</html>