<%@page import="test.users.dto.UsersDto"%>
<%@page import="test.users.dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/myInfo.jsp</title>
<link rel="stylesheet" href="../../css/bootstrap.css" />
</head>
<body>
<div class="container">
<%
	String id=(String)session.getAttribute("id");

	UsersDto dto=UsersDao.getInstance().getData(id);
%>
	<h3>내 정보</h3>
	<p>ID: <strong><%=id %></strong></p>
	<p>PASSWORD: <strong><%=dto.getPwd() %></strong></p>
	<p>EMAIL: <strong><%=dto.getEmail() %></strong></p>
	<p>REGISTRATION DATE: <strong><%=dto.getDate() %></strong></p>
	<a href="updateform.jsp">가입정보 수정</a>
	<a href="${pageContext.request.contextPath}/">인덱스로 가기</a>
</div>
</body>
</html>