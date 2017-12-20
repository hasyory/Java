<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/play1.jsp</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<div class="container">
	<%
		//로그인한 회원의 아이디 얻어오기
		String id=(String)session.getAttribute("id");
	%>
	<h3>놀자!</h3>
	<p><strong><%=id %></strong>님 놀아요!!</p>
	<p>로그인 된 사람만 접근 가능</p>
</div>
</body>
</html>