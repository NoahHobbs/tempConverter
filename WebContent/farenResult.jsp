<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Farenheit Results</title>
</head>
<body>
	<p>${userTemps.getTemperature()} Starting Temperature <br />}
	${userTemps.getFarenheit()} Farenheit <br />}
	</p>
	<a href="index.jsp">Enter another Temperature</a>
</body>
</html>