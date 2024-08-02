<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 8/2/2024
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/add" method="post">
    <input type="text" name="id" placeholder="id"> <br>
    <input type="text" name="name" placeholder="name"> <br>
    <input type="text" name="address" placeholder="address"> <br>
    <input type="text" name="phone" placeholder="phone"> <br>
    <input type="radio" name="status" value="true"> Hoạt động<br>
    <input type="radio" name="status" value="false"> Không hoạt động<br>
    <button type="submit">ADD</button>
</form>
</body>
</html>
