package com.school.princstd;

public class HodprofileAction {
private String hname;
private String hqual;
private String hgen;
public HodprofileAction() {
	super();
}
public HodprofileAction(String hname, String hqual, String hgen) {
	super();
	this.hname = hname;
	this.hqual = hqual;
	this.hgen = hgen;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getHqual() {
	return hqual;
}
public void setHqual(String hqual) {
	this.hqual = hqual;
}
public String getHgen() {
	return hgen;
}
public void setHgen(String hgen) {
	this.hgen = hgen;
}
@Override
public String toString() {
	return "Hodprofile [hname=" + hname + ", hqual=" + hqual + ", hgen=" + hgen
			+ "]";
}
public String execute()
{
	boolean flag=false;
	
	Hodprofile lg = new Hodprofile(hname,hqual,hgen);
	HodprofileDao dao=null;
     try 
     {
    	dao =new HodprofileDao();
		flag=dao.Hodprofile(lg);
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
