<%--
  Created by IntelliJ IDEA.
  User: sakura浮沉
  Date: 2018/8/2
  Time: 13:34
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
<h3>选择一份简历进行投递</h3>
<c:forEach items="${showUserResume}" var="resume">
    <tr >
        <td>${resume.urid}</td>
        <td>${rec.department.dname}</td>
        <td>${rec.rinformation}</td>
        <td>${rec.rrequirements}</td>
        <td>${rec.raddress}</td>
        <td>${rec.rsalary}</td>
        <td>${rec.rtime}</td>
        <td>${rec.rcount}</td>
        <td>
            <a href="chooseResume?id=${rec.bid}&currentPage=${currentPage}">确认投递</a>
        </td>
    </tr>
</c:forEach>
<

</body>
</html>
