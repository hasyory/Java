<%@page import="test.users.dao.UsersDao"%>
<%@page import="test.users.dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/private/update.jsp</title>
<link rel="stylesheet" href="../../css/bootstrap.css" />
</head>
<body>
<%
	//폼 전송되는 내용을 읽어와서
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	String email=request.getParameter("email");
	
	UsersDto dto = new UsersDto();
	dto.setId(id);
	dto.setPwd(pwd);
	dto.setEmail(email);
	//DB에 반영하고
	boolean isSuccess = UsersDao.getInstance().update(dto);
	//응답한다.
%>
<div class="container">
	<div class="panel panel-default">
	  <div class="panel-heading">
	    <h3 class="panel-title"><strong>수정 결과</strong></h3>
	  </div>
	  <div class="panel-body">
	    	<p><strong><%=dto.getId() %></strong>회원님 정보를 수정했습니다.</p>
	  </div>
	  <div class="panel-footer">
	  	<a class="btn btn-default" href="myInfo.jsp">확인<span class="glyphicon glyphicon-triangle-right"></span></a>
	  </div>
	</div>
</div>
</body>
</html>