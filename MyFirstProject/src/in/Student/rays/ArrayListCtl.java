package in.Student.rays;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ArrayListCtl")
public class ArrayListCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ArrayListCtl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

					ArrayList<StudentBean> list = new ArrayList<StudentBean>();
			try {
				list = StudentModel.search();
				RequestDispatcher rd = request.getRequestDispatcher("ArraListView.jsp");
				request.setAttribute("list", list);
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
