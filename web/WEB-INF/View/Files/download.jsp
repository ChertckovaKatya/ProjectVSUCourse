<%--
  Created by IntelliJ IDEA.
  User: Fox
  Date: 12.05.2019
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Uploading Form</title>
</head>

<body>
<h3>Загрузка файла:</h3>
Выбрать файл : <br />
<form action = "UploadServlet" method = "post" enctype = "multipart/form-data">
    <input type = "file" name = "file" size = "50" />
    <br />
    <input type = "submit" value = "Загрузить файл" />
</form>
</body>
</html>
