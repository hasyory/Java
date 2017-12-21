<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>popup2/popup_page.jsp</title>
<style>

</style>
</head>
<body>
<form action="nopopup.jsp" method="post" name="myForm">
	<img src="openevent.jpg"/><br>
	<label>
		<input type="checkbox" name="chk" value="no" />
		1 분동안 팝업 띄우지 않기
	</label>
	<a href="javascript:closePopup()">닫기</a>
</form>
<script>
	function closePopup(){
		// 폼 강제 전송
		document.myForm.submit();
	}
</script>
</body>
</html>