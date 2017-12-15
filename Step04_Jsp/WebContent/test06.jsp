<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test06.jsp</title>
</head>
<body>
<%
	//주건부로 특정 내용 출력하기
	boolean isLogin=true;
%>
<h3>test06.jsp 페이지</h3>
<%if(isLogin){ %>
<p><strong>hgang</strong> 님 로그인 중</p>
<%}else{ %>
<p><a href="loginform.jsp">로그인</a></p>
<%} %>
</body>
</html>