<%@page import="test.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 삭제</title>
</head>
<body>
<%
	//1. GET 형식 파라미터로 전달되는 삭제할 회원의 번호 얻어오기
	int num=Integer.parseInt(request.getParameter("num"));

	//2. DB에서 삭제하고
	BoardDao.getInstance().delete(num);
	//3. 응답하기
%>
<script>
	alert("<%=num%>번 게시물 삭제 완료");
	location.href="List.jsp";
</script>
</body>
</html>