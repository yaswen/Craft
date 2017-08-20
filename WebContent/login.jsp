<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
#all {
	background-color: #C0C0C0;
	width: 400px;
	margin: 0 auto;
	top: 200px;
}
</style>
</head>
<body>
	<div id="all">
		<form action="login" method="post">
			<table>
				<tr>
					<td>用户名</td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><s:fielderror /></td>
				</tr>

			</table>
		</form>
	<s:include value="/pages/common/bottom.jsp"></s:include>
	</div>
</body>
</html>