package com.school.princstd;

import java.util.Date;

public class PrintimetableAction{
	private String ttype;
	private Date telugu =  new Date();
	private Date hindi =  new Date();
	private Date english =  new Date();
	private Date maths =  new Date();
	private Date science =  new Date();
	private Date social =  new Date();
	public PrintimetableAction() {
		super();
	}
	public PrintimetableAction(String ttype, Date telugu, Date hindi, Date english,
			Date maths, Date science, Date social) {
		super();
		this.ttype = ttype;
		this.telugu = telugu;
		this.hindi = hindi;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
	}
	public String getTtype() {
		return ttype;
	}
	public void setTtype(String ttype) {
		this.ttype = ttype;
	}
	public Date getTelugu() {
		return telugu;
	}
	public void setTelugu(Date telugu) {
		this.telugu = telugu;
	}
	public Date getHindi() {
		return hindi;
	}
	public void setHindi(Date hindi) {
		this.hindi = hindi;
	}
	public Date getEnglish() {
		return english;
	}
	public void setEnglish(Date english) {
		this.english = english;
	}
	public Date getMaths() {
		return maths;
	}
	public void setMaths(Date maths) {
		this.maths = maths;
	}
	public Date getScience() {
		return science;
	}
	public void setScience(Date science) {
		this.science = science;
	}
	public Date getSocial() {
		return social;
	}
	public void setSocial(Date social) {
		this.social = social;
	}
	@Override
	public String toString() {
		return "Printimetable [ttype=" + ttype + ", telugu=" + telugu
				+ ", hindi=" + hindi + ", english=" + english + ", maths="
				+ maths + ", science=" + science + ", social=" + social + "]";
	}
	public String execute()
	{
		boolean flag=false;
		
		Printimetable lg = new Printimetable(ttype,telugu,hindi,english,maths,science,social);
		PrintimetableDao dao=null;
	     try 
	     {
	    	dao =new PrintimetableDao();
			flag=dao.Printimetable(lg);
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
