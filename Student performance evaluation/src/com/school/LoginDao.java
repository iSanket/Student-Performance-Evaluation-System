package com.school;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	  public static final String DB_DRIVER="oracle.jdbc.driver.OracleDriver";
	  public static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	  public static final String DB_USER ="system";
	  public static final String DB_PASS ="ram";
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	// load & register driver class
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// open connection
	public LoginDao() throws Exception {
		con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	}
	// close connection
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
		}
		con = null;
	}

	public Login validate(String username, String password) throws Exception {
		boolean success = false;
		Login lg =new Login();
		String query = "SELECT USERNAME, PASSWORD, ROLE FROM LOGINTABLE WHERE USERNAME=? AND PASSWORD=?";
		stmt = con.prepareStatement(query);
		stmt.setString(1, username);
		stmt.setString(2, password);
		rs = stmt.executeQuery();
		if(rs.next())
		{
		 String uname=rs.getString("USERNAME");
		 String pas=rs.getString("PASSWORD");
		 String role=rs.getString("ROLE");
		 lg.setUsername(uname);
		 lg.setPassword(pas);
		 lg.setRole(role);
		 System.out.printf(role);
		}
		rs.close();
		stmt.close();
		return lg;
	}
}
















