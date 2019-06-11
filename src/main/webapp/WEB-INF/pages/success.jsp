<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/6/5
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
成功
<c:forEach items="${list}" var="account">
    ${account.id}${account.money}
</c:forEach>
</body>
</html>
