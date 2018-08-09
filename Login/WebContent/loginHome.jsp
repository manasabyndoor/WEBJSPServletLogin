<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<!-- header -->
<div>
<jsp:include page="header.jsp"/>
</div>
<!-- creating form -->
<form method="post" action="Login">
User name<input type="text" name="username"><br>
Password<input type="password" name="password">
<input type="submit" value="submit">
</form>
<div>
<jsp:include page="footer.jsp"/>
</div>
</body>
</html>