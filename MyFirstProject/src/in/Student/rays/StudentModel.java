package in.Student.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {

	public static void add(StudentBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "root");
		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("Insert INTO user values(?,?,?,?,?)");

		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getRollNo());
		ps.setString(5, bean.getSession());

		ps.execute();

		con.commit();

		ps.close();
		con.close();

		System.out.println("add");
	}

	public static void update(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "root");
		con.setAutoCommit(false);

		PreparedStatement ps = con
				.prepareStatement("UPDATE user SET  firstName=?, lastName=?, rollNo=?, Session=? WHERE id=? ");

		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getRollNo());
		ps.setString(4, bean.getSession());
		ps.setInt(5, bean.getId());
		ps.execute();
		con.commit();
		ps.close();
		con.close();
		System.out.println("update");

	}

	public static void delete(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "root");
		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM user WHERE ID =?");

		ps.setInt(1, bean.getId());

		ps.execute();
		con.commit();
		ps.close();
		con.close();
		System.out.println("delete");

	}public static void get(StudentBean bean ) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "root");
		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE ID=?");
		ps.setInt(1, bean.getId());

		ps.execute();
		con.commit();
		ps.close();
		con.close();
		
	}

	public static ArrayList<StudentBean> search() throws Exception {
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", "root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM user");
		ResultSet rs = ps.executeQuery();
		while (rs.next())
		{
			StudentBean bean = new StudentBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setRollNo(rs.getString(4));
			bean.setSession(rs.getString(5));
			list.add(bean);
		}
		ps.close();
		con.close();
		return list;

	}
}