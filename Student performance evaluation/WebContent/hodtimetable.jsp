<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Examination TimeTable</title>
</head>
<body>
<h2>EXAMINATION TIMETABLE</h2>

<s:iterator value="list">
<s:textfield  value="TEST TYPE" disabled="true"/>:<s:textfield name="ttype" disabled="true"/><br/><BR/>
	<s:textfield  value="SUBJECT" disabled="true"/>:<s:textfield value="DATE" disabled="true"/><br/><hr/>
	<s:textfield  value="TELUGU" disabled="true"/>:<s:textfield name="telugu" disabled="true"/><br/>
	<s:textfield  value="HINDI" disabled="true"/>:<s:textfield name="hindi" disabled="true"/><br/>
	<s:textfield value="ENGLISH" disabled="true"/>:<s:textfield name="english" disabled="true"/><br/>
	<s:textfield value="MATHS" disabled="true"/>:<s:textfield name="maths" disabled="true"/><br/>
	<s:textfield  value="SCIENCE" disabled="true"/>:<s:textfield name="science" disabled="true"/><br/>
	<s:textfield value="SOCIAL" disabled="true"/>:<s:textfield name="social" disabled="true"/><br/>
</s:iterator>
</body>
</html>