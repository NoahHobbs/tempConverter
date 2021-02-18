<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Fahrenheit Clicked</title>
</head>
<body>
	<form action="getFarServlet" method="post">
		Enter the Celsius temperature you want converted:
		<input type="text" name="userTemp" size="10">
		<input type="submit" name="toFaren" value="Change to Farenheit" />
	</form>
</body>
</html>