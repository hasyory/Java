<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> names=new ArrayList<>();
	names.add("하경");
	names.add("현우");
	names.add("양림");
	names.add("효정");
%>
<h1>친구 목록</h1>
<ul>
	<li><%=names.get(0) %></li>
	<li><%=names.get(1) %></li>
	<li><%=names.get(2) %></li>
	<li><%=names.get(3) %></li>
</ul>
<h1>친구 목록(for문)</h1>
<ul>
	<%for(int i=0; i<names.size(); i++){ %>
	<li><%=names.get(i) %></li>
	<%} %>
	
	<!-- 
		for(int i=0; i<names.size(); i++){
		out.print("<li>");
		out.print(names.get(i);
		out.println("</li>");
		} 과 동일하다.
	 -->
</ul>
<h1>친구 목록(확장 for문)</h1>
<ul>
	<%for(String tmp:names){ %>
	<li><%=tmp %></li>
	<%} %>
</ul>
</body>
</html>