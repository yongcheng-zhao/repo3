<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有用户</h3>
<%--${listss}--%>
<table border="2">
    <c:forEach items="${list}" var="user" varStatus="vs">
        <tr>

            <td>
                <s:property value="#vs.index+1"/>
            </td>
            <td align = "center">${user.username}</td>
            <td align = "center">${user.PASSWORD}</td>
            <!-- 自定义标签 -->
        </tr>
    </c:forEach>
</table>
<input type="button" value="返回" onclick="javascript:window.location.href ='/index.jsp';">
</body>
</html>