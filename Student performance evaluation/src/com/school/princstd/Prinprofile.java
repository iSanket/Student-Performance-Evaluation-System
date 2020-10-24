package com.school.princstd;

public class Prinprofile 
{
private String prinname;
private String pqual;
private String pgen;
public Prinprofile() {
	super();
}
public Prinprofile(String prinname, String pqual, String pgen) {
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
}