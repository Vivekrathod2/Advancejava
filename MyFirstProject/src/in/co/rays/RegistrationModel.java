package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistrationModel {

	public static int nextPK() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/registration", "root", "root");
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("SELECT MAX(ID) FROM user");
		ResultSet resultSet = ps.executeQuery();
		while (resultSet.next()) {
			pk = resultSet.getInt(1);
		}

		return pk + 1;
	}

	public void add(RegistrationBean Bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/registration", "root", "root");

		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?)");
		ps.setInt(1, nextPK());
		ps.setString(2, Bean.getFname());
		ps.setString(3, Bean.getLname());
		ps.setString(4, Bean.getEmail());
		ps.setString(5, Bean.getPassword());
		ps.setString(6, Bean.getConfirmpassword());
		ps.setString(7, Bean.getGender());
		ps.setString(8, Bean.getDOB());

		ps.executeUpdate();
		ps.close();
		con.commit();
		con.close();

	}

}
