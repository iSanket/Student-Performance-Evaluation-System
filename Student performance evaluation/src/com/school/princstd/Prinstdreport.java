package com.school.princstd;

public class Prinstdreport {
	private String ttype;
	private int stdid;
	private String stdname;
	private double sub1;
	private double sub2;
	private double sub3;
	private double sub4;
	private double sub5;
	private double sub6;
	private double tmarks;
	private Float percent;
	private String rank;
	public Prinstdreport() {
		super();
	}
	public Prinstdreport(String ttype, int stdid, String stdname, double sub1,
			double sub2, double sub3, double sub4, double sub5, double sub6,
			double tmarks, Float percent, String rank) {
		super();
		this.ttype = ttype;
		this.stdid = stdid;
		this.stdname = stdname;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.tmarks = tmarks;
		this.percent = percent;
		this.rank = rank;
	}
	public String getTtype() {
		return ttype;
	}
	public void setTtype(String ttype) {
		this.ttype = ttype;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public double getSub1() {
		return sub1;
	}
	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}
	public double getSub2() {
		return sub2;
	}
	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}
	public double getSub3() {
		return sub3;
	}
	public void setSub3(double sub3) {
		this.sub3 = sub3;
	}
	public double getSub4() {
		return sub4;
	}
	public void setSub4(double sub4) {
		this.sub4 = sub4;
	}
	public double getSub5() {
		return sub5;
	}
	public void setSub5(double sub5) {
		this.sub5 = sub5;
	}
	public double getSub6() {
		return sub6;
	}
	public void setSub6(double sub6) {
		this.sub6 = sub6;
	}
	public double getTmarks() {
		return tmarks;
	}
	public void setTmarks(double tmarks) {
		this.tmarks = tmarks;
	}
	public Float getPercent() {
		return percent;
	}
	public void setPercent(Float percent) {
		this.percent = percent;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}	
}
