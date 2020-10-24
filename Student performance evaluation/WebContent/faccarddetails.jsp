<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CardDetails</title>
</head>
<body>
<h1>STUDENT MARKS DETAILS</h1>
<form action="princstud1" method="post">
				            <fieldset>
							 <legend>STUDENT MARKS
				                </legend>
				                <p>
				                    <label>TELUGU
				                    </label>
				                    <s:textfield name="telugu" ></s:textfield>
				                </p>
								<p>
				                    <label>HINDI
				                    </label>
				                    <s:textfield name="hindi" ></s:textfield>
				                </p>
								<p>
				                    <label>ENGLISH
				                    </label>
				                    <s:textfield name="english" ></s:textfield>
				                </p>
								<p>
				                    <label>MATHS
				                    </label>
				                   <s:textfield name="maths" ></s:textfield>
				                </p>
								<p>
				                    <label>SCIENCE
				                    </label>
				                    <s:textfield name="science"></s:textfield>
				                </p>
								<p>
				                    <label>SOCIAL
				                    </label>
				                    <s:textfield name="social"></s:textfield>
				                </p>
								<p>
				                    <label>TOTAL MARKS
				                    </label>
				                    <s:textfield name="totalmarks"></s:textfield>
				                </p>
				                <p>
				                    <label>PERCENTAGE
				                    </label>
				                    <s:textfield name="percentage"></s:textfield>
				                </p>
				                <p>
				                    <label>RANK
				                    </label>
				                    <s:textfield name="rank"></s:textfield>
				                </p>
				            </fieldset>										
				            <div><button class="button">ENTER DETAILS</button></div>
			        
</form>
</body>
</html>