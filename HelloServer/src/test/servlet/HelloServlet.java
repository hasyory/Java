package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// /hello 요청이 왔을 때 응답할 수 있도록 선언
// 서버가 시작 되는 시점에 @WebServlet을 찾아서 사용할 준비함
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//클라이언트에게 출력하기 위한 객체
		PrintWriter pw = response.getWriter();
		//world!라는 문자열 응답하기
		pw.println("world!");
	}
}