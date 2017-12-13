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

@WebServlet("/member/update")
public class MemberUpdateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		
		PrintWriter pw = res.getWriter();
		
		int num = Integer.parseInt(req.getParameter("num"));
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		MemberDto dto = new MemberDto(num,name,addr);
		MemberDao dao = MemberDao.getInstance();
		
		boolean isSuccess = dao.update(dto);
				
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>알림</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<script>");
		if(isSuccess) {
			pw.println("alert('멤버 정보 수정 성공');");
		}else {
			pw.println("alert('멤버 정보 수정 실패');");
		}
		pw.println("location.href='list';");
		pw.println("</script>");
		
		pw.println("</body>");
		pw.println("</html>");
	}
}
