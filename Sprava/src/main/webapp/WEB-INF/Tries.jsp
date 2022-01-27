<%@ page import="LoginPage.UserDAO" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 1/27/2022
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div> logged in as  </div><%=(User) session.getAttribute("CURRENT_USER")).getDisplayName()%>
</body>
</html>
