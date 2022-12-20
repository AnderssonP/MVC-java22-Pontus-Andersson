<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Login</h1>

<form action="<%=request.getContextPath() %>/LoginController" method="post" name="form" class="account">
<input type="text" placeholder="username" name="user">
<input type="password" placeholder="password" name="password">
<input type="submit" value="login">

</form>
</body>
</html>