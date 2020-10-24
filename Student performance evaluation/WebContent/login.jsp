<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
        <style>
            h1, h2 {
                text-align: center;
            }
            div.notecontainer {
                float: right;
                width: 25%;
                border: 1px red solid;
                margin: 20px;
                padding: 20px;
            }
            div.notecontainerimg {
                float: left;
                width: 50%;
                border: 1px red solid;
                margin: 20px;
                padding: 20px;
            }
            
             div.content {
                float:left;
                width: 92%;
                border: 1px red solid;
                margin: 20px;
                padding: 20px;
            }
            
            
            div.notetitle {
                font-family: Arial;
            }
            
            div.notedetails {
                font-family: Arial;
            }
            
            .stitched {
                padding: 20px;
                margin: 10px;
                background: #ff0030;
                color: #fff;
                font-size: 31px;
                font-weight: bold;
                line-height: 1.3em;
                border: 2px dashed #fff;
                border-radius: 10px;
                box-shadow: 0 0 0 4px #ff0030, 2px 1px 6px 4px rgba(10, 10, 0, 0.5);
                text-shadow: -1px -1px #aa3030;
                font-weight: normal;
             }
             
             div.container {
                 width: 80%;
                 margin: auto;
             }
        </style>
</head>
<body>
	 <body>
        <h1 class="stitched"> Student Performance Evaluation </h1>
        <div class="container">
            
    
    
    
    
            <div class="notecontainer">
            
                <div class="notetitle">
                    <h2>Login Form</h2>
                </div>
                
                <div class="notedetails">
                     <%@ taglib uri="/struts-tags" prefix="s" %>  
  
	
							<s:form action="login" method="post">
								<s:textfield name="username" label="UserName"></s:textfield>
								<s:password  name="password" label="Password"></s:password>
							<s:submit value="Login"></s:submit>
							<br>	
					</s:form>
                </div>
            </div>
           <div class="notecontainerimg">
            <img src="./Images/school.jpg" height="168px" width="520px" ></img>
     		</div> 
            <div class="content">
            <p align="justify"> <font face="arial narrow"><b>
	Student Performance System project is aimed at developing a school administration system which can Stream line the administration of school. It solves the problems of school management and make easier to maintain students data and develops a strong interaction between the teachers and students. It finds very easier for the parents to get information regarding their pupils and to contact the respective teacher. It assists the school administration to perform various activities.
</b></font></p>
     </div>
    
            
            
        </div>
    </body>
</body>
</html>