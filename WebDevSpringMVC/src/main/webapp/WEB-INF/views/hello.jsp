<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>Being Java Guys | Hello World</title>
</head>
<body>
	<h2>Being Java Guys | Hello World</h2>
	<h4>${message}</h4>
	<h4>
		<%=request.getAttribute("message2")%>
	</h4>
</body>
</html>
