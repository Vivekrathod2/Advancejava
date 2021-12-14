package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;



public class MarksheetModel {
	/*public int NextPk() throws Exception {
		int pk=0;
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName(rb.getString("driver"));      //Resource bundle test
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sunraystech","root","root");
	PreparedStatement ps=con.prepareStatement("Select Max(id) from marksheet");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	pk=	rs.getInt(1);
		
	}
	return pk+1;
	}
*/
	public void add(MarksheetBean bean) throws Exception
	
	{
		 ResourceBundle rb=ResourceBundle.getBundle("jdbc.app");
	//	Class.forName("com.mysql.jdbc.Driver");
		Class.forName(rb.getString("driver"));      //Resource bundle test
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sunraystech","root","root"); 
		
		con.setAutoCommit(false);
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO marksheet VALUES(?,?,?,?,?,?)");
		//ps.setInt(1,NextPk());
		ps.setInt(1,bean.getRollno());
		ps.setString(2,bean.getFNAME());
		ps.setString(3,bean.getLNAME());
		ps.setInt(4,bean.getPHY());
		ps.setInt(5,bean.getCHE());
		ps.setInt(6,bean.getMATH());

		ps.execute();
		con.commit();
		ps.close();
		con.close();
		System.out.println("inserted");
	}
	
	public void update(MarksheetBean bean) throws Exception 
	{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sunraystech","root","root"); 
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("UPDATE marksheet SET FNAME=?, LNAME=?, phy=?, che=?, math=?, WHERE Rollno=?");
			
			ps.setInt(1,bean.getRollno());
			ps.setString(2,bean.getFNAME());
			ps.setString(3,bean.getLNAME());
			ps.setInt(4,bean.getPHY());
			ps.setInt(5,bean.getCHE());
			ps.setInt(6,bean.getMATH());

			ps.execute();
			System.out.println(ps.toString());
			con.commit();
			ps.close();
			con.close();
			System.out.println("updated");
	}
	
	public void delete(MarksheetBean bean) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sunraystech","root","root"); 
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("DELETE FROM marksheet WHERE Rollno = ?");
		
		ps.setInt(1, bean.getRollno());
		ps.execute();
		
		con.commit();
		ps.close();
		con.close();
		ps.execute();
		System.out.println("deleted");
		
	}
}
