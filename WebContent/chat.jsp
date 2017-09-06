<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微波炉</title>
<style type="text/css">
        html
        {
         height:100%;
         margin:0;
        }
        body
        {
            height:100%;
            margin:0; 
        }
        #chattext{
        	height:550px;
        	max-height:550px;
            margin:0; 
        }
    </style>
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
function send() {
    var text = $("#text").val();
    $.ajax({
        url : "chat.action",
        type : "GET",
        data : "text=" + text,
        success : function(data, textStatus) {
				document.getElementById("chattext").innerHTML = data;
        }
    });
}

</script>
</head>
<body>
	<div><h3>欢迎光临微波炉聊天机！</h3></div>
	<div id="chattext" height="500px"></div>
	
		<input type="text" id="text"/><br/>
		
		<button onclick="send()">发送</button>
	
</body>
</html>