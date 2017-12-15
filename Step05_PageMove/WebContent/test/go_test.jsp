<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test/go_test.jsp</title>
<script src="../js/jquery-3.2.1.js"></script>
</head>
<body>
<h3><span>5</span>초 후에 /test/result_test.jsp로 이동합니다.</h3>
<script>
	var i=5;
	setInterval(function(){
		i--;
		$("span").text(i);
		if(i==0){
			location.href="result_test.jsp";
		}
	},1000);
</script>
</body>
</html>