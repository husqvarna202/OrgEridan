<%--
  Created by IntelliJ IDEA.
  User: pstm
  Date: 04.11.2019
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Clients</title>
</head>
<body>

<h2>Clients</h2>
<table>
    <tr>
        <th>id</th>
        <th>fullname</th>
        <th>address</th>
        <th>phone</th>

    </tr>
    <c:forEach var="Client" items="${ClientList}">
        <tr>
            <td>${Client.id}</td>
            <td>${Client.fullname}</td>
            <td>${Client.address}</td>
            <td>${Client.phone}</td>

            <td>
                <a href="/edit/${Client.id}">edit</a>
                <a href="/delete/${Client.id}">delete</a>
            </td>
        </tr>
    </c:forEach>

</table>
<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new client</a>
</body>
</html>