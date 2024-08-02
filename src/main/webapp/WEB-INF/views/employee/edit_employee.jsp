<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 8/2/2024
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/edit" method="post">
    <input type="text" name="id" placeholder="id" value="${employee.id}" readonly> <br>
    <input type="text" name="name" placeholder="name" value="${employee.name}"> <br>
    <input type="text" name="address" placeholder="address" value="${employee.address}"> <br>
    <input type="text" name="phone" placeholder="phone" value="${employee.phone}"> <br>
    <input type="radio" name="status" value="true" ${employee.status ? "checked":''}> Hoạt động<br>
    <input type="radio" name="status" value="false" ${!employee.status?'checked':''}> Không hoạt động<br>
    <button type="submit">UPDATE</button>
</form>
</body>
</html>
