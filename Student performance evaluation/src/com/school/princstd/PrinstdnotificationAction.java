package com.school.princstd;

import java.util.Date;

public class PrinstdnotificationAction
{
private String stdnotif;
private Date dnotif= new Date();
public PrinstdnotificationAction() {
	super();
}
public PrinstdnotificationAction(String stdnotif, Date dnotif) {
	super();
	this.stdnotif = stdnotif;
	this.dnotif = dnotif;
}
public String getStdnotif() {
	return stdnotif;
}
public void setStdnotif(String stdnotif) {
	this.stdnotif = stdnotif;
}
public Date getDnotif() {
	return dnotif;
}
public void setDnotif(Date dnotif) {
	this.dnotif = dnotif;
}
@Override
public String toString() {
	return "Prinstdnotification [stdnotif=" + stdnotif + ", dnotif=" + dnotif
			+ "]";
}
public String execute()
{
	boolean flag=false;
	
	Prinstdnotification lg = new Prinstdnotification(stdnotif,dnotif);
	PrinstdnotificationDao dao=null;
     try 
     {
    	dao =new PrinstdnotificationDao();
		flag=dao.Prinstdnotification(lg);
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
