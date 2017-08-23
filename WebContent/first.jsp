<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function loadXMLDoc() {
	var xmlhttp;
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
		}
	}
	xmlhttp.open("POST", "login.action", true);
	//xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xmlhttp.send("{userName:'yas123',password:'123456'}");
	
}
	function loadXMLDoc0() {
		var xmlhttp;
		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
			}
		}
		xmlhttp.open("POST", "second.action", true);//get不行。
		//xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		xmlhttp.send();//send里面可以为空，不传参数，但是一定要有send。此行注释不行。
		
	}
	function loadXMLDoc1() {
		var xmlhttp;
		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
			}
		}
		xmlhttp.open("POST", "second!sec.action", true);
		//xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		xmlhttp.send();
	}
</script>
<title>ajax</title>
<style type="text/css">
#all {
	background-color: #D0D0D0;
	width: 800px;
	margin: 0 auto;
	top: 200px;
}
</style>
</head>
<body>
<div id="all">
	<h2>AJAX</h2>
	<button type="button" onclick="loadXMLDoc()">登录yas123</button>
	<br>
	<button type="button" onclick="loadXMLDoc0()">次数+1</button>
	<button type="button" onclick="loadXMLDoc1()">次数-1</button>
	<div id="myDiv"></div>
	<div id="loginDiv">
	<form action="login" method="post">
		用户名<input type="text" name="userName"/><br/>
		密码<input type="password" name="password"/><br/>
		<input type="submit" value="提交"/>
	</form>
	</div>
	<s:fielderror/>
	<s:include value="/pages/common/bottom.jsp"></s:include>
</div>
</body>
</html>

