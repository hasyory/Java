<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test09.jsp</title>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
<%
	String activeTab="two";
%>
<div class="container">
	<h3>동적으로 active tab 바꾸기 연습</h3>
	<ul class="nav nav-tabs">
		<li <%if(activeTab.equals("one")){ %>class="active"<%} %>><a href="#">하나</a></li>
		<li <%if(activeTab.equals("two")){ %>class="active"<%} %>><a href="#">둘</a></li>
		<li <%if(activeTab.equals("three")){ %>class="active"<%} %>><a href="#">셋</a></li>
	</ul>
</div>
</body>
</html>