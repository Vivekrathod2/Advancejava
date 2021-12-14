package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;

public class ResourceBundleTest {
public static void main(String[] args) throws Exception {
	ResourceBundle rb = ResourceBundle.getBundle("jdbc.app");
	String url = rb.getString("url");
	String driver = rb.getString("driver");
	String user = rb.getString("username");
	String password = rb.getString("password");
	
	System.out.println(url);
	System.out.println(driver);
	System.out.println(user);
	System.out.println(password);
	
}
}
