package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");

		String method = req.getMethod();
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");

		System.out.println("method:"+method+", name:"+name+", addr:"+addr);
		
		PrintWriter pw = res.getWriter();
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<meta charset=\"utf-8\"/>");
		pw.println("<title></title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Your name: "+name+" "+"Your address: "+addr);
		pw.println("</body>");
		pw.println("</html>");
	}
}
