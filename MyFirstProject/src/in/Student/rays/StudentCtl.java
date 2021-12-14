package in.Student.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/StudentCtl")
public class StudentCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		bean.setFirstName("vivek");
		request.setAttribute("sbean", bean);
		RequestDispatcher rd = request.getRequestDispatcher("StudentView.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		bean.setId(Integer.parseInt(request.getParameter("ID")));
		bean.setFirstName(request.getParameter("firstName"));
		bean.setLastName(request.getParameter("lastName"));
		bean.setRollNo(request.getParameter("RollNo"));
		bean.setSession(request.getParameter("session"));
		String p = request.getParameter("operation");
		if (p.equals("add")) {
			try {
				StudentModel.add(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rs = request.getRequestDispatcher("StudentView.jsp");
			request.setAttribute("Success", "Data add successfully");
			rs.forward(request, response);
		} else if (p.equals("modify")) {
			try {
				StudentModel.update(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher tt = request.getRequestDispatcher("StudentView.jsp");
			request.setAttribute("Update", "Data update successfully");
			tt.forward(request, response);

		}else if(p.equals("delete")){
		try {
			StudentModel.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher tt = request.getRequestDispatcher("StudentView.jsp");
		request.setAttribute("Delete", "Data deleted successfully");
		tt.forward(request, response);

		
	}else if(p.equals("search"))
	{
		try {
			StudentModel.search();
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher tt = request.getRequestDispatcher("StudentView.jsp");
		request.setAttribute("search", "Data Search successfully");
		tt.forward(request, response);

	}
	else if(p.equals("get")) {
		try {
			StudentModel.get(bean);
		} catch (Exception e) {
			// TODO: handle exception
		}RequestDispatcher tt = request.getRequestDispatcher("StudentView.jsp");
		request.setAttribute("get", "get data successfully");
		tt.forward(request, response);

	}

}
}