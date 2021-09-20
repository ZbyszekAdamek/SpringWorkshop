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
    Isbn:
    <input type="text" name="isbn"><br/>
    Tytuł:
    <input type="text" name="title"><br/>
    Autor:
    <input type="text" name="author"><br/>
    Wydawca:
    <input type="text" name="publisher"><br/>
    Tekst:
    <input type="text" name="type"><br/>
    <input type="submit" value="Wyślij"><br/>
</form>

</body>
</html>
