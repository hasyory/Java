<%@page import="test.board.dao.BoardDao"%>
<%@page import="test.board.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/board/List.jsp</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<%
	// 글 목록 얻어오기
	List<BoardDto> list = BoardDao.getInstance().getList();
%>
<div class="container">
	<table class="table">
	    <colgroup>
    		<col class="col-xs-1"/>
    		<col class="col-xs-2"/>
    		<col class="col-xs-7"/>
    		<col class="col-xs-2"/>
    	</colgroup>
		<caption>글 목록</caption>
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<%for(BoardDto tmp:list){ %>
			<tr>
			<td><%=tmp.getNum() %></td>
			<td><%=tmp.getWriter() %></td>
			<td><a href="detail.jsp?num=<%=tmp.getNum()%>"><%=tmp.getTitle() %></a></td>
			<td><%=tmp.getRegdate() %></td>
			<%} %>
			</tr>
		</tbody>
		<tfoot>
			<tr>
			<td class="text-right" colspan="6"><a class="btn btn-default" href="insertform.jsp">새 글</a></td>
			</tr>
		</tfoot>
	</table>
</div>
</body>
</html>