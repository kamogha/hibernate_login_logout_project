<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DesignForHibernate</title>
<link rel="stylesheet" href="css/login.css">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>
<body>
 <form class="Login-form" action="Login" method="post">
 <span>( Username : Admin | Password : admin123 )</span>
        <input type="text" placeholder="Enter Username" name="name" required>
        <input type="password" placeholder="Enter Password" name="password" required>
        <button type="submit" class="signupbtn">Login</button>
    </form>
</body>
</html>