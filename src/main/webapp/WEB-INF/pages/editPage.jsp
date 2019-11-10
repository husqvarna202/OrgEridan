<%--
  Created by IntelliJ IDEA.
  User: pstm
  Date: 04.11.2019
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty client.fullname}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty client.fullname}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty client.fullname}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty client.fullname}">

    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty client.fullname}">
        <input type="hidden" name="id" value="${client.id}">
    </c:if>
    <label for="fullname">Fullname</label>
    <input type="text" name="fullname" id="fullname">
    <label for="address">Address</label>
    <input type="text" name="address" id="address">
    <label for="phone">Phone</label>
    <input type="text" name="phone" id="phone">

    <c:if test="${empty client.fullname}">

        <input type="submit" value="Add new film">
    </c:if>
    <c:if test="${!empty client.fullname}">

        <input type="submit" value="Edit film">
    </c:if>
</form>
</body>
</html>
