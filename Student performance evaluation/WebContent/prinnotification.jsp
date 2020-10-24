<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Notification</title>
</head>
<body>
<h2>PRINCIPAL NOTIFICATION</h2>
<form action="prinstdnotif" method="post">
				            <fieldset>

		<p>
				                
		<label>Enter Notification
		</label>
		<s:textfield name="stdnotif"></s:textfield>
		</p>
		 <d:head/>
		<p>
		<label>Date Notification
		</label>
		<d:datetimepicker name="dnotif" displayFormat="dd-MMM-yyyy" />
		</p>
		
		 </fieldset>
		 										
		<div><button class="button">ADD NOTIFICATION</button></div>
		<div><button class="button">CLEAR</button></div>
</form>
</body>
</html>