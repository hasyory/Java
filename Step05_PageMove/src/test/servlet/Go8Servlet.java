package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go8")
public class Go8Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("/go8 요청 처리중...");
		
		req.setAttribute("myName", "권먀몸");
		
		RequestDispatcher rd=
				req.getRequestDispatcher("view1.jsp");
		//view1.jsp 페이지(서블릿) 이 응답을 위임한다.
		//서블릿 처리를 다 한다음 html 처리가 쉬운 jsp로 넘기는 경우가 많음
		rd.forward(req, res);
		//req,res 객체를 전달
		//req.setAttribute(키, 값) 로 객체에 값을 저장할 수 있음.
		//값은 Object 타입으로 어떤 타입이든 담을 수 있다.
		//forward 받는 쪽에서는 해당 값을 .getAttribute()로 가져올 수 있음.
	}
}
