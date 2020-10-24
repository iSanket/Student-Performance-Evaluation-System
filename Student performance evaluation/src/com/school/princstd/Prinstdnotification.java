package com.school.princstd;

import java.util.Date;

public class Prinstdnotification
{
private String stdnotif;
private Date dnotif= new Date();
public Prinstdnotification() {
	super();
}
public Prinstdnotification(String stdnotif, Date dnotif) {
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

}
