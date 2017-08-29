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
		alert('1')
		$("#info").load("loadInfo");
	}
</script>
</head>
<body>
	<input type="button" value="获取" id="Get" onclick="loadInfo()" />
	<div id="info"></div>
</body>

</html>