<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/login_form</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<div class="container">
<%
	//로그인 후 리다이렉트 이동할 url 주소를 읽어옴
	String url=request.getParameter("url");
	if(url==null){
		//인덱스 페이지로 이동 될 수 있도록
		url=request.getContextPath();
	}
%>
	<div class="panel panel-default">
		<div class="panel-heading">
		    <h3 class="panel-title"><strong>로그인 페이지</strong></h3>
		</div>
		<div class="panel-body">
			<form class="horizontal-form" action="login.jsp?url=<%=url %>" method="post">
		    	<div class="form-group">
					<label class="control-label" for="id">아이디</label>
					<input class="form-control" type="text" name="id" id="id"/>	
				</div>
				<div class="form-group">
					<label class="control-label" for="pwd">비밀번호</label>
					<input class="form-control" type="text" name="pwd" id="pwd"/>
				</div>
				<button class="btn btn-default" type="submit">로그인</button>
			</form>
		</div>  	
	</div>
</div>
</body>
</html>