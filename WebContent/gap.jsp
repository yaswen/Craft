<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>勇闯天涯</title>
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>
<script type="text/javascript">

	function buy() {
		document.getElementById("ga").innerHTML = "计算中。。。";
	    var userName = '<%=session.getAttribute("CurUser")%>';
	    $.ajax({
	        url : "ga!buy.action",
	        type : "GET",
	        data : "userName=" + userName,
	        success : function(data, textStatus) {
					document.getElementById("ga").innerHTML = data;
	        }
	    });
	}
	function sale() {
		document.getElementById("ga").innerHTML = "计算中。。。";
	    var userName = '<%=session.getAttribute("CurUser")%>';
	    $.ajax({
	        url : "ga!sale.action",
	        type : "GET",
	        data : "userName=" + userName,
	        success : function(data, textStatus) {
					document.getElementById("ga").innerHTML = data;
	        }
	    });
	}
	
</script>
<style type="text/css">
#all {
	background-color: #EEDDCC;
	width: 800px;
	margin: 0 auto;
	top: 200px;
}
</style>
</head>
<body>
	<div id="all">
		<h3>买卖武装，勇闯天涯</h3>
		<button onclick="buy()">买武装</button>
		<button onclick="sale()">卖武装</button>
		<div id="ga"></div>
	</div>
</body>
</html>