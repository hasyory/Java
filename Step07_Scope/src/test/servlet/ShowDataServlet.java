package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dto.MemberDto;

@WebServlet("/member/showdata")
public class ShowDataServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//GET 방식 전송 파라미터 추출
		int num=Integer.parseInt(req.getParameter("num"));
		
		//DB에서 해당 회원의 정보를 읽어옴
		//가상으로 읽어왔다 가정
		
		MemberDto dto=new MemberDto(1,"권먀몸","사당");
		//request 영역에 담는다.
		//어떤 키 값으로 어떤 타입을 담았는지 기억
		req.setAttribute("dto", dto);
		
		//forward 방식으로 이동한다. jsp 페이지로 응답을 위임
		RequestDispatcher rd =
				req.getRequestDispatcher("/member/showdata.jsp");
		rd.forward(req, res);

	}
}
