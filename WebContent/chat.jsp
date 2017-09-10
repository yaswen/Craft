<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微波炉</title>
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

#chattext {
	height: 350px;
	max-height: 450px;
	margin: 0;
	background-color: #DDCCBB;
	overflow: scroll;
}

#text {
	width: 600px;
	height: 50px;
}

button {
	width: 81px;
	height: 50px;
}
</style>
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	window.setInterval("getContent();", 1000);//每秒载入一次
	function my() {

		var ct = document.getElementById('ct').value;

		var myct = ct.split(",");//将字符串按逗号分割为字符串数组。这就有一个风险：用户聊天内容中的逗号会被删除掉。
		myct.shift();//刪除數組第一個元素
		//myct.pop();//刪除數組最後一個元素,此处不应进行删除,因为数组的最后一个元素正是刚刚说的话,如果删除了就会每次少一句
		myct[myct.length - 1] = myct[myct.length - 1].substring(0,
				myct[myct.length - 1].length - 1)

		$.each(myct, function(i, val) {
			document.getElementById("all").innerHTML += val;
		})
		document.getElementById("chattext").scrollTop = document
				.getElementById("chattext").scrollHeight;
		//使滚动条自动往下滚到底
	}
	function send() {
		var text = $("#text").val();
		if (text == "") {
			return;
		}
		$.ajax({
			url : "chat.action",
			type : "GET",
			data : "text=" + text,
			success : function(data, textStatus) {

				document.getElementById("chattext").innerHTML = data;
				//my();
				document.getElementById("chattext").scrollTop = document.getElementById("chattext").scrollHeight+100;
				//使滚动条自动往下滚到底
			}
		});

		document.getElementById("text").value = "";
		document.getElementById("text").focus();
		//changeccolor();
	}
	
	function getContent() {
		//test=document.getElementById("chattext").scrollTop;
		$("#chattext2").load("chatting/chattext.jsp");
		var cif = $('input#chattext2 input#cif').val();
		var cif2 = $('#cif2').val();	
		if (cif != cif2) {
			document.getElementById('cif2').value = cif;
			$("#chattext").load("chatting/chattext.jsp");	
			//document.getElementById("chattext").scrollTop = document.getElementById("chattext").scrollHeight;
			//使滚动条自动往下滚到底[↑]就这句出问题[↑]
		}
		if (cif != cif2){
		document.getElementById("chattext").scrollTop = document.getElementById("chattext").scrollHeight;}
		//if(cif==cif2){document.getElementById("chattext").scrollTop=test}
		//使滚动条自动往下滚到底
		}
	
	function EnterPress(e) { //传入 event
		var e = e || window.event;
		if (e.keyCode == 13) {

			send();
		}
	}
</script>
</head>
<body>
	<div>
		<h3>欢迎光临微波炉聊天机！</h3>
	</div>
	<div id="chattext" class="{height:500px}"></div>
	<div id="in">
		<input type="text" id="text" onkeypress="EnterPress(event)"
			onkeydown="EnterPress()" />

		<button onclick="send()">发送</button>
	</div>
	<input type="hidden" id="cif2" />
	<input type="hidden" id="chattext2" />
</body>
</html>