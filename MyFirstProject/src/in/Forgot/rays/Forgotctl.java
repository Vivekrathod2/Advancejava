package in.Forgot.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.AuthenticateBean;
import in.co.rays.AuthenticateModel;

@WebServlet("/Forgotctl")
public class Forgotctl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AuthenticateBean b = new AuthenticateBean();
		b.setUser(request.getParameter("login"));
		b.setPassword(request.getParameter("Password"));

		String result = null;
		PrintWriter p = response.getWriter();
		try {
			result = ForgotModel.auth(b);
			if (result != null) {
				RequestDispatcher rs = request.getRequestDispatcher("ForgetView.jsp");
				request.setAttribute("name", b.getPassword());
				rs.forward(request, response);
			} else {

				RequestDispatcher rs = request.getRequestDispatcher("ForgetView.jsp");
				request.setAttribute("name", "invalid id password");
				rs.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	}

}
