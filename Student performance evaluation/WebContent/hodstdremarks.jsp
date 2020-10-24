<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOD REMARKS PAGE</title>
</head>
<body>
<h2>REMARKS FOR STUDENT</h2>


<form action="hodstdremarks" method="post">
		<fieldset>
		<p>
		<label>STUDENT ID:
		</label>
		<s:textfield name="ttype"></s:textfield>
		</p>
		REMARKS:<br/>&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<s:textarea cols="40" rows="10" name="stdnotif"/><br/>
		</fieldset>
		<div><button class="button">ADD REMARKS</button></div>
</form>
</body>
</html>