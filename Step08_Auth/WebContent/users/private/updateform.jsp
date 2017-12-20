<%@page import="test.users.dao.UsersDao"%>
<%@page import="test.users.dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/private/updateform.jsp</title>
<link rel="stylesheet" href="../../css/bootstrap.css" />
</head>
<body>
<%

	String id=(String)session.getAttribute("id");
	UsersDto dto=UsersDao.getInstance().getData(id);

	String pwd=dto.getPwd();
	String email=dto.getEmail();

%>
<div class="container">
	<h3>내 정보</h3>
	<form action="update.jsp" class="horizontal-form" method="post" id="updateForm">
		<label class="control-label" for="id">아이디</label>
		<input class="form-control" type="text" value="<%=id %>" disabled="disabled"/>
		<input type="hidden" name="id" id="id" value="<%=id %>"/>	
		<label class="control-label" for="cpwd">현재 비밀번호</label>
		<input class="form-control" type="text" name="cpwd" value="<%=pwd %>" disabled="disabled"/>
		<label class="control-label" for="pwd">수정할 비밀번호</label>
		<input class="form-control" type="text" name="pwd" id="pwd"/>
		<label class="control-label" for="pwd2">비밀번호 확인</label>
		<input class="form-control" type="text" name="pwd2" id="pwd2"/>
		<label class="control-label" for="email">이메일</label>
		<input class="form-control" type="text" name="email" id="email" value="<%=email%>"/>
		<br>
		<button class="btn btn-default" type="submit">수정</button>
	</form>
</div>
<script>
document.querySelector("#updateForm")
.addEventListener("submit", function(event){
	var inputPwd=document.querySelector("#pwd").value;
	var inputPwd2=document.querySelector("#pwd2").value;
	if(inputPwd != inputPwd2){
		alert("비밀번호를 확인 하세요");
		event.preventDefault();//폼전송 막기 
	}
});
</script>
</script>
</body>
</html>