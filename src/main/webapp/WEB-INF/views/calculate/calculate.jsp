<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 8/2/2024
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/cal" method="post">
    <input type="text" name="vnd" placeholder="VNĐ">
    <input type="text" name="rate" placeholder="RATE">
    <button type="submit">Convert</button>
</form>
</body>
</html>
