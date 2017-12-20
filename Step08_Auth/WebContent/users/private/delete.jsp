<%@page import="test.users.dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/private/delete.jsp</title>
<link rel="stylesheet" href="../../css/bootstrap.css" />
</head>
<body>
<%
	String id=(String)session.getAttribute("id");
	UsersDao.getInstance().delete(id);
	session.removeAttribute("id");
%>
<div class="container">
	<div class="panel panel-default">
	  <div class="panel-heading">
	    <h3 class="panel-title"><strong>탈퇴 결과</strong></h3>
	  </div>
	  <div class="panel-body">
	    	<p>탈퇴가 완료 되었습니다.</p>
	  </div>
	  <div class="panel-footer">
	  	<a class="btn btn-default" href="${pageContext.request.contextPath}/">확인 <span class="glyphicon glyphicon-triangle-right"></span></a>
	  </div>
	</div>
</div>
</body>
</html>