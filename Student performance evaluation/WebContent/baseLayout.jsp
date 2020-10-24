<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"type="text/css"href="css/Style.css"></head>
            <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>
    <body>
     <div id="body">
      <div id="header"><tiles:insertAttribute name="header" /></div> 
      <div id="nav"><tiles:insertAttribute name="nav"/></div> 
      <div id="content-container">
              <div id="navigation"><tiles:insertAttribute name="menu" /></div> 
      		  <div id="section"><tiles:insertAttribute name="body" /></div>
      </div>
      <div id="footer"><tiles:insertAttribute name="footer" /></div>       
    </div>            
    </body>
</html>
