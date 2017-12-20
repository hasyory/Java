package test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * 	javax.servlet.Filter 인터페이스를 구현해서 만든다.
 * 
 */
@WebFilter({"/users/private/*","/member/*"})
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}
	//필터가 수행이 될 때 호출되는 메소드
	//ServletRequest는 HttpServletRequest의 부모 타입 
	//ServletResponse는 HttpServletResponse의 부모 타입 
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		//원래 type으로 캐스팅
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		//HttpSession 객체의 참조값 얻어오기
		HttpSession session=request.getSession();
		//Context 경로 얻어오기
		String cPath=request.getContextPath();
		//원래 요청 url 정보 얻어오기
		String url=request.getRequestURI();
		//session 에 로그인 정보가 있는지 여부 확인
		if(session.getAttribute("id")==null) {
			//로그인 페이지로 경로 구성
			String path=cPath+"/users/login_form.jsp?url="+url;
			//로그인 페이지로 이동 시킴
			response.sendRedirect(path);
		}else {
			//원래 하려던 작업 진행 시키기
			chain.doFilter(req, res);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}
