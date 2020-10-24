<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Principal Student Report</title>
</head>
<body>
<h2>STUDENT REPORT</h2>

<form action="princstdreport" method="post">
				            <fieldset>
							 <legend>STUDENT MARKS
							 
				                </legend>
				               <select name="ttype" label="SELECT TEST TYPE"> 
								    <option value="-1">Select Test type</option> 
								    <option value="UNIT-1">UNIT TEST-1</option> 
								    <option value="UNIT-2">UNIT TEST-2</option> 
								    <option value="UNIT-3">UNIT TEST-3</option> 
								    <option value="UNIT-4">UNIT TEST-4</option> 
								    <option value="QUATERLY">QUATERLY</option>
								    <option value="HALF-YEARLY">HALF-YEARLY</option>
								    <option value="FINAL">FINAL</option> 
								</select> 
<p>
				                    <label>STUDENT ID
				                    </label>
				                    <s:textfield name="stdid" ></s:textfield>
				                </p>
				                <p>
				                    <label>STUDENT NAME
				                    </label>
				                    <s:textfield name="stdname" ></s:textfield>
				                </p>
				                <p>
				                    <label>TELUGU
				                    </label>
				                    <s:textfield name="sub1" ></s:textfield>
				                </p>
								<p>
				                    <label>HINDI
				                    </label>
				                    <s:textfield name="sub2" ></s:textfield>
				                </p>
								<p>
				                    <label>ENGLISH
				                    </label>
				                    <s:textfield name="sub3" ></s:textfield>
				                </p>
								<p>
				                    <label>MATHS
				                    </label>
				                   <s:textfield name="sub4" ></s:textfield>
				                </p>
								<p>
				                    <label>SCIENCE
				                    </label>
				                    <s:textfield name="sub5"></s:textfield>
				                </p>
								<p>
				                    <label>SOCIAL
				                    </label>
				                    <s:textfield name="sub6"></s:textfield>
				                </p>
								<p>
				                    <label>TOTAL MARKS
				                    </label>
				                    <s:textfield name="tmarks"></s:textfield>
				                </p>
				                <p>
				                    <label>PERCENTAGE
				                    </label>
				                    <s:textfield name="percent"></s:textfield>
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