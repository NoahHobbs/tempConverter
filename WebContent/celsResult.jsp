<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Celsius results</title>
</head>
<body>
	<p>${userTemps.getTemperature()} Starting Temperature <br /> 
	${userTemps.toCelsius(userTemps.getTemperature())} Celsius <br />
	</p>
	<p><a href="celsiusClicked.jsp">Convert another Celsius temperature</a></p>
	
	<p><a href="index.jsp">Enter another Temperature</a></p>
</body>
</html>