<%--
  Created by IntelliJ IDEA.
  User: Fox
  Date: 25.05.2019
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Последняя компиляция и сжатый CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Дополнение к теме -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Последняя компиляция и сжатый JavaScript -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


    <title>Title</title>
</head>
<body>
        <header>
            <%--<div class="cxontainer-fluid">--%>
                <%--<%@include file='patterns/panel_index.jsp'%>--%>

            <%--</div>--%>
        </header>
        <%--<div class="container">--%>
            <%--<div class="row">--%>

                    <%--<%@include file='patterns/panel_index.jsp'%>--%>

            <%--</div>--%>
        <%--</div>--%>
        <div class="container">
            <div class="row">
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navber-collapse-1" aria-expanded="false">
                            <span class="sr-only"> Открыть навигацию </span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="collapse navbar-collapse" id="bs-example-navber-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a href="/test_page"> Главная </a></li>
                            <li><a href="#"> Новости </a></li>
                            <li><a href="#"> Галерея </a></li>
                            <li><a href="/testdemonstration"> Тест </a></li>
                        </ul>
                        <form method="post" action="" class="form-inline navbar-form navbar-right">
                            <div class="form-group">
                                <!-- <label for="inputlogin" class="sr-only"></label> -->
                                <input type="login" class="form-control" required="true" name="login" placeholder="Логин">
                            </div>
                            <div class="form-group">
                                <!-- <label for="inputpassword" class="sc-only"></label> -->
                                <input type="password" class="form-control"  required="true" name="password" placeholder="Пароль">
                            </div>
                            <!-- <button type="submit" class="btn btn-primary"><i class="fa fa-sign-in" > </i>Войти
                            </button> -->
                            <button type="btn btn-info"  class="btn btn-primary" data-target="#myModalBox"><i class="fa fa-sign-in" > </i>Войти
                            </button>
                            <!--  <button  class="btn btn-info" data-toggle="modal" data-target="#myModalBox">Войти
                             </button> -->
                        </form>
                    </div>
                </div>
            </nav>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-6">
                    <div class="row">
                        <div class="col-md-4">AAAA</div>
                        <div class="col-md-4">BBBB</div>
                        <div class="col-md-4">CCCC</div>
                        <div class="col-md-4">DDDD</div>
                    </div>
                </div>
            </div>
        </div>



        <%--<% if (request.getAttribute("result")!=null){--%>
            <%--System.out.println((request.getAttribute("result")));--%>
            <%--if(request.getAttribute("result").equals("Error")){%>--%>
        <%--<script>--%>
            <%--$("#myModalBox").modal();--%>
        <%--</script>--%>
        <%--<%}}%>--%>
</body>
</html>
