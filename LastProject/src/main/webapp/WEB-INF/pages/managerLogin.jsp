<%--
  Created by IntelliJ IDEA.
  User: sakura浮沉
  Date: 2018/7/31
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<form method="post" action="managerLogin">
    <div id="d2211"><h3 style="height:40px;margin-top:20px">用户密码登录</h3></div>
    <div>
        账号：<input type="text" name="mname" style="height:40px;width:200px "/>
    </div>
    <div>
        密码：<input type="password" name="mpass" style="height:40px;width:200px "/>
    </div>
    <div>
        <input type="submit" value="登录" style="background-color: orangered;height:40px;margin-top: 15px;width: 240px;margin-bottom: 15px"/>
    </div>
    <div style="text-align: right;margin-right: 30px">
                    <span style="color: red;float: left">
                        ${str}</span>
    </div>
</form>
</body>
</html>
