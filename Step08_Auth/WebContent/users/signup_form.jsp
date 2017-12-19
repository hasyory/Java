<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/signup_form</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<h3>회원가입 페이지</h3>
<form action="signup.jsp" method="post">
	<label for="id">아이디</label>
	<input type="text" name="id" id="id"/>	
	<label for="pwd">비밀번호</label>
	<input type="text" name="pwd" id="pwd"/>
	<label for="email">이메일</label>
	<input type="text" name="email" id="email"/>
	<button type="submit">가입</button>
</form>
</body>
</html>