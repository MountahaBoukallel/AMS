<%@ page import="java.util.List" %>
<%@ page import="LoginPage.UserDAO" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 1/29/2022
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table</title>
    <!--links for the table-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container-lg">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-8">
                        <h2>Users Details</h2>
                    </div>
                    <div class="col-sm-4">
                        <button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add New</button>
                    </div>
                </div>
            </div>
            <table class="table table-bordered">
                <thead id="names">
                <tr class="Collection">
                    <th class="collection-item">Username</th>
                    <th class="collection-item">Password</th>
                    <th class="collection-item">Email</th>
                    <th class="collection-item">Display Name</th>
                    <th class="collection-item">Action</th>
                </tr>
                </thead>
                <tbody>
                <%
                    int i=1;
                    List<UserDAO> list = (List) request.getAttribute("list");

                %>
                <%
                    for (UserDAO user : list){
                %>
                <tr>
                    <td><%=i++%></td>
                    <td><%=user.getUsername()%></td>
                    <td><%=user.getPassword()%></td>
                    <td><%=user.getEmail()%></td>
                    <td><%=user.getDisplayName()%></td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
<!--For delete and add new content-->

</body>
</html>
