<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1/main.jsp</title>
<style>
	.header{
		height: 100px;
		background-color: green;
	}
	.footer{
		height: 100px;
		background-color: pink;
	}
</style>
</head>
<body>
<!-- include 와 비슷, jsp:include로 선언하면
 요청한 main.jsp에 들어있는 header.jsp, footer.jsp main.jsp가 공동으로 응답함. 
 3개의 서블릿이 같이 응답-->
<jsp:include page="header.jsp"></jsp:include>
<div class="main">
	<h3>main 컨텐츠</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum ab exercitationem obcaecati architecto consequatur ut in molestias illo optio eos. Consectetur sunt est culpa velit! Earum in voluptas quasi iusto.</p>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>