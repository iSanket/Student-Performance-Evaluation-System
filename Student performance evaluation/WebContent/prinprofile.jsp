<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Principal</title>
</head>
<body>
<h2>PRINCIAPL PROFILE</h2>
<form action="prinprofile1" method="post">
				            <fieldset>
							 <legend>PRINCIPAL DETAILS
				                </legend>
				                <p>
				                    <label>NAME
				                    </label>
				                    <s:textfield name="prinname" ></s:textfield>
				                </p>
								<p>
				                    <label>QUALIFICATION
				                    </label>
				                    <s:textfield name="pqual" ></s:textfield>
				                </p>
				                <p>
				                    <label>GENDER</label>
				                    <s:radio name="pgen"  list="{'male','female'}" />
				                </p>
								
				            </fieldset>										
				            <div><button class="button">ENTER DETAILS</button></div>
			        
</form>
</body>
</html>