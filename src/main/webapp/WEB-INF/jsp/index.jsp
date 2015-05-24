<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
    <head>
        <base href="<%=basePath%>"/> 
        <title>登录成功</title>
    </head>
    <body>
        恭喜你，登录成功！
    </body>
</html>