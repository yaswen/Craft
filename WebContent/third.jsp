<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>
<title>君の名は</title>
<script type="text/javascript">
	function loadInfo() {
		$("#info").load("loadInfo");
	}
	function testAjax() {
	    var userName = $("#name").val();//获取id是name的输入框的值
	    $.ajax({
	        url : "second!ajaxtest.action",
	        type : "GET",
	        data : "userName=" + userName,
	        success : function(data, textStatus) {
					document.getElementById("info").innerHTML = data;
				
	        }
	    });
	}
	function testAjax1(){
		var userName="shiwen";
		$.ajax({
			url:"second!ajaxtest2.action",
			type:"GET",
			data:"userName="+userName,
			success:function(data,testStatus){
				var obj = eval(json_str);
				document.getElementById("attack").innerHTML = data;
			}
		})
	}
	var obj = eval(json_str);
</script>
</head>
<body>
	<input type="text" id="name" value="请输入姓名" label="用户名"/>
	<input type="button" value="获取" id="Get" onclick="testAjax1()" />
	<div id="info">
	<p id="attack"></p>
	</div>
</body>

</html>