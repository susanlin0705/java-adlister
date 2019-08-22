<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 2019-08-22
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Here are all the products:</h1>

    <c:forEach var="lists" items="${adslist}">
        <div class="product">
            <h2>${lists.title}</h2>
            <p>Description:  ${lists.description}</p>
        </div>
    </c:forEach>
</body>
</html>
