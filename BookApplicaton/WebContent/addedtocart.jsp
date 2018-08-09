<%@ page import="com.book.pojo.Book" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><% Book book=(Book)request.getAttribute("Book"); %>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h2>Added succesfully</h2>
<a href="cart.app">view</a>
</a>

</form>
</body>
</html>