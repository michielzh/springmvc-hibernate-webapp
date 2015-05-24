<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://"
                + request.getServerName() + ":" + request.getServerPort()
                + path + "/";
%>

<!DOCTYPE html>
<html>
    <head>
        <base href="<%=basePath%>">
        <title>登录</title>
        <script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
        <script type="text/javascript" >
            $(function () {
                $("#loginBtn").click(function () {
                    var username = $("input[name=username]").val();
                    var password = $("input[name=password]").val();
                    var user = {
                        "uname": username,
                        "upassword": password
                    };
                    $.ajax({
                        type: "post",
                        dataType: "json",
                        data: user,
                        url: "user/login",
                        async: false,
                        success: function (data) {
                            if (false == data.loginResult) {
                                alert("用户名或者密码错误，请重新登录！");
                            } else if (true == data.loginResult) {
                                alert("登录成功！");
                            }
                        },
                        error: function () {
                            alert("服务器发生故障，请尝试重新登录！");
                        }
                    });
                });

            });

        </script>
    </head>

    <body>
        <div>
            UserName:<input type="text" name="username" /> <br/>
            PassWord:<input type="password" name="password" /><br/> 
            <input type="submit" id="loginBtn" value="Login" />
        </div>
    </body>
</html>
