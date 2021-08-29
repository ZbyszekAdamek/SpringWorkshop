<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 28.08.2021
  Time: 08:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/books/form" method="post">
    <input type="text" name="isbn">
    <input type="text" name="title">
    <input type="text" name="author">
    <input type="text" name="publisher">
    <input type="text" name="type">
    <input type="submit" value="Wyślij">
</form>

</body>
</html>
