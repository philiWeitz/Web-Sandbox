<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New</title>
    </head>
    <body>
    	<h1> Conf JSP </h1>
        <h4> ${name} </h4> 
        <h4> <%= request.getAttribute("message") %> </h4>
    </body>
</html>