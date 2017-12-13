package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.MemberDao;

/*
 * 회원 정보를 삭제하고 응답하는 서블릿
 */

@WebServlet("/member/delete")
public class MemberDeleteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");

		PrintWriter pw = res.getWriter();
		MemberDao dao = MemberDao.getInstance();
		int num=Integer.parseInt(req.getParameter("num"));
		boolean isSuccess = dao.delete(num);
		
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>알림</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>알림</h3>");
		if(isSuccess) {
			pw.println("<p>"+num+"번 로우 삭제 성공.</p>");
		}else {
			pw.println("<p>"+num+"번 로우 삭제 실패.</p>");
		}
		pw.println("<a href='list'>뒤로 가기</a>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
