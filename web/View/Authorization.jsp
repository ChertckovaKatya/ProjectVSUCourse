<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Fox
  Date: 03.05.2019
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
</head>
<body>

<%

    try {
        List names = (List) request.getAttribute("userNames");
        if (!names.isEmpty()) {
            if (request.getAttribute("userName") != null) {
                out.println(" Пользователь '" + request.getAttribute("userName") + "' авторизован! ");
            } else {
                out.println("Неправильный логин или пароль");
            }
        }
    }
    catch (NullPointerException e){
        e.getMessage();
    }
%>
<div>
    <h1>Авторизация</h1>
</div>
    <form method="post">
        <label> Логин <input type="text" name="login"><br />
        </label>
        <br><br>
        <label> Пароль <input type="text" name="password"><br />
        </label>
        <br><br>
        <button type="submit"> Войти </button>
    </form>
    </body>
</html>
