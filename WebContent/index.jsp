<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temperature Converter</title>
</head>
<body>
	<h1>Welcome to a temperature converter</h1>
	<form action="getFarServlet" method="post">
		Enter the temperature you want converted:
		<input type="text" name="userTemp" size="10">
		<input type="submit" name="toFaren" value="Change to Farenheit" />
		<input type="submit" name="toCels" value="Change to Celsius" />
	</form>
</body>
</html>