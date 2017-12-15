<%@page import="test.dto.MemberDto"%>
<%@page import="test.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update result</title>
</head>
<body>
<%	
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("num2"));
	String name = request.getParameter("name2");
	String addr = request.getParameter("addr2");
	MemberDto dto = new MemberDto(num,name,addr);
	MemberDao dao = MemberDao.getInstance();
	
	boolean isSuccess = dao.update(dto); 
%>
<script>
<%if(isSuccess){%>
alert('수정 성공');
<%}else{%>
alert('수정 실패');
<%}%>
location.href="List.jsp";
</script>
</body>
</html>