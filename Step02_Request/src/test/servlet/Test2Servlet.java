package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class Test2Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		
		String method = req.getMethod();
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		
		System.out.println("Method: "+method);
		System.out.println("Num: "+num);
		System.out.println("Name: "+name);

		PrintWriter pw = res.getWriter();
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>test</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Hello, "+num+" "+name+" ok!");
		pw.println("</body>");
		pw.println("</html>");	
	}
}