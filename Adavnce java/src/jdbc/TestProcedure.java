package jdbc;
import java.sql.Connection;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Types;


public class TestProcedure {
	public static void main(String[] args) throws Exception{
		 Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sunraystech","root","root");
			CallableStatement callStmt =con.prepareCall("{CALL mark(?)}");
			
			callStmt.registerOutParameter(1, Types.INTEGER);
			callStmt.execute();
			int count = callStmt.getInt(1);
			
			System.out.println("Count :"+count);
			
	}			
}

