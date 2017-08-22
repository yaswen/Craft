<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#all {
	background-color: #C0C0C0;
	width: 800px;
	margin: 0 auto;
}

#top {
	background-color: #90FF90;
	width: 800px;
	margin: 0 auto;
}
</style>
</head>
<body>
	<div id="all" name="all">
		<div id="top" name="top" align="right">登录用户：${session.CurUser}</div>
		<div align="center">
			<h3 align="center">登高</h3>
			风急天高猿啸哀，渚清沙白鸟飞回。<br /> 
			无边落木萧萧下，不尽长江滚滚来。<br /> 
			万里悲秋常作客，百年多病独登台。<br />
			艰难苦恨繁霜鬓，潦倒新停浊酒杯。<br /> 
			<a href="first.jsp">返回首页</a> 
			<a href="pages/test/second.jsp">进入二院</a>
		</div>
		<s:include value="/pages/common/bottom.jsp"></s:include>
</body>
</html>