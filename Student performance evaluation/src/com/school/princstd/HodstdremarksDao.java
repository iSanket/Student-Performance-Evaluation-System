package com.school.princstd;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HodstdremarksDao {
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
	public HodstdremarksDao() throws Exception {
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
		
	public boolean Hodstdremarks(Hodstdremarks lg) throws Exception{
		String query = "INSERT INTO STUDENTREMARKS(TTYPE,STDNOTIF) values(?,?)";
		stmt = con.prepareStatement(query);
		stmt.setString(1, lg.getTtype());
		stmt.setString(2, lg.getStdnotif());
		stmt.executeUpdate();
		stmt.close();
		return true;
	}
}

















