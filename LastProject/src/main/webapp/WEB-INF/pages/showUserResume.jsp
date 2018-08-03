<%--
  Created by IntelliJ IDEA.
  User: sakura浮沉
  Date: 2018/8/1
  Time: 0:47
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
<table>
    <tr>
        <th>ID</th>
        <th>名字</th>
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
                <a href="sendResume?id=${rec.bid}&currentPage=${currentPage}">投递简历</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
