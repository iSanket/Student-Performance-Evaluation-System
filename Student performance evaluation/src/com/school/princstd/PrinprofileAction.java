package com.school.princstd;

public class PrinprofileAction 
{
private String prinname;
private String pqual;
private String pgen;
public PrinprofileAction() {
	super();
}
public PrinprofileAction(String prinname, String pqual, String pgen) {
	super();
	this.prinname = prinname;
	this.pqual = pqual;
	this.pgen = pgen;
}
public String getPrinname() {
	return prinname;
}
public void setPrinname(String prinname) {
	this.prinname = prinname;
}
public String getPqual() {
	return pqual;
}
public void setPqual(String pqual) {
	this.pqual = pqual;
}
public String getPgen() {
	return pgen;
}
public void setPgen(String pgen) {
	this.pgen = pgen;
}
@Override
public String toString() {
	return "PrinprofileDao [prinname=" + prinname + ", pqual=" + pqual
			+ ", pgen=" + pgen + "]";
}
public String execute()
{
	boolean flag=false;
	
	Prinprofile lg = new Prinprofile(prinname,pqual,pgen);
	PrinprofileDao dao=null;
     try 
     {
    	dao =new PrinprofileDao();
		flag=dao.Prinprofile(lg);
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
