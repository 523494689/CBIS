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
		<a href="${pageContext.request.contextPath}/Front/index.jsp" class="made-with-pk">
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
<!-- 							<form action="" method=""> -->
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
									<div class="tab-pane information" id="information">
									<form action="/CBIS/search-api/handleProduct" method="post" id="formcheck" >
										<div class="col-sm-12">
											<h5 class="info-text">Let's start with the basic details</h5>
										</div>
										<div class="col-sm-12">
											<div class="col-sm-4">
												<input class="btn btn-primary btn-block zuo" type="button"
													id="first"  value="一等 ￥${(stopNo-startNo)*20}" />
											</div>
											<div class="col-sm-4">
												<input class="btn btn-primary btn-block zuo" type="button"
													id="second" value="二等 ￥${(stopNo-startNo)*15}" />
											</div>
											<div class="col-sm-4">
												<input class="btn btn-primary btn-block zuo" type="button"
													id="third" value="无座 ￥${(stopNo-startNo)*15}" />
											</div>
											<div class="col-sm-4">
												<input type="text" value="" id="zuowei" name="zuowei" style="display:none" />
											</div>
											<div class="col-sm-4">
												<input type="text" value="" id="daice" name="daice" style="display:none"/>
											</div>
											<div class="col-sm-12"></div>
											<c:if test="${sessionScope.user!=null}">
												<div class="col-sm-12">
													<div class="col-sm-12" id="reloadPas" >
														<!--用forEach从数据库中读取购票用户名下绑定的所有用户姓名-->
														<c:if test="${pasList!=null}">
															<c:forEach items="${pasList}" var="pasList">
                                                                <!-- 乘客名字 -->
																<div class="col-sm-3">
																	<input type="checkbox" name="cb1" id="${pasList.id}"
																		value="${pasList.pName}" /> <label for="${pasList.id}">${pasList.pName}</label>
																</div>
															</c:forEach>
														</c:if>
														<div id="test"></div>
													</div>
													<!--用forEach从数据库中读取购票用户名下绑定的所有用户姓名-- 结束>												
												<!--CheckBox End-->
													<!--添加新乘客 初始为隐藏域 点击添加后展示 添加成功后在passenger表中添加一条记录-->
													<div class="col-sm-12">
														<div id="passengerBody" class="col-sm-12"
															style="display: none;">
															<div class="col-sm-5">
																<div class="form-group">
																	<label>Name</label> <input type="text"
																		class="form-control" id="pName" placeholder="请输入真实姓名" >
																</div>
															</div>
															<div class="col-sm-5">
																<div class="form-group">
																	<label>Identity Card</label> <input type="text"
																		class="form-control" id="pIDCard"
																		placeholder="请输入身份证">
																</div>
															</div>

															<div class="pull-right">
																<label></label> <input
																	class="btn btn-primary btn-block addPassenger"
																	type="button" id="save" value="保存"  />
															</div>

														</div>
													</div>
													<div class="pull-right">
														<input class="btn btn-primary btn-block addPassenger"
															type="button" id="addPassenger" value="添加乘客" />
														<input class="btn btn-primary btn-block"
														type="button" id="check2" value="提交订单" />
														
													</div>
													
												</div>
											</c:if>
										</div>
										</form>
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
																			<!-- <tr>
																				<td>1</td>
																				<td>T1234 厦门-福州 28/06/2018-28/06/20118</td>
																				<td>臭臭泥 350*******1234</td>
																				<td>05车厢 03F 二等座</td>
																				<td>成人票 ￥80</td>
																			</tr> -->
																			<c:if test="${requestScope.handle1!=null}">
																			<c:forEach items="${requestScope.handle1}" var="passenger" varStatus="vs">
																			<tr>
																				<td>${vs.index+1}</td>
																				<td>${trainNo} ${start}-${stop} 28/06/2018-28/06/20118</td>
																				<td>${passenger.pName},身份证 ${passenger.pIDCard} </td>
																				<td>${zuowei}</td>
																				<td>成人票 ${fee}元</td>
																			</tr>
																			</c:forEach>
																			
																			</c:if>
																			<div>总计${fees}</div>
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
													src="${pageContext.request.contextPath}/Front/images/wechatpay.png">
												</label> <label> <input type="radio" name="rd1" id="rd1"
													value="" /> <img src="${pageContext.request.contextPath}/Front/images/zfbpay.png">
												</label>
											</div>
										</div>
									</div>
									<div class="tab-pane" id="submit">
										<h5 class="info-text">付款信息</h5>
										<div class="col-sm-12">
											<div class="col-sm-3"></div>
											<div class="col-sm-9">
												<form name="alipayment" action="${pageContext.request.contextPath}/Front/alipay.trade.page.pay.jsp"
													method="post" target="_blank">
													<input type="hidden" id="orderNum" name="orderNum" value="${order.orderNum}">
													<div id="body1" class="show" name="divcontent">
														<dl class="content">
															<dd>
																<div class="col-sm-6 col-sm-offset-1">
																	<div class="form-group">
																		<label>商户订单号 ：</label> <input type="text"
																			class="form-control" id="WIDout_trade_no"
																			name="WIDout_trade_no" readonly="readonly">
																	</div>
																</div>
															</dd>
															<dd>
																<div class="col-sm-6 col-sm-offset-1">
																	<div class="form-group">
																		<label>订单名称 ：</label> <input type="text"
																			class="form-control" id="WIDsubject"
																			name="WIDsubject" readonly="readonly">
																	</div>
																</div>
															</dd>
															<dd>
																<div class="col-sm-6 col-sm-offset-1">
																	<div class="form-group">
																		<label>付款金额 ：</label> <input type="text"
																			class="form-control" id="WIDtotal_amount"
																			name="WIDtotal_amount" readonly="readonly">
																	</div>
																</div>
															</dd>
															<dd>
																<div class="col-sm-6 col-sm-offset-1">
																	<div class="form-group">
																		<label>描述 ：</label> <input type="text"
																			class="form-control" id="WIDbody"
																			name="WIDbody" >
																	</div>
																</div>
															</dd>
															
															<dd id="btn-dd">
																<div class="col-sm-6 col-sm-offset-1">
																	<span class="new-btn-login-sp">
																		<button class="btn btn-success btn-block"
																			type="submit" style="text-align: center;">付
																			款</button>
																	</span>
																	<!-- <span class="note-help">如果您点击“付款”按钮，即表示您同意该次的执行操作。</span> -->
																</div>
															</dd>
														</dl>
													</div>
												</form>
											</div>
										</div>
									</div>
								</div>
						</div>
					</div>

					<!-- wizard container -->

					
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
<!-- 弹出框的样式,layer -->
	<script src="${pageContext.request.contextPath}/Front/layer/layer.js"></script>
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


