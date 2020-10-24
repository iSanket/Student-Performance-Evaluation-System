package com.school.princstd;

import java.sql.Connection;

import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrinfacdetailsDao {
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
	public PrinfacdetailsDao() throws Exception {
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
		
	public boolean Prinfacdetails(Prinfacdetails lg) throws Exception{
		String query = "INSERT INTO FACULTYDETAILS(IMAGE, FNAME, MNAME,LNAME,PH_NO, EMAILID, GENDER, NATIONALITY, SPNAME, IPNAME, GPNAME,PGNAME, PDOORNO, PSTREET, PCITY, PDISTRICT, PSTATE, PCOUNTRY, PPINCODE, DOBDATE,ROLEID) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,(SELECT MAX(ROLEID)FROM STUDENTDETAILS)+1)";
		stmt = con.prepareStatement(query);
		stmt.setString(1, lg.getImage());
		stmt.setString(2, lg.getFname());
		stmt.setString(3, lg.getMname());
		stmt.setString(4, lg.getLname());
		stmt.setLong(5, lg.getPhno());
		stmt.setString(6, lg.getEmailid());
		stmt.setString(7, lg.getGender());
		stmt.setString(8, lg.getNationality());
		stmt.setString(9, lg.getSpname());
		stmt.setString(10, lg.getIpname());
		stmt.setString(11, lg.getGpname());
		stmt.setString(12, lg.getPgname());
		stmt.setString(13, lg.getPdoorno());
		stmt.setString(14, lg.getPstreet());
		stmt.setString(15, lg.getPcity());
		stmt.setString(16, lg.getPdistrict());
		stmt.setString(17, lg.getPstate());
		stmt.setString(18, lg.getPcountry());
		stmt.setInt(19, lg.getPpincode());
		System.out.println("query");
		long t =lg.getDob().getTime();
		java.sql.Date dob1 = new java.sql.Date(t);
		//System.out.println((java.sql.Date)lg.getDob());
		stmt.setDate(20, dob1);
		//stmt.setDob(36, lg.getDob());
		stmt.executeUpdate();
		System.out.println("stmt");
		System.out.println(stmt);
		stmt.close();
		return true;
	}
}

















