<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test07.jsp</title>
</head>
<body>
<%
	//조건부로 다른 내용의 javascript 출력하기
	boolean isWait=true;
%>
<%if(isWait){ %>
	<script>
		alert("기다려!");
	</script>
<%}else{ %>
	<script>
		alert("기다리지마!");
	</script>
<%} %>
</body>
</html>