package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class TestPrepare {
	public static void main(String[] args) throws Exception {
		add(103);
		//add(3);
	//	add(4);
		}

	private static void add(int a) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/vivek", "root", "root");
		int id = a;
		PreparedStatement ps = con.prepareStatement("SELECT * FROM HARSHITA WHERE ID = ?");
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}

		ps.close();
		con.close();

	}
}