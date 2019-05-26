<%--
  Created by IntelliJ IDEA.
  User: Fox
  Date: 25.05.2019
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% if (request.getAttribute("id")!=null){
    System.out.println((request.getAttribute("id")));
    if((Integer)request.getAttribute("id")==1){%>
    <%@include file='typesForms/FirstForm.jsp'%>
    <%}
    if((Integer)request.getAttribute("id")==2){%>
    <%@include file='typesForms/SecondForm.jsp'%>
    <%}
    if((Integer)request.getAttribute("id")==3){%>
    <%@include file='typesForms/ThirdForm.jsp'%>
    <%}}%>
    <% if (request.getAttribute("end")!=null && request.getAttribute("end").equals("end"))
      {%>
    Тест завершен!!!
    <%}%>

</body>
</html>
