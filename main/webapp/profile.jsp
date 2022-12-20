<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="model.LoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Profile</h1>
<%

LoginBean loginBean = (LoginBean) request.getAttribute("LoginBean");
out.print("<h2> Welcome "+ loginBean.getAccount()+"</h2>");
%>
<form action="<%=request.getContextPath() %>/LoginServlet" method="post">
<input type="submit" value="Logout">
</form>
</body>
</html>