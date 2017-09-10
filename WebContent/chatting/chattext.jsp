<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../JS/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	
</script>
<title>chat_text</title>


</head>
<body>
	<input type="hidden" value="${application.ChatText}" id="ct"/>
	<input type="hidden" value="${application.ChatIf}" id="cif"/>
    <div id="msg_end" style="height:0px; overflow:hidden"></div>
	<div id="all"></div>
	<div id="ct">${application.ChatText}</div>
	<%-- <foreach>${application.ChatText}</foreach> --%>
</body>
</html>