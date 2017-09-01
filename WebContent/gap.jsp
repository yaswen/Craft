<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>勇闯天涯</title>
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>
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
	xmlhttp.send('{userName:"yas123";password:"123456"}');
	
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
	function buy() {
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
	function buy2() {
		$("#ga").load("ga!buy.action");
	}
	function sale2() {
		$("#ga").load("ga!sale.action");
	}
</script>
</head>
<body>
	<button onclick="buy()">买武装</button>
	<button onclick="sale()">卖武装</button>
	<div id="ga"></div>
</body>
</html>