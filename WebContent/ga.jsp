<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ga</title>
</head>
<body>
	<div>
		<table border="1">
		<tr>
			<td>用户名</td><td>金钱</td><td>攻击力</td>
		</tr>
		<tr>
			<td id="userName">${session.CurUser}</td>
			<td id="gold">${empty applicationScope.gold?0:applicationScope.gold}</td>
			<td id="power">${empty applicationScope.power?0:applicationScope.power}</td>
		</tr>
		</table>
	
	</div>
</body>
</html>