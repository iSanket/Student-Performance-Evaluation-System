package com.school.princstd;

import java.sql.Connection;

import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrinstdnotificationDao {
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
	public PrinstdnotificationDao() throws Exception {
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
		
	public boolean Prinstdnotification(Prinstdnotification lg) throws Exception{
	 String query = "INSERT INTO NOTIFICATION(STDNOTIF,DNOTIF) values(?,?)";
		//	String query = "UPDATE NOTIFICATION SET STDNOTIF="+lg.getStdnotif()+"DNOTIF="+lg.getDnotif();
		stmt = con.prepareStatement(query);
		System.out.println("notification"+lg.getStdnotif());
		stmt.setString(1, lg.getStdnotif());
		long dn =lg.getDnotif().getTime();
		java.sql.Date dnotif = new java.sql.Date(dn);
		stmt.setDate(2, dnotif);
		System.out.println("date"+dnotif);
		stmt.executeUpdate();
		System.out.println();
		stmt.close();
		return true;
	}
}

















