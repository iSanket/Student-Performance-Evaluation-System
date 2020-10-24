<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>EMAIL FORM</title>
</head>
<body>
  <h2>REPORT TO PARENT</h2>
   <form action="emailer" method="post">
  
   <label for="to">To</label><br/><br/>
   <input type="text" name="to"/><br/>
   
   <label for="subject">Subject</label><br/><br/>
   <input type="text" name="subject"/><br/><br/>
<!--    <label for="body">Body</label><br/> -->
   Body<br/><textarea name="body" cols="50" rows="5" id="body" style="
    margin-left: 5px;
    margin-right: 5px;
"></textarea><br/>
<!--    <input type="text" name="body"/><br/>  -->
    <label for="from">From</label><br/>
   <input type="text" name="from"/><br/>
   <label for="password">Password</label><br/>
   <input type="password" name="password"/><br/>
   <input type="submit" value="Send Email"/>
   </form>
</body>
</html>