<%@page import="test.users.dao.UsersDao"%>
<%@page import="test.users.dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/private/update.jsp</title>
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
<script>

</script>
</body>
</html>