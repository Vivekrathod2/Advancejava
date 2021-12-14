package in.co.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/AuthenticateCtl")
public class AuthenticateCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("login");
		String password = request.getParameter("password");
		Cookie c = new Cookie(user, password);
		c.setMaxAge(24 * 60 * 60);
		response.addCookie(c);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AuthenticateBean b = new AuthenticateBean();
		b.setUser(request.getParameter("login"));
		b.setPassword(request.getParameter("Password"));

		request.setAttribute("error", "errormessage");

		AuthenticateBean bean = new AuthenticateBean();
		// AuthenticateModel model = new AuthenticateModel();
		PrintWriter p = response.getWriter();
		String result = null;
		try {
			result = AuthenticateModel.auth(b);
			HttpSession session = request.getSession();
			session.setAttribute("username", "user");
			session.setAttribute("pwd", "password");
			RequestDispatcher rs = request.getRequestDispatcher("welcomeView.jsp");
			request.setAttribute("session", "Session ");
			rs.forward(request, response);

			if (result.equals("success")) {
				RequestDispatcher rs1 = request.getRequestDispatcher("welcomeView.jsp");
				request.setAttribute("name", bean.getFname());
				rs1.forward(request, response);
			} else {

				RequestDispatcher rs2 = request.getRequestDispatcher("LoginAuthenticate.jsp");
				request.setAttribute("error", "invalid id password");
				rs2.forward(request, response);
			}

			p.println("done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			p.println(e.getMessage());
		}

	}
}