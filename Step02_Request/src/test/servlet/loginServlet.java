package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/login")
public class loginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter pw = res.getWriter();
		
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		
		System.out.println("ID:"+id+", PASSWORD:"+pwd);
		
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title>login</title>");
		pw.println("</head>");
		pw.println("<body>");
		if(id.equals("hk")&&pwd.equals("1234")){
			pw.println("<p> login ok~ </p>");
		}else {
			pw.println("<p> login <strong>fail</strong></p>");
		}
		pw.println("</body>");
		pw.println("</html>");
	}
}
