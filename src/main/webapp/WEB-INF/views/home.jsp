<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
    <h1>${ picture.title }</h1>
    <p>Date: ${ picture.date } </p>
    <p>Details: ${ picture.explanation } </p>
    <img src="${ picture.url }"/>
    <div>
    </div>
</body>
</html>