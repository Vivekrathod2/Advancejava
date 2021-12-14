package jdbc;

///insert query

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionTest1 {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/vivek","root","root");
	 
     Statement stmt = con.createStatement();
     
     int i = stmt.executeUpdate("INSERT into harshita values(105,'MANISH','BSC')");
     
     System.out.println(i+ "Record(s) Updated");
     
     stmt.close();
     con.close();
     
}

}
