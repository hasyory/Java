package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/isReady")
public class ReadyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<title>okay</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h>Okay!</h>");
		pw.println("</body>");
		pw.println("</html>");	
	}
}
