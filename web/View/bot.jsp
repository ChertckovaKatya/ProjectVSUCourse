<%--
  Created by IntelliJ IDEA.
  User: Fox
  Date: 06.05.2019
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cathedra.Bot</title>
</head>
<body>
<section>
    <h3>Cathedra.Bot info</h3>
    <jsp:useBean id="bot" scope="request" type="Cathedra.Bot"/>
    <tr>
        <td>ID: ${bot.id} | Name: ${bot.name} | Serial number: ${bot.serial}</td>
        <td><a href="bot?action=update">Update</a></td>
    </tr>
</section>
</body>
</html>