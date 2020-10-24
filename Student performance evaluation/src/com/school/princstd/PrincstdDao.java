package com.school.princstd;

import java.sql.Connection;

import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrincstdDao {
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
	public PrincstdDao() throws Exception {
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
		
	public boolean Princstd(Princstd lg) throws Exception{
		String query = "INSERT INTO STUDENTDETAILS(IMAGE, FNAME, MNAME,LNAME,STDNAME,DIVNAME,PH_NO, EMAILID, GENDER, NATIONALITY, PFNAME, PMNAME, PLNAME, OCCUPATION, PDOORNO, PSTREET, PCITY, PDISTRICT, PSTATE, PCOUNTRY, PPINCODE, DOBDATE,ROLEID) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,(SELECT MAX(ROLEID)FROM STUDENTDETAILS)+1)";
		stmt = con.prepareStatement(query);
		stmt.setString(1, lg.getImage());
		stmt.setString(2, lg.getFname());
		stmt.setString(3, lg.getMname());
		stmt.setString(4, lg.getLname());
		stmt.setString(5, lg.getStdname());
		stmt.setString(6, lg.getDivname());
		stmt.setLong(7, lg.getPhno());
		stmt.setString(8, lg.getEmailid());
		stmt.setString(9, lg.getGender());
		stmt.setString(10, lg.getNationality());
		stmt.setString(11, lg.getPfname());
		stmt.setString(12, lg.getPmname());
		stmt.setString(13, lg.getPlname());
		stmt.setString(14, lg.getOccupation());
		stmt.setString(15, lg.getPdoorno());
		stmt.setString(16, lg.getPstreet());
		stmt.setString(17, lg.getPcity());
		stmt.setString(18, lg.getPdistrict());
		stmt.setString(19, lg.getPstate());
		stmt.setString(20, lg.getPcountry());
		stmt.setInt(21, lg.getPpincode());
		long t =lg.getDob().getTime();
		java.sql.Date dob1 = new java.sql.Date(t);
		stmt.setDate(22, dob1);
		stmt.executeUpdate();
		stmt.close();
		return true;
	}
}

















