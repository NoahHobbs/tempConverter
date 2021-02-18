<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Celsius Clicked</title>
</head>
<body>
	<form action="getCelsServlet" method="post">
		Enter the Fahrenheit temperature you want converted:
		<input type="text" name="userTemp" size="10">
		<input type="submit" name="toCels" value="Change to Celsius" />
	</form>
</body>
</html>