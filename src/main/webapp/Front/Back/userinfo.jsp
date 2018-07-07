<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title></title>
<!-- Bootstrap Styles-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->

<!-- Custom Styles-->
<link href="assets/css/custom-styles.css" rel="stylesheet" />
<!-- Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<!-- TABLE STYLES-->
<link href="assets/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />
</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default top-navbar" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation<</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html"><i
					class="fa fa-comments"></i> <strong>CBIS </strong></a>
			</div>

			<ul class="nav navbar-top-links navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#" aria-expanded="false"> <i
						class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-messages">
						<li><a href="#">
								<div>
									<strong>John Doe</strong> <span class="pull-right text-muted">
										<em>Today</em>
									</span>
								</div>
								<div>Lorem Ipsum has been the industry's standard dummy
									text ever since the 1500s...</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<strong>John Smith</strong> <span class="pull-right text-muted">
										<em>Yesterday</em>
									</span>
								</div>
								<div>Lorem Ipsum has been the industry's standard dummy
									text ever since an kwilnw...</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<strong>John Smith</strong> <span class="pull-right text-muted">
										<em>Yesterday</em>
									</span>
								</div>
								<div>Lorem Ipsum has been the industry's standard dummy
									text ever since the...</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>Read
									All Messages</strong> <i class="fa fa-angle-right"></i>
						</a></li>
					</ul> <!-- /.dropdown-messages --></li>
				<!-- /.dropdown -->

				<!-- /.dropdown -->

				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#" aria-expanded="false"> <i
						class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i> 登录</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> 注册</a></li>
						<li class="divider"></li>
						<li><a href="#"><i class="fa fa-sign-out fa-fw"></i> 退出</a></li>
					</ul> <!-- /.dropdown-user --></li>
				<!-- /.dropdown -->
			</ul>
		</nav>
		<!--/. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">

					<li><a
						href="${pageContext.request.contextPath}/back/showTrain"><i
							class="fa fa-desktop"></i> 车次信息</a></li>
					<li><a
						href="${pageContext.request.contextPath}/back/showStation"><i
							class="fa fa-bar-chart-o"></i> 车站信息</a></li>
					<li><a href="passengerinfo.html"><i class="fa fa-qrcode"></i>
							乘客信息</a></li>

					<li><a
						href="${pageContext.request.contextPath}/Front/Back/userinfo.jsp"
						class="active-menu"><i class="fa fa-table"></i> 用户信息</a></li>
					<li><a href="order.html"><i class="fa fa-table"></i> 订单信息</a>
					</li>


				</ul>

			</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h1 class="page-header">用户信息</h1>
					</div>
				</div>
				<!-- /. ROW  -->

				<div class="row">
					<div class="col-md-12">
						<!-- Advanced Tables -->
						<div class="panel panel-default">

							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>用户编号</th>
												<th>用户账号</th>
												<th>用户密码</th>
												<th>用户姓名</th>
												<th>身份证号</th>
												<th>用户邮箱</th>
												<th>手机号码</th>
												<th>相关乘客</th>
												<th>注册时间</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>admin</td>
												<td>admin2</td>
												<td>臭臭泥</td>
												<td>350***********1234</td>
												<td>admin@qq.com</td>
												<td>12345678921</td>
												<td><a id="modal-508678" href="#modal-container-508678"
													role="button" class="btn btn-success bjs"
													data-toggle="modal">相关乘客</a>

													<div class="modal fade" id="modal-container-508678"
														role="dialog" aria-labelledby="myModalLabel"
														aria-hidden="true">
														<div class="modal-dialog">
															<div class="modal-content">
																<div class="modal-header">
																	<button type="button" class="close"
																		data-dismiss="modal" aria-hidden="true">×</button>
																	<h4 class="modal-title" id="myModalLabel">相关乘客信息</h4>
																</div>
																<div class="modal-body">
																	<div class="row">
																		<div class="col-md-12">
																			<!--    Context Classes  -->
																			<div class="panel panel-default">
																				<div class="panel-body">
																					<div class="table-responsive">
																						<table class="table">
																							<thead>
																								<tr>
																									<th>#</th>
																									<th>乘客姓名</th>
																									<th>身份证号</th>
																								</tr>
																							</thead>
																							<tbody>
																								<tr class="success">
																									<td>1</td>
																									<td>Mark</td>
																									<td>Otto</td>
																								</tr>
																								<tr class="info">
																									<td>2</td>
																									<td>Jacob</td>
																									<td>Thornton</td>
																								</tr>
																								<tr class="warning">
																									<td>3</td>
																									<td>Larry</td>
																									<td>the Bird</td>
																								</tr>
																								<tr class="danger">
																									<td>4</td>
																									<td>John</td>
																									<td>Smith</td>
																								</tr>
																							</tbody>
																						</table>
																					</div>
																				</div>
																			</div>
																			<!--  end  Context Classes  -->
																		</div>
																	</div>
																</div>
																<div class="modal-footer">
																	<button type="button" class="btn btn-default"
																		data-dismiss="modal">关闭</button>
																	<button type="button" class="btn btn-primary">保存</button>
																</div>
															</div>
														</div>
													</div>
												</td>

												<td>2018-06-30 11:00:52</td>
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
		<!-- /. PAGE INNER  -->
	</div>
	<!-- /. PAGE WRAPPER  -->
	<!-- /. WRAPPER  -->
	<!-- JS Scripts-->
	<!-- jQuery Js -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- Bootstrap Js -->
	<script src="assets/js/bootstrap.min.js"></script>
	<!-- Metis Menu Js -->
	<script src="assets/js/jquery.metisMenu.js"></script>
	<!-- DATA TABLE SCRIPTS -->
	<script src="assets/js/dataTables/jquery.dataTables.js"></script>
	<script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
	<script>
		$(document).ready(function() {
			$('#dataTables-example').dataTable();
		});
	</script>
	<!-- Custom Js -->
	<script src="assets/js/custom-scripts.js"></script>


</body>
</html>
