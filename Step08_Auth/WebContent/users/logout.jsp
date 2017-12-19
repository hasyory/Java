<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/logout.jsp</title>
</head>
<body>
<%
	String id=(String)session.getAttribute("id");
%>
<script>
	alert("<%=id%>님 로그아웃 되었습니다.");
<%	
	session.removeAttribute("id");
%>
	location.href="${pageContext.request.contextPath}/";
</script>
</body>
</html>