<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
<%
	String cPath=request.getContextPath();
%>
	<h3>Index page</h3>
	<ul>
		<li><a href="board/List.jsp">방명록 목록보기</a></li>
		<li><a href="<%=cPath%>/board/List.jsp">방명록 목록보기2</a></li>
		<li><a href="${pageContext.request.contextPath}/board/List.jsp">방명록 목록보기3</a></li>
		<!-- Expression Language 라고 하는데 나중에 배운댜 -->
	</ul>
</body>
</html>