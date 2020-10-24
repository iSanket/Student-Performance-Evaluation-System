package com.school.princstd;

import java.util.Date;


public class PrinfacdetailsAction
{
		private long roleid;
		private String fname;
		private String mname;
		private String lname;
		
		private Date dob=  new Date();
		private String gender;
		private String nationality;
		
		private String spname;
		private String ipname;
		private String gpname;
		private String pgname;
		
		
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
		public PrinfacdetailsAction() {
			super();
		}
		public PrinfacdetailsAction(long roleid, String fname, String mname,
				String lname, Date dob, String gender, String nationality,
				String spname, String ipname, String gpname, String pgname,
				String pdoorno, String pstreet, String pcity, String pdistrict,
				String pstate, String pcountry, int ppincode, long phno,
				String emailid, String image) {
			super();
			this.roleid = roleid;
			this.fname = fname;
			this.mname = mname;
			this.lname = lname;
			this.dob = dob;
			this.gender = gender;
			this.nationality = nationality;
			this.spname = spname;
			this.ipname = ipname;
			this.gpname = gpname;
			this.pgname = pgname;
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
		public String getSpname() {
			return spname;
		}
		public void setSpname(String spname) {
			this.spname = spname;
		}
		public String getIpname() {
			return ipname;
		}
		public void setIpname(String ipname) {
			this.ipname = ipname;
		}
		public String getGpname() {
			return gpname;
		}
		public void setGpname(String gpname) {
			this.gpname = gpname;
		}
		public String getPgname() {
			return pgname;
		}
		public void setPgname(String pgname) {
			this.pgname = pgname;
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
		public String execute()
		{
			boolean flag=false;
			
			Prinfacdetails lg = new Prinfacdetails(roleid, fname, mname, lname,  dob, gender, nationality, spname, ipname, gpname,pgname, pdoorno, pstreet, pcity, pdistrict, pstate, pcountry, ppincode, phno, emailid, image);
			PrinfacdetailsDao dao=null;
		     try 
		     {
		    	dao =new PrinfacdetailsDao();
				flag=dao.Prinfacdetails(lg);
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
