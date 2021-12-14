package in.Cookie.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookiesCtl")
public class GetCookiesCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		Cookie []ck = request.getCookies();
  		for(int i=0; i<ck.length; i++)
  		{
  			Cookie c = ck[i];
  			String name = c.getName();
  			String value = c.getValue();
  			PrintWriter p= response.getWriter();
  			
  		}
  	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
	