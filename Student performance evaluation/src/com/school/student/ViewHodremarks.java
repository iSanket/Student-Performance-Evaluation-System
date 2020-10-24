package com.school.student;

	import java.sql.*;  
	import java.util.ArrayList;  
	import com.school.princstd.Hodstdremarks;

	public class ViewHodremarks 
	{  
		
		private String ttype;
		private String stdnotif;
		public String getTtype() {
			return ttype;
		}
		public void setTtype(String ttype) {
			this.ttype = ttype;
		}
		public String getStdnotif() {
			return stdnotif;
		}
		public void setStdnotif(String stdnotif) {
			this.stdnotif = stdnotif;
		}
	ArrayList<Hodstdremarks> list=new ArrayList<Hodstdremarks>();  
	  

	public ArrayList<Hodstdremarks> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<Hodstdremarks> list) {  
	    this.list = list;  
	}  
	public String execute(){  
		try{  
	  Class.forName("oracle.jdbc.driver.OracleDriver");  
	  Connection con=DriverManager.getConnection(  
	    "jdbc:oracle:thin:@localhost:1521:xe","system","ram");  
	              
	  PreparedStatement ps=con.prepareStatement("select * from studentremarks where ttype="+this.getTtype());  
	  ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next()){  
		  Hodstdremarks ps1 =new Hodstdremarks();
		  ps1.setTtype(rs.getString(1));
		  ps1.setStdnotif(rs.getString(2));
		  list.add(ps1);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
	}   


