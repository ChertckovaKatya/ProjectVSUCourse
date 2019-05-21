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
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <title>File Uploading Form</title>
</head>

<body>
	<div class="container">
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
                      <li><a href="#"> Главная </a></li>
                      <li><a href="#"> Новости </a></li>
                      <li><a href="#"> Галерея </a></li>
                      <li><a href="/UploadServlet"> Создать тесты </a></li>
                    </ul>
                    <form action="" class="form-inline navbar-form navbar-right">
                      <button type="submit" onclick="location.href='/logout'"class="btn btn-default">Выйти</button>
                  </form>
                  </div>
                </div>
          </nav>       
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <div>
	<h3>Загрузка файла:</h3>
	Выбрать файл : <br />
		<form action = "UploadServlet" method = "post" enctype = "multipart/form-data">
    		<input type = "file" name = "file" size = "50" />
    		<br />
    		<input type = "submit" value = "Загрузить файл" />
		</form>
	</div>
</body>
</html>
