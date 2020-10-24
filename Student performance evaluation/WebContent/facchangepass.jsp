<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<h1>CHANGEPASSWORD</h1>
                    <%@ taglib uri="/struts-tags" prefix="s" %>  
  
	
							<s:form action="login" method="post">
								<s:password  name="password" label="Old Password"></s:password>
								<s:password  name="password" label="New Password"></s:password>
								<s:password  name="password" label="Re-Enter Password"></s:password>
							<s:submit value="SUBMIT"></s:submit>
							<br>	
					</s:form>
</body>
</html>