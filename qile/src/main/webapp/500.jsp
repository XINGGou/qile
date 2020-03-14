<%@ page pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8"/>
<style>
	#err-500{ width:100%; }
	#msg,#code,#youcan{
		color:#72AAB4;
		text-align:center;
		font-family:"微软简隶书";
		font-weight:bolder;
	}
	#msg{
		font-size:50px;
		font-family:"幼圆";
		margin-top:50px;
	}
	#emoji{
		display: inline-block;
		width:80px;
		height:80px;
		background:url('e.png') no-repeat center;
		background-size:80px 80px;
	}
	span{ vertical-align: middle; }
	#code{
		font-size:200px;
		font-family:"幼圆";
		margin-top:30px;
	}
	#youcan{
		width:50%;
		text-align:left;
		font-size:30px;
		font-family:"幼圆";
		margin:0 auto;
		margin-top:20px;
	}
	#youcan a{
		display: inline-block;
		text-align:center;
		width:130px;
		height:30px;
		font-size:26px;
		color:#fff;
		text-decoration:none;
		background:#9AC1C9;
		border:2px solid #72AAB4;
		border-radius:25px;
		cursor: pointer;
	}
</style>
<script>
	window.onload = function(){
		var a = document.getElementById("index");
		a.onclick=function(){
			window.location.href="http://localhost/yonghe-ssm/index";
			/* 防止页面嵌套 */
		    if (window.top != window.self) {
		    	top.location.href = "http://localhost/yonghe-ssm/index";
		    }
		};
	}
</script>
</head>
<body>
<div id="err-500">
	<div id="msg">
		<span id="emoji"></span>
		<span>对不起亲，服务器内部出错了哦...</span>
	</div>
	<div id="code">
		500
	</div>
	<div id="youcan">
		您还可以:
		<a id="index">返回首页</a>
	</div>
</div>
</body>
</html>