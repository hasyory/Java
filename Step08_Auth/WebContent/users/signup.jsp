<%@page import="test.users.dao.UsersDao"%>
<%@page import="test.users.dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/signup.jsp</title>
</head>
<body>
<%
	//1. 폼 전송되는 내용을 읽어와서
	request.setCharacterEncoding("utf-8");

	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	String email=request.getParameter("email");
	
	UsersDto dto=new UsersDto();
	dto.setId(id);
	dto.setPwd(pwd);
	dto.setEmail(email);
	//2. DB에 저장
	UsersDao.getInstance().insert(dto);
	//3. 응답
%>
<p><strong><%=id %> 회원님 가입이 완료되었습니다.</strong></p>
<a href="${pageContext.request.contextPath}/">인덱스로 가기</a>
</body>
</html>