package com.school.princstd;


import java.util.Date;


public class PrincstdAction {
	private long roleid;
	private String fname;
	private String mname;
	private String lname;
	private String stdname;
	private String divname;
	
	private Date dob=  new Date();
	private String gender;
	private String nationality;
	
	private String pfname;
	private String pmname;
	private String plname;
	private String occupation;
	
	private String pdoorno;
	private String pstreet;
	private String pcity;
	private String pdistrict;
	private String pstate;
	private String pcountry;
	private int ppincode;
	
	private long phno;
	private String emailid;
	private String image;
	

	public PrincstdAction() {
		super();
	}


	public PrincstdAction(long roleid, String fname, String mname,
			String lname, String stdname, String divname, Date dob,
			String gender, String nationality, String pfname, String pmname,
			String plname, String occupation, String pdoorno, String pstreet,
			String pcity, String pdistrict, String pstate, String pcountry,
			int ppincode, long phno, String emailid, String image) {
		super();
		this.roleid = roleid;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.stdname = stdname;
		this.divname = divname;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.pfname = pfname;
		this.pmname = pmname;
		this.plname = plname;
		this.occupation = occupation;
		this.pdoorno = pdoorno;
		this.pstreet = pstreet;
		this.pcity = pcity;
		this.pdistrict = pdistrict;
		this.pstate = pstate;
		this.pcountry = pcountry;
		this.ppincode = ppincode;
		this.phno = phno;
		this.emailid = emailid;
		this.image = image;
	}


	public long getRoleid() {
		return roleid;
	}


	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getStdname() {
		return stdname;
	}


	public void setStdname(String stdname) {
		this.stdname = stdname;
	}


	public String getDivname() {
		return divname;
	}


	public void setDivname(String divname) {
		this.divname = divname;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getPfname() {
		return pfname;
	}


	public void setPfname(String pfname) {
		this.pfname = pfname;
	}


	public String getPmname() {
		return pmname;
	}


	public void setPmname(String pmname) {
		this.pmname = pmname;
	}


	public String getPlname() {
		return plname;
	}


	public void setPlname(String plname) {
		this.plname = plname;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getPdoorno() {
		return pdoorno;
	}


	public void setPdoorno(String pdoorno) {
		this.pdoorno = pdoorno;
	}


	public String getPstreet() {
		return pstreet;
	}


	public void setPstreet(String pstreet) {
		this.pstreet = pstreet;
	}


	public String getPcity() {
		return pcity;
	}


	public void setPcity(String pcity) {
		this.pcity = pcity;
	}


	public String getPdistrict() {
		return pdistrict;
	}


	public void setPdistrict(String pdistrict) {
		this.pdistrict = pdistrict;
	}


	public String getPstate() {
		return pstate;
	}


	public void setPstate(String pstate) {
		this.pstate = pstate;
	}


	public String getPcountry() {
		return pcountry;
	}


	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}


	public int getPpincode() {
		return ppincode;
	}


	public void setPpincode(int ppincode) {
		this.ppincode = ppincode;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "PrincstdAction [roleid=" + roleid + ", fname=" + fname
				+ ", mname=" + mname + ", lname=" + lname + ", stdname="
				+ stdname + ", divname=" + divname + ", dob=" + dob
				+ ", gender=" + gender + ", nationality=" + nationality
				+ ", pfname=" + pfname + ", pmname=" + pmname + ", plname="
				+ plname + ", occupation=" + occupation + ", pdoorno="
				+ pdoorno + ", pstreet=" + pstreet + ", pcity=" + pcity
				+ ", pdistrict=" + pdistrict + ", pstate=" + pstate
				+ ", pcountry=" + pcountry + ", ppincode=" + ppincode
				+ ", phno=" + phno + ", emailid=" + emailid + ", image="
				+ image + "]";
	}
	public String execute()
	{
		boolean flag=false;
		
		Princstd lg = new Princstd(roleid, fname, mname, lname,stdname,divname,  dob, gender, nationality, pfname, pmname, plname, occupation, pdoorno, pstreet, pcity, pdistrict, pstate, pcountry, ppincode, phno, emailid, image);
		PrincstdDao dao=null;
	     try 
	     {
	    	dao =new PrincstdDao();
			flag=dao.Princstd(lg);
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

