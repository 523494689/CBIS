<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

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

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'>

<!-- Animate.css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/bootstrap.css">
<!-- Superfish -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/superfish.css">
<!-- Magnific Popup -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/magnific-popup.css">
<!-- Date Picker -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/bootstrap-datepicker.min.css">
<!-- CS Select -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/cs-select.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/cs-skin-border.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Front/css/style.css">

<!-- TABLE STYLES-->
<link
	href="${pageContext.request.contextPath}/Front/assets/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />

<!-- Modernizr JS -->
<script
	src="${pageContext.request.contextPath}/Front/js/modernizr-2.6.2.min.js"></script>
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
				 /* $(".search").click(function() {
					$("#fh5co-tours").show();
				})  */
				$(".login").click(function () {
					$("#loginBody").show();
					$("#registerBody").hide();
				})
				$(".signin").click(function () {
					$("#loginBody").hide();
					$(".login").hide();
					//$(".myself").show();
				})
				$(".signup").click(function () {
					$("#registerBody").show();
					$("#loginBody").hide();
				})
				$(".register").click(function () {


				})

				$("#formcheck").validate({
				    rules: {
				    	userName: {
				        required: true,
				        minlength: 4,
				        maxlength:10
				      },
				      userPassword: {
				        required: true,
				        minlength: 5
				      },
				      confirm_password: {
				        required: true,
				        minlength: 5,
				        equalTo: "#userPwd"
				      },
				      userEmail: {
				        required: true,
				        email: true
				      },
				      topic: {
				        required: "#newsletter:checked",
				        minlength: 2
				      },
				      agree: "required"
				    },
				    messages: {
				    	userName: {
				        required: "请输入用户名",
				        minlength: "*用户名需由4个字符组成",
				        maxlength:"*用户名不能超过10个字符"
				      },
				      userPassword: {
				        required: "请输入密码",
				        minlength: "*密码长度请大于 5 个字母"
				      },
				      confirm_password: {
				        required: "请输入密码",
				        minlength: "密码长度不能小于 5 个字母",
				        equalTo: "两次密码输入不一致"
				      },
				      userEmail: "*请输入一个正确的邮箱",
				      agree: "请接受我们的声明",
				      topic: "请选择两个主题"
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
						<h1 id="fh5co-logo">
							<a href="Front/index.jsp">Travel</a>
						</h1>
						<!-- START #fh5co-menu-wrap -->
						<nav id="fh5co-menu-wrap" role="navigation">
							<ul class="sf-menu" id="fh5co-primary-menu">

								<li class="active"><a href="Front/index.jsp">Home</a></li>

								<li><a href="#Train List">Train</a></li>
								<li>
									<!--写遮罩--> <c:choose>
										<c:when test="${user!=null}">
											<a href="${pageContext.request.contextPath}/queryUserInfo"
												class="myself">MySelf</a>
										</c:when>
										<c:otherwise>
											<a href="#" class="login">Login</a>
										</c:otherwise>
									</c:choose> <!-- 										<a href="mySelf.html" class="myself" style="display: none;">MySelf</a> -->
								</li>
								<li><c:choose>
										<c:when test="${user!=null}">
											<a href="${pageContext.request.contextPath}/logout"
												class="logout">Logout</a>
										</c:when>
									</c:choose> <!-- 										<a href="mySelf.html" class="myself" style="display: none;">MySelf</a> -->
								</li>
							</ul>
						</nav>
					</div>
				</div>
			</header>

			<!-- end:header-top -->

			<div class="fh5co-hero">
				<div class="fh5co-overlay"></div>
				<div class="fh5co-cover" data-stellar-background-ratio="0.5"
					style="background-image: url(${pageContext.request.contextPath}/Front/images/cover_bg_1.jpg);">
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
															<label for="from">From</label> <input type="text"
																class="form-control" id="from-place" name="start"
																placeholder="出发地" />
														</div>
													</div>
													<div class="col-xxs-12 col-xs-6 mt">
														<div class="input-field">
															<label for="from">To</label> <input type="text"
																class="form-control" id="to-place" name="stop"
																placeholder="目的地" />
														</div>
													</div>
													<div class="col-xxs-12 col-xs-6 mt alternate">
														<div class="input-field">
															<label for="date-start">Check In</label> <input
																type="text" class="form-control" id="date-start"
																placeholder="出发日" />
														</div>
													</div>
													<div class="col-xxs-12 col-xs-6 mt alternate">
														<div class="input-field">
															<label for="date-end">Check Out</label> <input
																type="text" class="form-control" id="date-end"
																placeholder="返程日" />
														</div>
													</div>
											       
														<a href="javascript:sendSS()"><button class="btn btn-primary btn-block search" id="search">Search</button></a>
<!-- <a href="/CBIS/search-api/trains2?start=厦门&stop=福州"> -->
													<!--  -->
													<script type="text/javascript">
		
		
					//如果存在该账号
					success:function(flag){
						//跳转到购票界面
						if (flag) {
							console.log("avc");
							alert("登录成功");
							window.location.reload();
							
						}else{
							$("#yanzhen").html("<span style='color:red'>账号或密码错误</span>")
						}					
					},
					eerror:function(flag){
						alert("登录失败");
						console.log("登录失败")
					}
				});
				})
		})
			</script>

												</div>
											</div>
										</div>

									</div>
								</div>
								<div class="col-sm-5 col-md-2"></div>
								<div class="col-sm-5 col-md-5">
									<div id="loginBody" class="tabulation animate-box"
										style="display: none;">

										<!-- 用户账号密码登录 -->
										<div class="tab-content">

											<fieldset id="body">
												<fieldset>
													<div class="col-xxs-12 col-xs-4 mt">
														<label for="userName">账号:</label>
													</div>
													<div class="col-xxs-12 col-xs-6 mt">
														<input type="text" name="userName" id="userName1">
													</div>
												</fieldset>
												<fieldset>
													<div class="col-xxs-12 col-xs-4 mt">
														<label for="userPassword">密码:</label>
													</div>
													<div class="col-xxs-12 col-xs-6 mt">
														<input type="password" name="userPassword"
															id="userPassword">
													</div>

												</fieldset>
												<div class="col-xxs-12 col-xs-6 mt">
													<span id="yanzhen"></span>
												</div>
												<label for="checkbox"><input type="checkbox"
													id="checkbox"> <i>记住密码</i></label>
												<div class="col-xxs-12 col-xs-12 mt">
													<div style="visibility: hidden;"></div>
												</div>
												<input type="button" class="btn btn-primary  btn-block"
													id="userLogin" value="登 录">
											</fieldset>

											<span><a href="#">忘记密码?</a></span>
											<div class="button-bottom">
												<span><label>还未有账号?</label> <a href="#"
													class="signup">注册</a> </span>
											</div>
										</div>

									</div>
									<div id="registerBody" class="tabulation animate-box"
										style="display: none;">

										<!-- Tab panes -->

										<div class="tab-content">
											<form id="formcheck"
												action="${pageContext.request.contextPath}/register"
												method="post">
												<fieldset>
													<div class="col-xxs-12 col-xs-4 mt">
														<label for="userName">账号:</label>
													</div>
													<div class="col-xxs-12 col-xs-6 mt">
														<input type="text" name="userName" id="userName">
														<!-- 需要修改,判断用户名是否存在的显示框  -->
														<!-- <input type="text" id="check" value="">  -->
														<div id="checkBody" style="display: none;">
															<input type="text" id="check" value="">
														</div>
														<!-- 用户名验证的script -->
														<script>
							             	$(document).ready (function (){
							             		
								        	$("#userName").blur(function (){
										   	$.get ("/CBIS/queryUserName?userName="+$("#userName").val(),function (data,status){
										    console.log(data);
										    $("#checkBody").show();
											$("#check").val(data);	         
									         })
									       })
								        })
								        
								           </script>

													</div>
													<div class="col-xxs-12 col-xs-4 mt">
														<label for="userPassword">密码:</label>
													</div>
													<div class="col-xxs-12 col-xs-6 mt">
														<input type="password" name="userPassword" id="password">
													</div>
													<div class="col-xxs-12 col-xs-4 mt">
														<label for="userEmail">邮箱:</label>
													</div>
													<div class="col-xxs-12 col-xs-6 mt">
														<input type="text" name="userEmail" id="email">
													</div>

													<input type="submit" class="btn btn-primary btn-block"
														value="注册">
												</fieldset>
											</form>
										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>

			<div id="fh5co-tours" class="fh5co-section-gray" ">
				<div class="container">
					<div class="row">
						<div
							class="col-md-8 col-md-offset-2 text-center heading-section animate-box"
							id="TrainList">
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
												<table
													class="table table-striped table-bordered table-hover"
													id="dataTables-example">
													<thead>
														<tr>
															<th>车次编号</th>
															<th>出发站</th>
															<th>出发时间</th>
															<th>到达站</th>
															<th>到达时间</th>
															<th>操作</th>
														</tr>
													</thead>
													<tbody id="searchBody">
															<!-- 接收控制器传过来的值 -->										
															<c:if test="${requestScope.list!=null}">
															<!-- 开始循环 -->
															<c:forEach items="${list}" var="Train">
															
															<tr align="center">
																<td>${Train.trainNo}</td>
																<td>${start}</td>
																<td>${Train.start.start}</td>
																<td>${stop}</td>
																<td>${Train.stop.arrive}</td>
																<td><button id="btn" name="btn" class="btn btn-success bjs xiangqing" value="${Train.trainId}@${Train.start.stationNo}@${Train.stop.stationNo}">详情</button></td>
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
			</div>

		</div>
		<!-- END fh5co-page -->

	</div>
	<!-- END fh5co-wrapper -->

	<!-- jQuery -->

	<script src="${pageContext.request.contextPath}/Front/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<!-- 验证器引入 -->
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/Front/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script
		src="${pageContext.request.contextPath}/Front/js/bootstrap.min.js"></script>
	<!-- 弹出框的样式,layer -->
	<script src="${pageContext.request.contextPath}/Front/layer/layer.js"></script>
	<!-- Waypoints -->
	<script
		src="${pageContext.request.contextPath}/Front/js/jquery.waypoints.min.js"></script>
	<script src="${pageContext.request.contextPath}/Front/js/sticky.js"></script>

	<!-- Stellar -->
	<script
		src="${pageContext.request.contextPath}/Front/js/jquery.stellar.min.js"></script>
	<!-- Superfish -->
	<script
		src="${pageContext.request.contextPath}/Front/js/hoverIntent.js"></script>
	<script src="${pageContext.request.contextPath}/Front/js/superfish.js"></script>
	<!-- Magnific Popup -->
	<script
		src="${pageContext.request.contextPath}/Front/js/jquery.magnific-popup.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/Front/js/magnific-popup-options.js"></script>
	<!-- Date Picker -->
	<script
		src="${pageContext.request.contextPath}/Front/js/bootstrap-datepicker.min.js"></script>
	<!-- CS Select -->
	<script src="${pageContext.request.contextPath}/Front/js/classie.js"></script>
	<script src="${pageContext.request.contextPath}/Front/js/selectFx.js"></script>
	<!-- DATA TABLE SCRIPTS -->
	<script
		src="${pageContext.request.contextPath}/Front/assets/js/dataTables/jquery.dataTables.js"></script>
	<script
		src="${pageContext.request.contextPath}/Front/assets/js/dataTables/dataTables.bootstrap.js"></script>


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
				window.location.href = "info.jsp";
			}
		</script>

	<!-- Main JS -->
	<script src="${pageContext.request.contextPath}/Front/js/main.js"></script>

    <!-- 登录的时候判断是否有该用户 -->
	<script type="text/javascript">	
		$(function(){
			$("#userLogin").click(function(){
				$.ajax({
					type:"post",
					url:"/CBIS/login",
					contentType:"application/json",
					//用json传数据
					data:JSON.stringify({
						"userName":$("#userName1").val(),
						"userPassword":$("#userPassword").val(),						
					}),
					//如果存在该账号
					success:function(flag){
						//跳转到购票界面
						if (flag) {
							layer.msg("登录成功",{time:2000,btn:['好的']});
							//window.location.reload();
							setTimeout("location.reload()",2000);
						}else{
							$("#yanzhen").html("<span style='color:red'>账号或密码错误</span>")
						}					
						//location.href="${pageContext.request.contextPath}";
						//${pageContext.request.contextPath}/login
					},
					eerror:function(flag){
						
					}
				});
			})
			//详情传值
			$('#searchBody').on('click','.xiangqing',function (){
		        console.log($(this).val());
		        window.location.href="/CBIS/search-api/trainList?trainAll="+$(this).val();
		        
		    });
			
				
		})
		
	</script>
	
	<!-- 点击查询的按钮 -->
	<script >
	     function sendSS(){
	    	 var flag= confirm("是否搜索");
	    	//出发地
	    	 var start = $("#from-place").val();
	    	 var stop = $("#to-place").val();
		   //提示框

		   if(flag){
			  // var index = layer.load(0, {shade: false}); //0代表加载的风格，支持0-2
			  var index = layer.load(1, {
                shade: [0.1,'#fff'] //0.1透明度的白色背景
                  });
			   //确认提交,跳转页面
			  location.href="/CBIS/search-api/trains2?start="+start+"&stop="+stop;
			  //a href="/CBIS/search-api/trains2?start=厦门&stop=福州
		   }
	     }
	</script>
</body>

</html>