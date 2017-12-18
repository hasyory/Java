<%@page import="test.board.dto.BoardDto"%>
<%@page import="test.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/updateform.jsp</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<%
	//1. GET 방식 파라미터로 전달되는 수정할 회원의 정보를 얻어옴
	int num=Integer.parseInt(request.getParameter("num"));
	//2. 수정할 회원 한 열의 정보를 이용해 SELECT 함
	BoardDto dto=BoardDao.getInstance().getData(num);
	//3. SELECT 한 회원정보를 from 에 출력하는 응답

%>
<div class="container">
	<form class="form-horizontal" action="update.jsp" method="post">
		<div class="form-group">
			<label class="control-label" for="writer">작성자</label>
			<input class="form-control" type="text" name="writer" id="writer" value="<%=dto.getWriter()%>"/>
			<label class="control-label" for="num">글번호</label>
			<input class="form-control" type="hidden" name="num" id="num" value="<%=dto.getNum()%>"/>
			<input class="form-control" type="text" value="<%=dto.getNum()%>" disabled="disabled"/>
			<label class="control-label" for="regdate">작성시간</label>
			<input class="form-control" type="text" name="regdate" id="regdate" value="<%=dto.getRegdate()%>"/>
		</div>
		<div class="form-group">
			<label class="control-label" for="title">제목</label>
			<input class="form-control" type="text" name="title" id="title" value="<%=dto.getTitle()%>"/>
		</div>
		<div class="form-group">
			<label class="control-label" for="content">내용</label>
			<textarea class="form-control" name="content" id="content" cols="30" rows="10"/><%=dto.getContent()%></textarea>
		</div>
		<button class="btn btn-default" type="submit">수정</button>
	</form>
</div>
</body>
</html>