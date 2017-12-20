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
	<div class="container">
		<div class="panel panel-default">
		  <div class="panel-heading">
		    <h3 class="panel-title"><strong>내 정보</strong></h3>
		  </div>
		  <div class="panel-body">
		  	<table class="table">
		  		<col-group>
		  			<col class="col-xs-3" />
		  			<col class="col-xs-9" />
		  		</col-group>
		  		<tr>
		  			<th>ID</th>
		  			<td><%=id %></td>
		  		</tr>
		  		<tr>
		  			<th>Password</th>
		  			<td><%=dto.getPwd() %></td>
		  		</tr>
		  		<tr>
		  			<th>E-Mail</th>
		  			<td><%=dto.getEmail() %></td>
		  		</tr>
		  		<tr>
		  			<th>Registration date</th>
		  			<td><%=dto.getDate() %></td>
		  		</tr>
		  	</table>
		  </div>
		  <div class="panel-footer">
		  	<a class="btn btn-default" href="${pageContext.request.contextPath}/">홈 <span class="glyphicon glyphicon-triangle-right"></span></a>
		  	<a class="btn btn-default" href="updateform.jsp">수정 <span class="glyphicon glyphicon-pencil"></span></a>
		  	<a class="btn btn-default" href="javascript:isConfirm()">회원 탈퇴 <span class="glyphicon glyphicon-trash"></span></a>
		  </div>
		</div>
	</div>
</div>
<script>
	isConfirm=function(){
		var isOk=confirm("정말 탈퇴 하시겠습니까?");
		if(isOk){
			location.href="delete.jsp";
		}
	};
</script>
</body>
</html>