<%@page import="test.board.dao.BoardDao"%>
<%@page import="test.board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/update.jsp</title>
</head>
<body>
<%
	//1. 폼 전송되는 수정할 글의 정보를 읽어와서
	request.setCharacterEncoding("utf-8");
	int num=Integer.parseInt(request.getParameter("num"));
	String writer=request.getParameter("writer");
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	//수정할 글 정보를 BoardDto에 담기
	BoardDto dto=new BoardDto();
	dto.setNum(num);
	dto.setWriter(writer);
	dto.setTitle(title);
	dto.setContent(content);
	//2. DB에 반영
	boolean isSuccess=BoardDao.getInstance().update(dto);
	//3. 응답! 
%>
<h3><%=num %>번 글의 정보를 수정했습니다.</h3>
<a href="List.jsp">글 목록 보기</a>
</body>
</html>