package com.school.student;

	import java.sql.*;  
	import java.util.ArrayList;  
	import com.school.princstd.Prinstdreport;

	public class ViewStudentReport 
	{  
		private int stdid;
		
		public int getStdid() {
			return stdid;
		}
		public void setStdid(int stdid) {
			this.stdid = stdid;
		}
	ArrayList<Prinstdreport> list=new ArrayList<Prinstdreport>();  
	  

	public ArrayList<Prinstdreport> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<Prinstdreport> list) {  
	    this.list = list;  
	}  
	public String execute(){  
		try{  
	  Class.forName("oracle.jdbc.driver.OracleDriver");  
	  Connection con=DriverManager.getConnection(  
	    "jdbc:oracle:thin:@localhost:1521:xe","system","ram");  
	              
	  PreparedStatement ps=con.prepareStatement("select * from STUDENTREPORT WHERE STDID="+this.getStdid());  
	  ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next()){  
		  Prinstdreport ps1 =new Prinstdreport();
		  ps1.setTtype(rs.getString(1));
		  ps1.setStdid(rs.getInt(2));
		  ps1.setStdname(rs.getString(3));
	      ps1.setSub1(rs.getDouble(4));
	      ps1.setSub2(rs.getDouble(5));
	      ps1.setSub3(rs.getDouble(6));
	      ps1.setSub4(rs.getDouble(7));
	      ps1.setSub5(rs.getDouble(8));
	      ps1.setSub6(rs.getDouble(9));
	      ps1.setTmarks(rs.getDouble(10));
	      ps1.setPercent(rs.getFloat(11));
	      ps1.setRank(rs.getString(12));
	      
	     
	   list.add(ps1);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
	}   


