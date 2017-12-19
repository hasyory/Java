<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/login.jsp</title>
</head>
<body>
<%
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	
	boolean isValid=false;
	
	if(id.equals("gura") && pwd.equals("1234")){
		//세션 객체를 얻어와서
		HttpSession ses=request.getSession();
		//세션에 로그인 정보를 담는다.
		//세션에 담아진 정보는 세션이 끊길 때까지 유지된다. (웹브라우저를 닫거나, 임의로 끊었을때)
		//로그인 정보를 request에 담게 되면 페이지를 이동할 때 마다 요청해야하는 불편함이 있음
		//그래서 세션에 담는게 유용함.
		ses.setAttribute("id",id);
		isValid=true;
	}
%>
<%if(isValid){ %>
	<p><strong><%=id %></strong>회원님 로그인 되었습니다.</p>
<%}else{ %>
	<p>아이디 혹은 비밀번호가 틀립니다.</p>
<%} %>
</body>
</html>