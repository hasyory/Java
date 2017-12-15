<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean isValid=false;
	//폼 전송되는 파라미터 추출
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	//DB에서 해당 정보가 유효한 정보인지 확인
	if(id.equals("gura") && pwd.equals("1234")){
		isValid=true;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<%if(isValid){ %>
<p><strong><%=id %></strong> 님 로그인 되었습니다.</p>
<%}else{ %>
<p>아이디 혹은 비밀번호를 확인해주세요.</p>
<%} %>
<a href="index.html">To INDEX</a>
</body>
</html>