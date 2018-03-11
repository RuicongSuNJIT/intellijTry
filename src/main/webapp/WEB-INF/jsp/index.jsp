<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>
<head>
    <title>欢迎</title>
</head>
<body>
<form action="login" method="post">
    <input type="text" name="username" placeholder="用户名"/>
    <input type="password" name="password" placeholder="密码"/>
    <input type="submit" value="登录">
</form>
<button onclick="toRegister()">注册</button>
</body>
<script type="text/javascript">
    function toRegister() {
        window.location = "register"
    }
</script>
</html>
