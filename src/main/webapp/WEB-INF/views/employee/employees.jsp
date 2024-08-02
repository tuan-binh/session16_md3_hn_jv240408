<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 8/2/2024
  Time: 9:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/add">Thêm mới</a>
<table border="10" cellpadding="10" cellspacing="10">
    <thead>
    <tr>
        <th>STT</th>
        <th>NAME</th>
        <th>ADDRESS</th>
        <th>PHONE</th>
        <th>STATUS</th>
        <th colspan="2">ACTION</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employees}" var="e" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${e.name}</td>
            <td>${e.address}</td>
            <td>${e.phone}</td>
            <td>${e.status ? "Hoạt động": "Không hoạt động"}</td>
            <td>
                <a href="<%=request.getContextPath()%>/edit/${e.id}">Edit</a>
            </td>
            <td>
                <a href="<%=request.getContextPath()%>/delete/${e.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
