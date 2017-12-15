<%@page import="test.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete result</title>
</head>
<body>
<script>
	<%
		MemberDao dao = MemberDao.getInstance();
		int num=Integer.parseInt(request.getParameter("num"));
		boolean isSuccess = dao.delete(num);
	
	%>
	<%if(isSuccess){%>
		alert('삭제 성공');
	<%}else{%>
		alert('삭제 실패');
	<%}%>
	location.href="List.jsp";
</script>
</body>
</html>