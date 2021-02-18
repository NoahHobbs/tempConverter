<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fahrenheit Results</title>
</head>
<body>
	<p>${userTemps.getTemperature()} Starting Temperature <br /> 
	${userTemps.toFarenheit(userTemps.getTemperature())} Fahrenheit <br />
	</p>
	<p><a href="fahrenClicked.jsp">Convert another Fahrenheit temperature</a></p>
	
	<p><a href="index.jsp">Enter another Temperature</a></p>
</body>
</html>