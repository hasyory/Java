package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.MemberDao;
import test.dto.MemberDto;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		MemberDao dao = MemberDao.getInstance();
		PrintWriter pw = res.getWriter();
		List<MemberDto> dtoList = dao.getList();
		
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>회원 목록</title>");
		pw.println("<style>");
		pw.println("td,th{padding: 3px 5px}");
		pw.println("th{border-bottom: 1px solid black}");
		pw.println("</style>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<a href='insertform.html'>회원 정보 추가</a>");
		pw.println("<h3>회원 목록</h3>");
		pw.println("<table style=\"border-spacing:0;\">");
		pw.println("<thead>");
		pw.println("<tr>");
		pw.println("<th>번호</th>");
		pw.println("<th>이름</th>");
		pw.println("<th>주소</th>");
		pw.println("<th>삭제</th>");
		pw.println("<th>수정</th>");
		pw.println("</tr>");
		pw.println("</thead>");
		pw.println("<tbody>");
		for(MemberDto tmp:dtoList) {
			pw.println("<tr>");
			pw.println("<td>"+tmp.getNum()+"</td>");
			pw.println("<td>"+tmp.getName()+"</td>");
			pw.println("<td>"+tmp.getAddr()+"</td>");
			pw.println("<td><a href='delete?num="+tmp.getNum()+"'>삭제</a></td>");
			pw.println("<td><a href='updateform?num="+tmp.getNum()+"'>수정</a></td>");
			pw.println("</tr>");
		}
		pw.println("</tbody>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
