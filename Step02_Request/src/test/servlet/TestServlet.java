package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		
		//요청 메소드 추출
		String method = req.getMethod();
		System.out.println("Method: "+method);
		//요청 파라미터 추출
		String name = req.getParameter("name");
		System.out.println("Name: "+name);

		PrintWriter pw = res.getWriter();
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>test</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Hello, "+name+" ok!");
		pw.println("</body>");
		pw.println("</html>");
	}
}
