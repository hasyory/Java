<%@page import="test.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test04.jsp</title>
</head>
<body>
<%
	List<MemberDto> list=new ArrayList<>();
	list.add(new MemberDto(1,"하경","사당"));
	list.add(new MemberDto(2,"현우","의왕"));
	list.add(new MemberDto(3,"향림","개봉"));
%>
<table>
	<caption><h3>친구 정보</h3></caption>
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
		</tr>
		<%for(MemberDto tmp:list){ %>
			<tr>
				<td><%=tmp.getNum() %></td>
				<td><%=tmp.getName() %></td>
				<td><%=tmp.getAddr() %></td>
			</tr>
		<%} %>
	</thead>
</table>
</body>
</html>