<!-- 保存新增的用户 -->
	<script type="text/javascript">	
		$(function(){
			//$('#wizard li:eq(1) a').tab('show');
			$("#save").click(function(){
					$.post("/CBIS/search-api/addPassenger",{pName:$('#pName').val(),pIDCard:$("#pIDCard").val()},function (data,status){
						console.log(data);
						if (data) {	
						}
							layer.msg("添加成功!");
		                    //判断传过来的值不为空
                            if (data!=null) {
							//遍历	
							for (var i = 0; i < data.length; i++) {
								if (i==0) {
									$("#reloadPas").html("<div class='col-sm-3'><input type='checkbox' name='cb1' id='cb1' value="+data[i]+"/><label>"+data[i]+"</label></div>");
								}else if(data[i] != null){
									$("#reloadPas").append("<div class='col-sm-3'><input type='checkbox' name='cb1' id='cb1' value="+data[i]+"/><label>"+data[i]+"</label></div>");
								}
								window.location.reload();
							} 
                            }
						
							//替换当前的div
							/* $("#reloadPas").html("<div class='col-sm-3'><input type='checkbox' name='cb1' id='cb1' value='哈哈哈'/><label>"+data[0]+"</label></div>"+
									"<div class='col-sm-3'><input type='checkbox' name='cb1' id='cb1' value='哈哈哈'/><label>"+data[1]+"</label></div>"); */
					})
					})
		<!-- 将一等座二等座等按钮的值赋值给一个文本框 -->
				$(".zuo").click(function (){
					var content = $(this).val();
					$("#zuowei").val(content);
					layer.msg("选择座位成功，单价为"+content);
				})
				$("#check2").click(function (){
					if($("#zuowei").val()==""){
						layer.msg("请选择座位!");
					}
					else {
						   $("#formcheck").submit();
					}
				})
				
		})

		/* <!-- 阿瓜的 --> */
		/* function jiaZai(){
			$('#wizard li:eq(1) a').tab('show');
		} */
	</script>
	
	<script type="text/javascript">
	function GetDateNow() {
		document.getElementById("WIDout_trade_no").value =  ${order.orderNum};
		document.getElementById("WIDsubject").value = ${order.orderNum * 3};
		document.getElementById("WIDtotal_amount").value = ${order.price};
	}
	GetDateNow();
	</script>

</html>