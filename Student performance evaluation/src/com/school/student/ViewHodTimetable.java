package com.school.student;

import java.sql.*;  
import java.util.ArrayList;  

import com.school.princstd.Printimetable;


public class ViewHodTimetable 
{  
	
ArrayList<Printimetable> line=new ArrayList<Printimetable>();  
  

public ArrayList<Printimetable> getLine() {  
    return line;  
}  
public void setLine(ArrayList<Printimetable> line) {  
    this.line = line;  
}  
public String execute(){  
	try{  
  Class.forName("oracle.jdbc.driver.OracleDriver");  
  Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","system","ram");  
              
  PreparedStatement ps=con.prepareStatement("select * from timetable");  
  ResultSet rs=ps.executeQuery();  
  
  while(rs.next()){  
	  Printimetable ps1 =new Printimetable();
	  ps1.setTtype(rs.getString(1));
      ps1.setTelugu(rs.getDate(2));
      ps1.setHindi(rs.getDate(3));
      ps1.setEnglish(rs.getDate(4));
      ps1.setMaths(rs.getDate(5));
      ps1.setScience(rs.getDate(6));
      ps1.setSocial(rs.getDate(7));
      
     
   line.add(ps1);  
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
	 System.out.println("ok data fetched");          
 return "success";

}  
}   
