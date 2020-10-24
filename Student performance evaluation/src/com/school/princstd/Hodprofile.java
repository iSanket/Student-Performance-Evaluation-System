package com.school.princstd;

public class Hodprofile {
private String hname;
private String hqual;
private String hgen;
public Hodprofile() {
	super();
}
public Hodprofile(String hname, String hqual, String hgen) {
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
}
