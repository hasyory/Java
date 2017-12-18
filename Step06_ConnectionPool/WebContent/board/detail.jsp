<%@page import="test.board.dao.BoardDao"%>
<%@page import="test.board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자세히 보기</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<%
	//1. 파라미터를 전달하는 글의 번호를 읽어와서
	int num=Integer.parseInt(request.getParameter("num"));
	//2. DB에서 해당글의 정보를 읽어와서
	BoardDto dto=BoardDao.getInstance().getData(num);
	//3. 응답
%>
<div class="container">
	<div class="panel panel-default">
	  <div class="panel-heading">
	    <h3 class="panel-title"><strong><%=dto.getTitle() %></strong></h3>
	    <p>작성자 : <%=dto.getWriter() %> / 작성시각 : <%=dto.getRegdate() %></p>
	  </div>
	  <div class="panel-body">
	    	<div><%=dto.getContent() %></div>
	  </div>
	  <div class="panel-footer">
	  	<a class="btn btn-default" href="List.jsp">뒤로가기<span class="glyphicon glyphicon-triangle-right"></span></a>
		<a class="btn btn-default" href="updateform.jsp?num=<%=num%>">수정<span class="glyphicon glyphicon-pencil"></span></a>
	  	<a class="btn btn-default" href="javascript:isDelete()">삭제<span class="glyphicon glyphicon-trash"></span></a>
	  </div>
	</div>
</div>
<script>
	function isDelete(){
		var result=confirm("삭제 하시겠습니까?");
		if(result){
			location.href="delete.jsp?num=<%=num%>";
		}
	}
</script>
</body>
</html>