<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Page admin</title>
</head>
<body>
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<center>
		<h3>Page administration</h3>
		<h2>Bonjour  ${username}, tu es logué en tant qu'admin!</h2>
		<p>De grands pouvoirs impliquent de grandes responsabilités </p>
		<h3><a href="${logoutUrl}">déconnexion</a></h3>
	</center>
</body>
</html>