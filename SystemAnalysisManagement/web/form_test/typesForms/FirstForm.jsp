<%--
  Created by IntelliJ IDEA.
  User: Fox
  Date: 18.05.2019
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Вопрос первого типа</title>
</head>
<body>
<form action="testdemonstration?type=first" method="post">
    <jsp:useBean id="test" scope="request" type="cathedra.model.Test" />
    <c:forEach items="" var="">
    <p><b>${test.question}</b></p>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="answer" id="exampleRadios" value="${test}">
        <label class="form-check-label" for="exampleRadios">
            Первый вариант ответа
        </label>
    </div>
    </c:forEach>
    <button type="first"> Ответить</button>
</form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
