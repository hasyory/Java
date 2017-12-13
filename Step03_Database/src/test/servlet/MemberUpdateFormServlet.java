package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 * 	수정할 회원정보를 출력해 주는 서블렛
 */
@WebServlet("/member/updateform")
public class MemberUpdateFormServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		
		MemberDao dao = MemberDao.getInstance();
		
		//1.수정할 회원의 번호를 얻어옴
		int num = Integer.parseInt(req.getParameter("num"));
		
		//2.MemberDao 객체를 이용해서 해당 번호의 회원정보를 얻어옴
		MemberDto dto = dao.getData(num);
		
		PrintWriter pw = res.getWriter();
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>정보 수정</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<form action='update' method='post'>");
		pw.println("<label for='num'>번호</label>");
		pw.println("<input type='hidden' name='num' value='"+dto.getNum()+"'/>");
		pw.println("<label for='name'>이름</label>");
		pw.println("<input type='text' name='name' value='"+dto.getName()+"'/>");
		pw.println("<label for='addr'>주소</label>");
		pw.println("<input type='text' name='addr' value='"+dto.getAddr()+"'/>");
		pw.println("<button type='submit'>수정</button>");
		pw.println("</form>");
		pw.println("<a href='list'>뒤로 가기</a>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
