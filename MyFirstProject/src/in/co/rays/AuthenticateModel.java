package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthenticateModel {
	public static String auth(AuthenticateBean bean) throws Exception {
		String result = null;
		String pass = null;
		String name = null;
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/registration", "root", "root");

		PreparedStatement ps = con.prepareStatement("SELECT fname,password FROM user WHERE email=?");
		ps.setString(1, bean.getUser());
		
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			pass=rs.getString(2);
			
			bean.setFname(rs.getString(1));
		}
		if (bean.getPassword().equals(pass)) {
			result = "success";

	} else {
		result = "Not";
	}
		
		ps.close();
		rs.close();
		con.close();
		return result;
	}
}
