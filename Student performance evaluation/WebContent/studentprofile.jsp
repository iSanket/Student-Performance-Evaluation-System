<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Profile</title>
</head>
<body>


<form action="view">
<s:textfield name="roleid" label="STUDENT ID"></s:textfield>
<button class="button">show details</button>
</form>
	<hr/>
<s:iterator value="list">
<fieldset>
<fieldset>
<legend>STUDENT DETAILS
</legend>
		ROLL NUMBER:<s:property value="roleid"/></br>
		FIRST NAME:<s:property value="fname"/></br>
		MIDDLE NAME:<s:property value="mname"/></br>
		LAST NAME:<s:property value="lname"/></br>
		STANDARD:<s:property value="stdname"/></br>
		DIVISION:<s:property value="divname"/></br>
		DATE OF BIRTH:<s:property value="dob"/></br>
		GENDER:<s:property value="gender"/></br>
		IMAGE:<s:property value="image"/></br>
		NATIONALITY:<s:property value="nationality"/></br>
 </fieldset>
<fieldset>
<legend>PARENT DETAILS
</legend>		
		FIRST NAME:<s:property value="pfname"/></br>
		MIDDLE NAME:<s:property value="pmname"/></br>
		LAST NAME:<s:property value="plname"/></br>
		OCCUPATION:<s:property value="occupation"/></br>
</fieldset>
<fieldset>
<legend>CONTACT DETAILS
</legend>
		PHONE NO:<s:property value="phno"/></br>
		EMAIL ID:<s:property value="emailid"/></br>
</fieldset>		
<fieldset>
<legend>ADDRESS DETAILS
</legend>
		DOOR NO	:<s:property value="pdoorno"/></br>
		STREET	:<s:property value="pstreet"/></br>
		CITY	:<s:property value="pcity"/></br>
		DISTRICT:<s:property value="pdistrict"/></br>
		STATE:<s:property value="pstate"/></br>
		COUNTRY:<s:property value="pcountry"/></br>
		PINCODE:<s:property value="ppincode"/></br>
</fieldset>		
</fieldset>
</s:iterator>
</body>
</html>