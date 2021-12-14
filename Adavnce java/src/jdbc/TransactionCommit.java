package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionCommit {
	public static void main(String[] args) throws Exception{
		 Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sunraystech","root","root");
		con.setAutoCommit(false);
		
		Statement stmt= con.createStatement();
		
		int i = stmt.executeUpdate("INSERT into raystech values(6,'Arpit','Soni',1000)");
		 i=  stmt .executeUpdate("INSERT into rays values(5,'motu','rathod')");
		 con.commit();
		 stmt.close();
		 con.close();
	}
}
