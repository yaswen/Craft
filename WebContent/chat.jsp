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
}
</style>
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
function my() {
	
	var ct = document.getElementById('ct').value ;
	
	var myct=ct.split(",");//将字符串按逗号分割为字符串数组
	myct.shift();//刪除數組第一個元素
	//myct.pop();//刪除數組最後一個元素,此处不应删除,因为数组的最后一个元素正是刚刚说的话,如果删除了就会每次少一句
	myct[myct.length-1]=myct[myct.length-1].substring(0,myct[myct.length-1].length-1)
	
	$.each(myct, function(i, val) {
		document.getElementById("all").innerHTML +=val;
	})
	//var arr= new array(); 
	<%-- <%for(int i=0; i <application.getAttribute("ChatText").length; i++){%> 
	      arr[i]= <%=data[i].name%>; 
	<%}%>  --%>
	//document.getElementById("all").innerHTML = ct[1];
}
	function send() {
		var text = $("#text").val();
		$.ajax({
			url : "chat.action",
			type : "GET",
			data : "text=" + text,
			success : function(data, textStatus) {
				
				document.getElementById("chattext").innerHTML = data;
				my();
			}
		});
	}
</script>
</head>
<body>
	<div>
		<h3>欢迎光临微波炉聊天机！</h3>
	</div>
	<div id="chattext" height="500px"></div>

	<input type="text" id="text" />
	<br />

	<button onclick="send()">发送</button>

</body>
</html>