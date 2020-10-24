package com.school.princstd;

public class HodstdremarksAction 
{
private String ttype;
private String stdnotif;
public HodstdremarksAction() {
	super();
}
public HodstdremarksAction(String ttype, String stdnotif) {
	super();
	this.ttype = ttype;
	this.stdnotif = stdnotif;
}
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
@Override
public String toString() {
	return "Hodstdremarks [ttype=" + ttype + ", stdnotif=" + stdnotif + "]";
}
public String execute()
{
	boolean flag=false;
	
	Hodstdremarks lg = new Hodstdremarks(ttype,stdnotif);
	HodstdremarksDao dao=null;
     try 
     {
    	dao =new HodstdremarksDao();
		flag=dao.Hodstdremarks(lg);
		if(flag == true)
			return "success";
   	} catch (Exception e) {
		e.printStackTrace();
	}finally
	{
		dao.close();
	}
     return "failed";
}

}
