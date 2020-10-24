package com.school;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{
	private String username;
	private String password;
	private String role;
	
	public LoginAction() {
		this("", "","");
	}
	public LoginAction(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void validate() {  
	    if(username.length()<1)  
	        addFieldError("username","Name can't be blank");  
	    if(password.length()<1)  
	        addFieldError("password","Password can't be blank");  
	     
	}

	public String execute()
	{
		Login lg = new Login();
		LoginDao dao=null;
		 try 
	     {
			 HttpServletRequest req = ServletActionContext.getRequest();
				HttpSession session = req.getSession();
				session.setAttribute("user", username);
	    	dao =new LoginDao();
			lg=dao.validate(username, password);if(lg!= null)
			{
				if(lg.getRole().equals("PRINCIPAL"))
				   return "principal";
				else if(lg.getRole().equals("HOD"))
				    return "hod"; 
				else if(lg.getRole().equals("FACULTY"))
					   return "faculty";
				else if(lg.getRole().equals("STUDENT"))
					   return "student";
			}else 
			{
				return "failed";
			}
	   	} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			dao.close();
		}
		
	     return "failed";
	}

}