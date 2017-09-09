<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../JS/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	function my() {
		
		var ct = document.getElementById('ct').value ;
		
		var myct=ct.split(",");//将字符串按逗号分割为字符串数组
		myct.shift();//刪除數組第一個元素
		myct.pop();//刪除數組最後一個元素
		$.each(myct, function(i, val) {
			document.getElementById("all").innerHTML +=val;
		})
		//var arr= new array(); 
		<%-- <%for(int i=0; i <application.getAttribute("ChatText").length; i++){%> 
		      arr[i]= <%=data[i].name%>; 
		<%}%>  --%>
		//document.getElementById("all").innerHTML = ct[1];
	}
</script>
<title>chat_text</title>


</head>
<body onload="my()">
	<button onclick="my()">载入</button>
	<input type="hidden" value="${application.ChatText}" id="ct"/>  
    
	<div id="all"></div>
	<%-- <foreach>${application.ChatText}</foreach> --%>
</body>
</html>