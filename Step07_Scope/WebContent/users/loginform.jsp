<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/loginform.jsp</title>
</head>
<body>
<h3>로그인 폼 입니다</h3>
<form action="login.jsp" method="post">
	아이디 <input type="text" name="id"/>
	비밀번호 <input type="text" name="pwd" />
	<button type="submit">로그인</button>
</form>
</body>
</html>