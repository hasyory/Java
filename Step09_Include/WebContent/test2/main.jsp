<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1/main.jsp</title>
<style>
	.header{
		height: 100px;
		background-color: green;
	}
	.footer{
		height: 100px;
		background-color: pink;
	}
</style>
</head>
<body>
<%
	//include 된 페이지에 전달될 데이터가 있으면 request에 담는다.
	request.setAttribute("name", "권먀몸");
%>
<%@ include file="header.jsp" %>
<div class="main">
	<h3>main 컨텐츠</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum ab exercitationem obcaecati architecto consequatur ut in molestias illo optio eos. Consectetur sunt est culpa velit! Earum in voluptas quasi iusto.</p>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>