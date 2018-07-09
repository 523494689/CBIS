<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	出发地:
	<input type="text" name="start" id="start"> 目的地:
	<input type="text" name="stop" id="stop">
	<input type="button" id="search" value="查询">

	<span id="yanzheng">1</span>








</body>



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
<script src="${pageContext.request.contextPath}/Front/js/hoverIntent.js"></script>
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

<!-- Main JS -->
<script src="${pageContext.request.contextPath}/Front/js/main.js"></script>

<!--测试之前  -->
<!-- <script type="text/javascript">
		
		$(function(){
			$("#search").click(function(){
				$.ajax({
					type:"post",
					url:"/CBIS/login",
					contentType:"application/json",
					//用json传数据
					data:JSON.stringify({
						"userName":$("#start").val(),
						"userPassword":$("#stop").val(),						
					}),
					//如果存在该账号
					success:function(flag){
						//跳转到购票界面
						if (flag) {
							//layer.msg("登录成功",{time:2000,btn:['好的']});
							//window.location.reload();
							setTimeout("location.reload()",2000);

						}else{
							$("#yanzheng").html("<span style='color:red'>账号或密码错误</span>")
						}					
						//location.href="${pageContext.request.contextPath}";
						//${pageContext.request.contextPath}/login
					},
					eerror:function(flag){
						
					}
				});
			})
		})
		
		</script> 
		
		
		<!--测试  -->


<script type="text/javascript">
	$(function() {
		$("#search").click(
				function() {

					$.get("/CBIS/search-api/trains?start=" + $("#start").val()
							+ "&stop=" + $("#stop").val(), function(data,status) {
						alert("成功");
						$.each(data, function(idx, Train) {
							$("#yanzheng").html(Train.stations);
						});
						
						console.log(data);
					})
				})
	})
</script>





</html>