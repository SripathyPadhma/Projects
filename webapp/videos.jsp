<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
<% 
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

	if(session.getAttribute("username")==null)
		response.sendRedirect("login.jsp");
	%>
Video to watch java tutorial<br>
<iframe width="560" height="315" src="https://www.youtube.com/embed/BGTx91t8q50" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
</body>
</html>