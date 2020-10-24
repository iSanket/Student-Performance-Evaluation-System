package com.school.princstd;

import java.sql.Connection;

import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrintimetableDao {
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
	public PrintimetableDao() throws Exception {
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
		
	public boolean Printimetable(Printimetable lg) throws Exception{
		String query = "INSERT INTO TIMETABLE(TTYPE,TELUGU,HINDI,ENGLISH,MATHS,SCIENCE,SOCIAL) values(?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(query);
		stmt.setString(1, lg.getTtype());
		long t =lg.getTelugu().getTime();
		java.sql.Date telugu = new java.sql.Date(t);
		stmt.setDate(2, telugu);
		long h =lg.getHindi().getTime();
		java.sql.Date hindi = new java.sql.Date(h);
		stmt.setDate(3, hindi);
		long e =lg.getEnglish().getTime();
		java.sql.Date english = new java.sql.Date(e);
		stmt.setDate(4, english);
		long m =lg.getMaths().getTime();
		java.sql.Date maths = new java.sql.Date(m);
		stmt.setDate(5, maths);
		long s =lg.getScience().getTime();
		java.sql.Date science = new java.sql.Date(s);
		stmt.setDate(6, science);
		long so =lg.getSocial().getTime();
		java.sql.Date social = new java.sql.Date(so);
		stmt.setDate(7, social);
		stmt.executeUpdate();
		stmt.close();
		return true;
	}
}

















