<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성 페이지</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
<div class="container">
	<form class="form-horizontal" action="insert.jsp" method="post">
		<div class="form-group">
			<label class="control-label" for="writer" class="">작성자</label>
			<input class="form-control" type="text" name="writer" id="writer"/>
		</div>
		<div class="form-group">
			<label class="control-label" for="title">제목</label>
			<input class="form-control" type="text" name="title" id="title"/>
		</div>
		<div class="form-group">
			<label class="control-label" for="content">내용</label>
			<textarea class="form-control" name="content" id="content" cols="30" rows="10"/></textarea>
		</div>
		<button class="btn btn-default" type="submit">저장</button>
	</form>
</div>
</body>
</html>