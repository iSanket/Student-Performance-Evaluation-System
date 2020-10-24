<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report</title>
</head>
<body>
<h2>REPORT CARD</h2>

<form action="studentreport" method="post">
<s:textfield name="stdid" label="STUDENT ID"></s:textfield>
<button class="button">show details</button>
</form>
	<hr/>
<s:iterator value="list">
<fieldset>

<legend>STUDENT DETAILS
</legend>
<s:textfield readonly="readonly"  value="TEST TYPE" disabled="true"/>:<s:textfield name="ttype" disabled="true"/><br/>
<s:textfield  value="STUDENTID" disabled="true"/>:<s:textfield name="stdid" disabled="true"/><br/>
<s:textfield  value="STUDENTNAME" disabled="true"/>:<s:textfield name="stdname" disabled="true"/><br/>
<s:textfield  value="TELUGU" disabled="true"/>:<s:textfield name="sub1" disabled="true"/><br/>
<s:textfield  value="HINDI" disabled="true"/>:<s:textfield name="sub2" disabled="true"/><br/>
<s:textfield  value="ENGLISH" disabled="true"/>:<s:textfield name="sub3" disabled="true"/><br/>
<s:textfield  value="MATHS" disabled="true"/>:<s:textfield name="sub4" disabled="true"/><br/>
<s:textfield  value="SCIENCE" disabled="true"/>:<s:textfield name="sub5" disabled="true"/><br/>
<s:textfield  value="SOCIAL" disabled="true"/>:<s:textfield name="sub6" disabled="true"/><br/>
<s:textfield  value="TOTAL MARKS" disabled="true"/>:<s:textfield name="tmarks" disabled="true"/><br/>
<s:textfield  value="PERCENTAGE" disabled="true"/>:<s:textfield name="percent" disabled="true"/><br/>
<s:textfield  value="RANK" disabled="true"/>:<s:textfield name="rank" disabled="true"/><br/>
		
 
 </fieldset>
 </s:iterator>

</body>
</html>