<%@page import="test.dao.MemberDao"%>
<%@page import="test.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert result</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	MemberDto dto = new MemberDto();
	dto.setName(name);
	dto.setAddr(addr);
	MemberDao dao = MemberDao.getInstance();
	
	boolean isSuccess = dao.insert(dto);
%>
<script>
<%if(isSuccess){%>
	alert('입력 성공');
<%}else{%>
	alert('입력 실패');
<%}%>
	location.href="List.jsp";
</script>
</body>
</html>