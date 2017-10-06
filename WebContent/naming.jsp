<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	alert("a");
	function send(){
		var text = $("#text").val();
		if (text == "") {
			return;
		}
		$.ajax({
			url : "naming.action",
			type : "GET",
			data : "xing=" + text,
			success : function(data, textStatus) {
				document.getElementById("nametext").innerHTML = data;
				//my();
				//document.getElementById("chattext").scrollTop = document.getElementById("chattext").scrollHeight+100;
				//使滚动条自动往下滚到底
			}
		});

		document.getElementById("text").value = "";
		document.getElementById("text").focus();
		//changeccolor();
	}
	
	function getContent() {
		$("#nametext").load("naming/nametext.jsp");
		//注意这里getContent是每秒执行一次自己去那边load取jsp页面的。与上面的send中的ajax方法不同。
		//所以之前的chat页面的滚动不到最下一行，可能是这个原因。
	}
	function EnterPress(e) { //传入 event
		var e = e || window.event;
		if (e.keyCode == 13) {
			send();
		}
	}
</script>
<title>取名软件</title>

<style type="text/css">
html {
	height: 100%;
	margin: 0;
}

body {
	height: 100%;
	margin: 0;
	background-color: #EEDDCC;
	width: 800px;
	margin: 0 auto;
	top: 200px;
}

button {
	width: 81px;
	height: 50px;
}
</style> 

</head>
<body>
	<div>
		<h3>随机给你取名软件</h3>
	</div>
	<div id="nametext" sytle="height:500px"></div>
	<div id="in">
		<input type="text" id="text" onkeypress="EnterPress(event)"
			onkeydown="EnterPress()" />
		<button onclick="send()">发送</button>
	</div>

</body>
</html>