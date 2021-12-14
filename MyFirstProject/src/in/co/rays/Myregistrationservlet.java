package in.co.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Myregistrationservlet")
public class Myregistrationservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd1 = request.getRequestDispatcher("/UserRegistration.jsp");
		rd1.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("in post..");
		RegistrationBean M = new RegistrationBean();
		String pass1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
		String emailregex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	    String expression = "^[a-zA-Z\\s]+"; 

		String fname = request.getParameter("firstName");
		M.setFname(fname);

		String lname = request.getParameter("lastName");
		M.setLname(lname);

		String email = request.getParameter("email");
		M.setEmail(email);

		String password = request.getParameter("password");
		M.setPassword(password);

		String gender = request.getParameter("gender");
		M.setGender(gender);

		String confrmpass = request.getParameter("Confirmpassword");
		M.setConfirmpassword(confrmpass);

		String DOB = request.getParameter("dob");
		M.setDOB(DOB);

		System.out.println(" fname " + M.getFname());
		System.out.println("confirm pass " + M.getConfirmpassword());
		System.out.println("dob " + M.getDOB());
		System.out.println(" gender +" + M.getGender());
		System.out.println("lname " + M.getLname());
		System.out.println("pass " + M.getPassword());
		System.out.println("email " + M.getEmail());

		RegistrationModel r = new RegistrationModel();

		if (M.getPassword() != null && !M.getPassword().matches(pass1)) {
			request.setAttribute("passswordRegexMessage",
					"please enter proper format including for Password special character,numbers.");
		}

		if (M.getEmail() != null && !M.getEmail().matches(emailregex)) {
			System.out.println("Email regex checking post");
			request.setAttribute("emailid", "please enter proper format for Email including special character,numbers");
		} else {
			try {
				r.add(M);
				request.setAttribute("msg", "you have successfully registered");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		RequestDispatcher rd1 = request.getRequestDispatcher("/UserRegistration.jsp");
		rd1.forward(request, response);

	}

}
