package in.Forgot.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import in.co.rays.AuthenticateBean;

public class ForgotModel {
	public static String auth(AuthenticateBean bean) throws Exception {
		String password = null;
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/registration", "root", "root");

		PreparedStatement ps = con.prepareStatement("SELECT password FROM user WHERE email=?");
		ps.setString(1, bean.getUser());
		
		ResultSet rs = ps.executeQuery();
		bean.setPassword(password);
		while (rs.next()) {
			
		password=(rs.getString(1));
		}
		ps.close();
		rs.close();
		con.close();
		return  password;
}
}