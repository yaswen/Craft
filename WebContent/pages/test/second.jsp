<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二院</title>
<style type="text/css">
body {
	background-color: #C0C0C0;
	width: 600px;
	margin: 0 auto;
}

#all {
	background-color: #EEEEEE;
	width: 600px;
	margin: 0 auto;
	top: 200px;
}
#img{
	width: 400px;
	float:left;
	
}
#left{
	width:100px;
	height:400px;
	float:left;
	}
</style>

</head>
<body>
	<div id="all">
		<div id="left"></div>
		<div id="img">
			<h4>二院欢迎你！</h4>
			<img src="../../images/1.jpg" width="400px" alt="高跟" /><br /> 
			<img src="../../images/rondo.gif" width="400px" alt="隆多" /> <br />
		</div>
		我进了${empty applicationScope.num?0:applicationScope.num}次二院
		<s:include value="/pages/common/bottom.jsp"></s:include>
	</div>
</body>

</html>