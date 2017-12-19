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
<div class="container">
<h3>인덱스 페이지</h3>
<%
	String id=(String)session.getAttribute("id");
%>
<%if(id!=null){ %>
<p><a href="users/private/myInfo.jsp"><strong><%=id %></strong></a>님 환영합니다. <a href="users/logout.jsp"><small>로그아웃</small></a></p>
<%}else{%>
<p>환영합니다.</p>
<% }%>
<ul>
	<li><a href="users/signup_form.jsp">회원가입</a></li>
	<li><a href="users/login_form.jsp?url=${pageContext.request.contextPath}/">로그인</a></li>
</ul>
</div>
</body>
</html>