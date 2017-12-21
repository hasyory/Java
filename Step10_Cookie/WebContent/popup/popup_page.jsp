<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>popup/popup_page.jsp</title>
<style>
	body{
		background-color: #000;
		color: #fff;
	}
</style>
</head>
<body>
	<h3>팝업 페이지</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores dolorum reprehenderit facere quae voluptates molestiae ea. Neque dolorum sint modi deleniti. Laboriosam cumque odit accusantium libero dolorum perferendis facere rerum!</p>
	<form action="popup_page.jsp" method="post">
		<input type="checkbox" name="savedOpt" value="dont" />
		<label for="savedOpt">1분간 띄우지 않습니다.</label>
		<button type="submit">확인</button>
	</form>
</body>
</html>