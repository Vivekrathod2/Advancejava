package in.co.rays;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@WebFilter("*.do")
public class FrontControler implements Filter {

    	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
	HttpServletRequest request =(HttpServletRequest) req;	
	HttpServletRequest response=(HttpServletRequest) res;
	
	HttpSession session = request.getSession();
	String login =(String) session.getAttribute("login");
	chain.doFilter(req, res);
	if(session.getAttribute("login")!=null)
	{
		RequestDispatcher rs = request.getRequestDispatcher("LoginAuthenticate.jsp");
		request.setAttribute("session", "session is expired");
		rs.forward(req, res);

	}
	else {
		chain.doFilter(req, res);
	}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
