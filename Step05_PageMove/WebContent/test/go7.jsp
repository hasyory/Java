<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test/go7.jsp</title>
</head>
<body>
<h3>5초 후에 /test/result7.jsp 페이지로 이동합니다.</h3>
<script>
	setTimeout(function(){
		location.href="result7.jsp";
	},5000);
</script>
</body>
</html>