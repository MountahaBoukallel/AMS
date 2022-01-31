<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="src/main/webapp/WEB-INF/Login Page/assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="src/main/webapp/WEB-INF/Login Page/assets/css/styles.css">
</head>
<body>
<!-- Start: Login Form Clean -->
<section class="login-clean">
    <form method="post" action="<%=request.getContextPath()%>/login>">
        <img class="image" src="src/main/webapp/WEB-INF/Login Page/assets/img/logo_size.jpg">
        <div class="illustration"></div>
        <div class="mb-3">
            <input class="form-control" type="email" name="email" placeholder="Email">
        </div>
        <div class="mb-3">
            <input class="form-control" type="password" name="password" placeholder="Password">
        </div>
        <div class="mb-3">
            <button class="btn btn-primary d-block w-100" type="submit">Log In</button>
            <p class="login_err"><%=request.getAttribute("err") == null ?"" : request.getAttribute("err")%></p>
        </div>
        <a class="forgot" href="#">Forgot your password? <b>Click here</b></a>
    </form>
</section><!-- End: Login Form Clean -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
