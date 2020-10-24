<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Remark</title>
</head>
<body>
<h2>STUDENT REMARKS</h2>
<form action="studentremark">
<s:textfield name="ttype" label="STUDENT ID"></s:textfield>
<button class="button">show details</button>
</form>
	<hr/>
<s:iterator value="list">
	STUDENT ID:<s:textfield name="ttype" disabled="true"/><br/><br/>
	REMARKS:<br/>&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
	<s:textarea cols="40" rows="10" name="stdnotif" disabled="true"/><br/>
 </s:iterator>
</body>
</html>