package com.school.student;

import java.sql.*;  
import java.util.ArrayList;  

import com.school.princstd.Prinstdnotification;


public class ViewfacNotification 
{  
	
ArrayList<Prinstdnotification> list=new ArrayList<Prinstdnotification>();  
  

public ArrayList<Prinstdnotification> getList() {  
    return list;  
}  
public void setList(ArrayList<Prinstdnotification> list) {  
    this.list = list;  
}  
public String execute(){  
	try{  
  Class.forName("oracle.jdbc.driver.OracleDriver");  
  Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","system","ram");  
              
  PreparedStatement ps=con.prepareStatement("select * from notification");  
  ResultSet rs=ps.executeQuery();  
  
  while(rs.next()){  
	  Prinstdnotification ps1 =new Prinstdnotification();
	  ps1.setStdnotif(rs.getString(1));
      ps1.setDnotif(rs.getDate(2));
      
      
     
   list.add(ps1);  
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
	 System.out.println("ok data fetched");          
 return "success";

}  
}   
