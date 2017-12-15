<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test08.jsp</title>
</head>
<body>
<%
	boolean isRun=true;
	String myName="권하경";
%>
<script>
	var isRun=<%=isRun%>;
	var myName="<%=myName%>";
	console.log(isRun);
	console.log(myName);
</script>
<h3>페이지 소스 보기를 해서 로딩된 javascript를 확인</h3>
</body>
</html>