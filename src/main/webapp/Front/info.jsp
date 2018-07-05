<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<link rel="apple-touch-icon" sizes="76x76"
	href="${pageContext.request.contextPath}/Front/assetss/img/apple-icon.png" />
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/Front/assetss/img/favicon.png" />
<title>Travel</title>

<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />

<!-- CSS Files -->
<link
	href="${pageContext.request.contextPath}/Front/assetss/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/Front/assetss/css/paper-bootstrap-wizard.css"
	rel="stylesheet" />

<!-- PAY WAY STYLES-->
<!--		<link rel="stylesheet" type="text/css" href="css/amazeui.min.css" />
		<link rel="stylesheet" type="text/css" href="css/main.css" />-->

<!-- CSS Just for demo purpose, don't include it in your project -->
<link
	href="${pageContext.request.contextPath}/Front/assetss/css/demo.css"
	rel="stylesheet" />

<!-- Fonts and Icons -->
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.css"
	rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Muli:400,300'
	rel='stylesheet' type='text/css'>
<link
	href="${pageContext.request.contextPath}/Front/assetss/css/themify-icons.css"
	rel="stylesheet">

<!-- TABLE STYLES-->
<link
	href="${pageContext.request.contextPath}/Front/assets/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />

</head>

<body>
	<div class="image-container set-full-height"
		style="background-image: url('${pageContext.request.contextPath}/Front/assetss/img/paper-2.jpeg')">

		<!--  Made With Paper Kit  -->
		<a href="index.html" class="made-with-pk">
			<div class="brand">BK</div>
			<div class="made-with">
				Back to <strong>Home</strong>
			</div>
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
									<p class="category">This information will let us know more
										about your place.</p>
								</div>
								<div class="wizard-navigation">
									<div class="progress-with-circle">
										<div class="progress-bar" role="progressbar" aria-valuenow="1"
											aria-valuemin="1" aria-valuemax="4" style="width: 15%;"></div>
									</div>
									<ul>
										<li><a href="#details" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-map"></i>
												</div> Details
										</a></li>
										<li><a href="#information" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-direction-alt"></i>
												</div> Information
										</a></li>
										<li><a href="#check" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-panel"></i>
												</div> Check
										</a></li>
										<li><a href="#submit" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-panel"></i>
												</div> Submit
										</a></li>
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
																	<table
																		class="table table-striped table-bordered table-hover"
																		id="dataTables-example">
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
																			<c:if test="${list2!=null}">
																				<c:forEach items="${list2}" var="Schedule">
																					<tr align="center">
																						<td>${Schedule.id}</td>
																						<td>${Schedule.station}</td>
																						<td>${Schedule.arrive}</td>
																						<td>${Schedule.start}</td>
																						<td>${Schedule.stopover}</td>
																					</tr>
																				</c:forEach>
																			</c:if>
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
											<h5 class="info-text">Let's start with the basic details</h5>
										</div>
										<div class="col-sm-12">

											<div class="col-sm-4">
												<input class="btn btn-primary btn-block" type="button"
													id="first" value="一等 ￥${(stop-start)*20}" />
											</div>
											<div class="col-sm-4">
												<input class="btn btn-primary btn-block" type="button"
													id="second" value="二等 ￥${(stop-start)*15}" />
											</div>
											<div class="col-sm-4">
												<input class="btn btn-primary btn-block" type="button"
													id="third" value="无座 ￥${(stop-start)*15}" />
											</div>
											<div class="col-sm-12">
												<label></label>
											</div>
										</div>
										<!-- 获取用户登录的信息 -->
										<%-- <c:if test="${sessionScope.user!=null}">
											<div class="col-sm-4 col-sm-offset-1">
												<div class="form-group">
													<label>Name</label> <input type="text" class="form-control"
														id="name" value="${user.userName}">
												</div>
											</div>
											<div class="col-sm-5 col-sm-offset-1">
												<div class="form-group">
													<label>Identity Card</label> <input type="text"
														class="form-control" id="name" value="身份证号">
												</div>
											</div>
										</c:if> --%>
										<!-- 获取用户登录的信息结束 -->
										<c:if test="${sessionScope.user!=null}">
											<div class="col-sm-12">
												<!--用forEach从数据库中读取购票用户名下绑定的所有用户姓名-->
												<div class="col-sm-12">
													<div class="col-sm-3">
														<input type="checkbox" name="cb1" id="cb1" value="臭臭泥1" />
														<label>臭臭泥</label>
													</div>
													<div class="col-sm-3">
														<input type="checkbox" name="cb1" id="cb1" value="臭臭泥2" />
														<label>臭臭泥</label>
													</div>
													<div class="col-sm-3">
														<input type="checkbox" name="cb1" id="cb1" value="臭臭泥3" />
														<label>臭臭泥</label>
													</div>
													<div class="col-sm-3">
														<input type="checkbox" name="cb1" id="cb1" value="臭臭泥4" />
														<label>臭臭泥</label>
													</div>
												</div>
												<!--CheckBox End-->
												<!--添加新乘客 初始为隐藏域 点击添加后展示 添加成功后在passenger表中添加一条记录-->
												<div class="col-sm-12">
													<div id="passengerBody" class="col-sm-12"
														style="display: none;">
														<div class="col-sm-5">
															<div class="form-group">
																<label>Name</label> <input type="text"
																	class="form-control" id="name" placeholder="臭臭泥">
															</div>
														</div>
														<div class="col-sm-5">
															<div class="form-group">
																<label>Identity Card</label> <input type="text"
																	class="form-control" id="name"
																	placeholder="350***********1234">
															</div>
														</div>

														<div class="pull-right">
															<label></label> <input
																class="btn btn-primary btn-block addPassenger"
																type="button" id="save" value="保存" />
														</div>

													</div>
												</div>
												<div class="pull-right">
													<input class="btn btn-primary btn-block addPassenger"
														type="button" id="addPassenger" value="添加乘客" />
												</div>
											</div>
										</c:if>
										<!-- 接收数据结束 -->
									</div>
								</div>
								<div class="tab-pane" id="check">
									<div class="col-sm-12" align="center">
										<!--<h5 class="info-text">Please check again your information. </h5>-->
										<p>Please check again your information.</p>
									</div>
									<div class="row">
										<div class="col-sm-12 col-md-12">
											<div class="tabulation animate-box">
												<div id="page-wrapper">
													<!-- Advanced Tables -->
													<div class="panel panel-default">
														<div class="panel-body">
															<div class="table-responsive">
																<table
																	class="table table-striped table-bordered table-hover"
																	id="dataTables-example">
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
											<span>付款方式：</span> <label> <input type="radio"
												name="rd1" id="rd1" value="" /> <img
												src="images/wechatpay.png">
											</label> <label> <input type="radio" name="rd1" id="rd1"
												value="" /> <img src="images/zfbpay.png">
											</label>
										</div>
									</div>
								</div>
								<div class="tab-pane" id="submit">
									<h3 class="info-text">Successful payment</h3>
									<div class="row">
										<div class="col-sm-4 col-md-4"></div>
										<div class="col-sm-4 col-md-4">
											<img src="images/shoukuanma.jpg">
										</div>
									</div>
								</div>
						</div>
					</div>
					<div class="wizard-footer">
						<div class="pull-right">
							<input type='button'
								class='btn btn-next btn-fill btn-success btn-wd' name='next'
								value='Next' />
							<!--做付钱的遮罩窗体-->
							<input type='button'
								class='btn btn-finish btn-fill btn-success btn-wd' name='finish'
								value='Confirm' />
						</div>
						<div class="pull-left">
							<input type='button' class='btn btn-previous btn-default btn-wd'
								name='previous' value='Previous' />
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
<script
	src="${pageContext.request.contextPath}/Front/assetss/js/jquery-2.2.4.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/Front/assetss/js/bootstrap.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/Front/assetss/js/jquery.bootstrap.wizard.js"
	type="text/javascript"></script>

<!--  Plugin for the Wizard -->
<script
	src="${pageContext.request.contextPath}/Front/assetss/js/paper-bootstrap-wizard.js"
	type="text/javascript"></script>

<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
<script
	src="${pageContext.request.contextPath}/Front/assetss/js/jquery.validate.min.js"
	type="text/javascript"></script>
<!-- DATA TABLE SCRIPTS -->
<script
	src="${pageContext.request.contextPath}/Front/assets/js/dataTables/jquery.dataTables.js"></script>
<script
	src="${pageContext.request.contextPath}/Front/assets/js/dataTables/dataTables.bootstrap.js"></script>

<script>
	$(document).ready(function() {
		$('#dataTables-example').dataTable();

		$(".addPassenger").click(function() {
			$("#passengerBody").show();
		});
	});
</script>

</html>