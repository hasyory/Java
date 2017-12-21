<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>popup2/main.jsp</title>
</head>
<body>
<%
	//페이지 접속시 팝업이 바로 표시되는 것은
	//웹 접근성에 위배 된다. (알아두쟈)
	
	//팝업창을 띄울지에 대한 여부
	boolean canPopup=true;

	//쿠키 목록을 읽어옴
	Cookie[] cookies=request.getCookies();
	//반복문 돌면서 쿠키 확인
	for(Cookie tmp: cookies){
		//popup이라는 키값으로 젖아된 쿠키가 존재하면
		if(tmp.getName().equals("popup")){
			//팝업을 띄우지 않도록 설정
			canPopup=false;
		}
	}
%>
<%if(canPopup){ %>
	<script>
		window.open("popup_page.jsp", "팝업",
			"width=460, height=550,top=100,left=100, toolbar=no, menubar=no, location=no");
	</script>
<%} %>
<h3>메인 페이지</h3>
<p>먀몸 홈쇼핑</p>
</body>
</html>