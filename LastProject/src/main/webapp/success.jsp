<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/24
  Time: 11:11
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
        <a href="WEB-INF/pages/userLogin.jsp">登录</a><a href="WEB-INF/pages/userRegister.jsp">注册</a><br>
<table>
    <tr>
        <th>ID</th>
        <th>岗位</th>
        <th>部门</th>
        <th>相关信息</th>
        <th>要求</th>
        <th>上班地点</th>
        <th>薪资</th>
        <th>时间</th>
        <th>招聘人数</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${showRecByPageRecList}" var="rec">
        <tr >
            <td>${rec.rname}</td>
            <td>${rec.department.dname}</td>
            <td>${rec.rinformation}</td>
            <td>${rec.rrequirements}</td>
            <td>${rec.raddress}</td>
            <td>${rec.rsalary}</td>
            <td>${rec.rtime}</td>
            <td>${rec.rcount}</td>
            <td>
                <a href="sendResume?id=${rec.rid}&currentPage=${currentPage}">投递简历</a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>

