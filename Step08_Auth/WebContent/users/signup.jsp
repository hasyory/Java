<%@page import="test.users.dao.UsersDao"%>
<%@page import="test.users.dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/signup.jsp</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<div class="container">
<%
	//1. 폼 전송되는 내용을 읽어와서
	request.setCharacterEncoding("utf-8");

	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	String email=request.getParameter("email");
	
	UsersDto dto=new UsersDto();
	dto.setId(id);
	dto.setPwd(pwd);
	dto.setEmail(email);
	//2. DB에 저장
	UsersDao.getInstance().insert(dto);
	//3. 응답
%>
	<div class="panel panel-default">
	  <div class="panel-heading">
	    <h3 class="panel-title"><strong>가입 결과</strong></h3>
	  </div>
	  <div class="panel-body">
	    	<p><strong><%=id %> 회원님 가입이 완료되었습니다.</strong></p>
	  </div>
	  <div class="panel-footer">
	  	<a class="btn btn-default" href="${pageContext.request.contextPath}/">홈<span class="glyphicon glyphicon-triangle-right"></span></a>
	  </div>
	</div>
</div>
</body>
</html>