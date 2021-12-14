package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
public class ConnectionTest {
	public static void main(String[] args) throws Exception{
	 Class.forName("com.mysql.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sunraystech","root","root");
	Statement stmt= con.createStatement();
	 ResultSet rs= stmt.executeQuery("select * from employee");
	 while (rs.next()) {
		 System.out.print(rs.getInt(1));
		 System.out.print(rs.getString(2));
		 System.out.print(rs.getInt(3));
		 System.out.println(rs.getInt(4));

	}
	
	 stmt.close();
	 con.close();
	
	}

	private Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

	 