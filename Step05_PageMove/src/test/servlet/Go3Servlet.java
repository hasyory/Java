package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go3")
public class Go3Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("/go3 요청 처리중...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*
		 * 	[ 리다이렉트 이동하라는 응답하기 ]
		 * 
		 * 
		 * 	- 클라이언트에게 새로운 요청을 강제하는 응답
		 * 
		 */
		//상대 경로
		//res.sendRedirect("test/result3.jsp");
		//절대 경로, Context명은 코딩을 하면 안돼. 절대 경로는 메소드를 통해서 읽어 와야해요 
		//res.sendRedirect("/Step05_PageMove/test/result3.jsp");
		
		//Context Path 읽어오기 /Step05_PageMove <-이부분
		String cPath=req.getContextPath();
		//절대 경로 이동
		res.sendRedirect(cPath+"/test/result3.jsp");
	}
}
