<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculty Profile</title>
</head>
<body>
<h2>FACULTY PROFILE</h2>

<form action="facultyhome">
				            <fieldset>
							 <legend>PRINCIPAL DETAILS
				                </legend>
				                <p>
				                    <label>NAME
				                    </label>
				                    <s:textfield name="name" ></s:textfield>
				                </p>
								<p>
				                    <label>QUALIFICATION
				                    </label>
				                    <s:textfield name="hindi" ></s:textfield>
				                </p>
				                <p>
				                    <label>GENDER</label>
				                    <s:radio name="gender"  list="{'male','female'}" />
				                </p>
								
				            </fieldset>										
				            <div><button class="button">ENTER DETAILS</button></div>
			        
</form>
</body>
</html>