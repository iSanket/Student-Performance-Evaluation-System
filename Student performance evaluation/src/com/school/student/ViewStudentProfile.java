package com.school.student;

import java.sql.*;  
import java.util.ArrayList;  
import com.school.princstd.Princstd;

public class ViewStudentProfile 
{  
	private int roleid;

	
public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
ArrayList<Princstd> list=new ArrayList<Princstd>();  
  

public ArrayList<Princstd> getList() {  
    return list;  
}  
public void setList(ArrayList<Princstd> list) {  
    this.list = list;  
}  
public String execute(){  
	try{  
  Class.forName("oracle.jdbc.driver.OracleDriver");  
  Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","system","ram");  
              
  PreparedStatement ps=con.prepareStatement("select * from STUDENTDETAILS WHERE ROLEID="+this.getRoleid());  
  ResultSet rs=ps.executeQuery();  
  
  while(rs.next()){  
	  Princstd ps1 =new Princstd();
	  ps1.setRoleid(rs.getInt(1));
	  ps1.setFname(rs.getString(2));
	  ps1.setMname(rs.getString(3));
      ps1.setLname(rs.getString(4));
      ps1.setStdname(rs.getString(5));
      ps1.setDivname(rs.getString(6));
      ps1.setGender(rs.getString(7));
      ps1.setDob(rs.getDate(8));
      ps1.setImage(rs.getString(9));
      ps1.setNationality(rs.getString(10));
      ps1.setPfname(rs.getString(11));
      ps1.setPmname(rs.getString(12));
      ps1.setPlname(rs.getString(13));
      ps1.setOccupation(rs.getString(14));
      ps1.setPhno(rs.getLong(15));
      ps1.setEmailid(rs.getString(16));
      ps1.setPdoorno(rs.getString(17));
      ps1.setPstreet(rs.getString(18));
      ps1.setPcity(rs.getString(19));
      ps1.setPdistrict(rs.getString(20));
      ps1.setPstate(rs.getString(21));
      ps1.setPcountry(rs.getString(22));
      ps1.setPpincode(rs.getInt(23));
     
   list.add(ps1);  
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
          
 return "success";  
}  
}   
