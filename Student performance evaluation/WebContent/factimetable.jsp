<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Time Table</title>
</head>
<body>
<h2>EXAMINATION TIMETABLE</h2>
<s:iterator value="list">
<s:textfield  value="TEST TYPE"/>:<s:textfield name="ttype"/><br/><BR/>
	<s:textfield  value="SUBJECT"/>:<s:textfield value="DATE"/><br/><hr/>
	<s:textfield  value="TELUGU"/>:<s:textfield name="telugu"/><br/>
	<s:textfield  value="HINDI"/>:<s:textfield name="hindi"/><br/>
	<s:textfield value="ENGLISH"/>:<s:textfield name="english"/><br/>
	<s:textfield value="MATHS"/>:<s:textfield name="maths"/><br/>
	<s:textfield  value="SCIENCE"/>:<s:textfield name="science"/><br/>
	<s:textfield value="SOCIAL"/>:<s:textfield name="social"/><br/>
</s:iterator>
</body>

</html>