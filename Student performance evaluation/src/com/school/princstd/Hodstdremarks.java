package com.school.princstd;

public class Hodstdremarks 
{
private String ttype;
private String stdnotif;
public Hodstdremarks() {
	super();
}
public Hodstdremarks(String ttype, String stdnotif) {
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
}
