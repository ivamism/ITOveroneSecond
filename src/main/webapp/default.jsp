<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="ITOveroneSecond.Level4.Lesson8.model.City"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Try JSP</title>
</head>
<body>
Hello from jsp
 <%
List<City> cities = (List<City>) request.getAttribute("cities");
out.println(cities);
%>

</body>
</html>