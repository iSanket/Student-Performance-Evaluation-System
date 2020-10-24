package com.school.student;

import java.sql.*;  
import java.util.ArrayList;  

import com.school.princstd.Prinprofile;


public class ViewPrinProfile 
{  
	
ArrayList<Prinprofile> list=new ArrayList<Prinprofile>();  
  

public ArrayList<Prinprofile> getList() {  
    return list;  
}  
public void setList(ArrayList<Prinprofile> list) {  
    this.list = list;  
}  
public String execute(){  
	try{  
  Class.forName("oracle.jdbc.driver.OracleDriver");  
  Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","system","ram");  
              
  PreparedStatement ps=con.prepareStatement("select * from PRINCIPALPROFILE");  
  ResultSet rs=ps.executeQuery();  
  
  while(rs.next()){  
	  Prinprofile ps1 =new Prinprofile();
	  ps1.setPrinname(rs.getString(1));
      ps1.setPqual(rs.getString(2));
      ps1.setPgen(rs.getString(3));
      
      
     
   list.add(ps1);  
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
	 System.out.println("ok data fetched");          
 return "success";

}  
}   
