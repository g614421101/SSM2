<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Harden
  Date: 2021/12/20
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>lastName</td>
        <td>phonenumber</td>
        <td>email</td>
    </tr>
    <c:forEach items="${allEmps}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.phonenumber}</td>
            <td>${emp.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
