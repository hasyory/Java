<%@page import="test.users.dao.UsersDao"%>
<%@page import="test.users.dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/login.jsp</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<div class="container">
<%
	//1. 폼 전송되는 아이디 비밀번호를 읽어와서
	request.setCharacterEncoding("utf-8");

	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	
	UsersDto dto=new UsersDto();
	dto.setId(id);
	dto.setPwd(pwd);
	//2. 유효한 정보인지 확인해서
	boolean isValid = UsersDao.getInstance().isValid(dto);
	//로그인 성공후 이동할 경로
	String url=request.getParameter("url");
	//3. 응답
%>
<%if(isValid){ 
	//세션에 로그인정보를 담는다. 
	session.setAttribute("id",id);
%>
	<div class="panel panel-default">
	  <div class="panel-heading">
	    <h3 class="panel-title"><strong>로그인 결과</strong></h3>
	  </div>
	  <div class="panel-body">
	    	<p><strong><%=id %></strong>회원님 로그인 되었습니다.</p>
	  </div>
	  <div class="panel-footer">
	  	<a class="btn btn-default" href="<%=url %>">확인 <span class="glyphicon glyphicon-triangle-right"></span></a>
	  	<!-- JSP에서 사용할 수 있는 또다른 언어 EL -->
	  </div>
	</div>
<%}else{ %>
	<div class="panel panel-danger">
	  <div class="panel-heading">
	    <h3 class="panel-title"><strong>로그인 결과</strong></h3>
	  </div>
	  <div class="panel-body">
	    <p>아이디 혹은 비밀번호를 확인해주세요.</p>
	  </div>
	  <div class="panel-footer">
	  	<a class="btn btn-default" href="login_form.jsp?url=<%=url %>">로그인 홈 <span class="glyphicon glyphicon-triangle-right"></span></a>
	  	<!-- JSP에서 사용할 수 있는 또다른 언어 EL -->
	  </div>
	</div>
<%} %>
</div>
</body>
</html>