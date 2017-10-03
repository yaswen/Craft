<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style type="text/css">
#all {
	background-color: #FFFFFF;
	width: 800px;
	margin: 0 auto;
	top: 200px;
}

#top {
	height: 108px;
}

.mid {
	width: 200px;
	float: left;
	height: 200px;
}

#game {
	background-color: #E0C0FF;
}

#picture {
	background-color: #FF99CC;
}
#chat{
	background-color: #AFF9DD;
}
#first{
	background-color: #BBDDFF;
}

#titlepng {
	width: 480px;
	float: left;
	height: 108px;
}
#userbox {
	width: 200px;
	float: right;
	height: 108px;
}
</style>
<script type="text/javascript" src="JS/jquery-1.7.2.min.js"></script>

<title>诗文吃饭香</title>
</head>
<body>
	<div id="all">
		<div id="top">
			<div id="titlepng" align="left">
				<img src="images/诗文吃饭香.png"/>
			</div>
			<div id="userbox" align="right">
				<a href="login.jsp">登录</a> <a href="signup.jsp">注册</a>
			</div>
		</div>
		<div id="mid">
			<div id="game" class="mid">
				<b>勇闯天涯</b><br> 暂时是一个买卖武装的小游戏，透支也可以。<br> 
				<a href="gap.jsp" id="clickGame">点击这里进行游戏</a>
				<p id="loginPrompt">此游戏要登录才能玩哦。</p>

			</div>
			<div id="picture" class="mid">
				<b>看图</b>（二院）<br> 暂时只有两张图片，让你大饱眼福<br> <a
					href="pages/test/second.jsp">点击这里进入</a>
			</div>
			<div id="chat" class="mid">
				<b>微波炉聊天</b><br> 在这里你跟对方谁也不知道谁是谁的聊天，聊到昏天黑地<br> 
				<a href="chat.jsp">点击这里进入</a>
			</div>
			<div id="first" class="mid">
				<b>未完成first</b><br> 这是未完成的页面。可以更改二院的次数前面的数字。<br> 
				<a href="first.jsp">点击这里进入</a>
			</div>
		</div>
	
	<s:include value="/pages/common/bottom.jsp"></s:include>
	</div>
</body>


<script type="text/javascript">
var userName = '<%=session.getAttribute("CurUser")%>';
	if (userName.length != 0) {
		$('#clickGame').hide();
		$('#loginPrompt').show();
	} else {
		$('#clickGame').show();
		$('#loginPrompt').hide();
	}
</script>
</html>