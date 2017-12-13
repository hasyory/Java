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

@WebServlet("/member/insert")
public class MemberInsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		
		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		MemberDao dao = MemberDao.getInstance();
		
		boolean isSuccess = dao.insert(dto);
				
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>알림</title>");
		pw.println("</head>");
		pw.println("<body>");
		if(isSuccess) {
			pw.println("<p>멤버 추가 성공</p>");
		}else {
			pw.println("<p>멤버 추가 실패</p>");
		}
		pw.println("<a href='list'>뒤로 가기</a>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
