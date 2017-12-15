<%@page import="test.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="test.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
<script src="../js/jquery-3.2.1.js"></script>
<script src="../js/bootstrap.js"></script>
<style>
	.form-inline{display: none;}}
	th:first-child{width: 80px;}
	td:first-child{width: 80px;}
</style>
</head>
<body>
<% 		
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> dtoList = dao.getList();
		
		String unum = request.getParameter("num");
		String uname = request.getParameter("name");
		String uaddr = request.getParameter("addr");
		if(unum==null)unum="";
		if(uname==null)uname="";
		if(uaddr==null)uaddr="";
%>	
<div class="container">
	<table class="table">
		<caption>회원 목록</caption>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>주소</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		<% for(MemberDto tmp:dtoList) {%>
			<tr>
				<td><%=tmp.getNum() %></td>
				<td><%=tmp.getName() %></td>
				<td><%=tmp.getAddr() %></td>
				<td><a href="List.jsp?num=<%=tmp.getNum()%>&name=<%=tmp.getName()%>&addr=<%=tmp.getAddr()%>"><span class="glyphicon glyphicon-pencil"></span></a></td>
				<td><a href="delete.jsp?num=<%=tmp.getNum()%>"><span class="glyphicon glyphicon-trash"></span></td>
			</tr>
		<%}%>
		</tbody>
		<tfoot>
			<tr>
				<form class="form-inline" action="insert.jsp" method="post">
					<td></td>
					<td><input class="form-control" type="text" name="name" placeholder="이름"/></td>
					<td><input class="form-control" type="text" name="addr" placeholder="주소"/></td>
					<td colspan="2"><button class="btn btn-default btn-block" type="submit">입력</button></td>
				</form>
			</tr>
			<tr>
				<form class="form-inline" action="update.jsp" method="post">
					<td><input class="form-control" type="text" disabled="disabled" value="<%=unum%>"/><input class="form-control" type="hidden" name="num2" value="<%=unum%>"/></td>
					<td><input class="form-control" type="text" name="name2" value="<%=uname%>"/></td>
					<td><input class="form-control" type="text" name="addr2" value="<%=uaddr%>"/></td>
					<td colspan="2"><button class="btn btn-default btn-block" type="submit">수정</button></td>
				</form>
			</tr>
		</tfoot>
	</table>
</div>
<script>

</script>
</body>
</html>