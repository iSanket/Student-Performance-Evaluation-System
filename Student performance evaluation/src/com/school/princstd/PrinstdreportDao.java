package com.school.princstd;

import java.sql.Connection;

import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrinstdreportDao {
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
	public PrinstdreportDao() throws Exception {
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
		
	public boolean Prinstdreport(Prinstdreport lg) throws Exception{
		String query ="INSERT INTO STUDENTREPORT(TTYPE,STDID,STDNAME,SUB1,SUB2,SUB3,SUB4,SUB5,SUB6,TMARKS,PERCENT,RANK) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(query);
		stmt.setString(1, lg.getTtype());
		stmt.setInt(2, lg.getStdid());
		stmt.setString(3, lg.getStdname());
		stmt.setDouble(4, lg.getSub1());
		stmt.setDouble(5, lg.getSub2());
		stmt.setDouble(6, lg.getSub3());
		stmt.setDouble(7, lg.getSub4());
		stmt.setDouble(8, lg.getSub5());
		stmt.setDouble(9, lg.getSub6());
		stmt.setDouble(10, lg.getTmarks());
		stmt.setFloat(11, lg.getPercent());
		stmt.setString(12, lg.getRank());
		System.out.println("ok fetching");
		stmt.executeUpdate();
		stmt.close();
		return true;
	}
}

















