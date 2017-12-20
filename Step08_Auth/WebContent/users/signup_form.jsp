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
<div class="container">
	<div class="panel panel-default">
	  <div class="panel-heading">
	    <h3 class="panel-title"><strong>회원가입 페이지</strong></h3>
	  </div>
	  <div class="panel-body">
	    <form class="horizontal-form" action="signup.jsp" method="post">
	    	<div class="form-group">
				<label class="control-label" for="id">아이디</label>
				<input class="form-control" type="text" name="id" id="id"/>	
			</div>
			<div class="form-group">
				<label class="control-label" for="pwd">비밀번호</label>
				<input class="form-control" type="text" name="pwd" id="pwd"/>
			</div>
			<div class="form-group">
				<label class="control-label" for="email">이메일</label>
				<input class="form-control" type="text" name="email" id="email"/>
			</div>
			<button class="btn btn-default" type="submit">가입</button>
		</form>
	  </div>  	
	</div>
</div>
</body>
</html>