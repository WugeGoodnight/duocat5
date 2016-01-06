<%--
  Created by IntelliJ IDEA.
  User: wuhao
  Date: 16/1/5
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>DuoCat</title>
</head>
<body>
    <h2>
        All Forums In System
    </h2>

    <table border="1">
        <tr>
            <th>Fourm Id</th>
            <th>Fourm Name</th>
            <th>Forum ImgUrl</th>
            <th>Forum Intro</th>
            <th>Forum News</th>
        </tr>

        <c:forEach items="${fourms}" var="forum">
            <tr>
                <td>${forum.nId}</td>
                <td>${forum.strName}</td>
                <td>${forum.strImgURL}</td>
                <td>${forum.strIntro}</td>
                <td>${forum.nNews}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
