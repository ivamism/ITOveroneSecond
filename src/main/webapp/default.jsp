<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="ITOveroneSecond.Level4.Lesson8.model.City"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Try JSP</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>
 <div class="container">
        <h3>Города</h3>
        <table class="table table-striped">
            <tr>
                <th>id</th>
                <th>name</th>
            </tr>
            <c:forEach var = "city" items = "${cities}">
                <tr>
                     <td>${city.id}</td>
                     <td>${city.name}</td>
                 </tr>
             </c:forEach>
         </table>
     </div>

</body>
</html>