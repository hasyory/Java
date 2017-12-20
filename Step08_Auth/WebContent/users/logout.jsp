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
	//session.invalidate();
	//세션에 저장된 모든 내용 삭제
%>
	location.href="${pageContext.request.contextPath}/";
</script>
</body>
</html>