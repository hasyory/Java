<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
<%
	String id=(String)session.getAttribute("id");
%>
<div class="container">
	<div class="panel panel-default">
	  <div class="panel-heading">
    	<div class="col-xs-6 text-left">
    		<h3 class="panel-title"><strong>인덱스 페이지</strong></h3>
    	</div>
    	<div class="col-xs-push-6 text-right">
		    <%if(id!=null){ %>
			<span class="glyphicon glyphicon-user"></span><a href="users/private/myInfo.jsp"><strong><%=id %></strong></a>님 환영합니다. 
			<a class="btn btn-default btn-xs" href="users/logout.jsp">로그아웃<span class="glyphicon glyphicon-log-out"></span></a>
			<%}else{%>
			환영합니다.  
			<a class="btn btn-default btn-xs" href="users/login_form.jsp?url=${pageContext.request.contextPath}/">로그인</a>
			<a class="btn btn-default btn-xs" href="users/signup_form.jsp">회원가입</a> 
			<% }%>
		</div>
	  </div>
	  <div class="panel-body">
	 	 <ul>
			<li><h3>비로그인 -> 회원가입 / 로그인</h3></li>
			<li><h3>로그인 -> 회원정보 보기 / 수정 / 탈퇴</h3></li>
			<li><a href="member/play1.jsp" class="btn btn-default btn-sm">놀러가자</a></li>
		</ul>
	  </div>
	</div>
</div>
</body>
</html>