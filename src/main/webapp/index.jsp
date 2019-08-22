<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    <title>Login Page</title>--%>
    <%@include file="/partials/header.jsp"%>
</head>

<body>
<%@include file="partials/navbar.jsp"%>
<%@ include file="/login.jsp" %>
<%@include file="partials/footer.jsp"%>
<%--<%@ include file="/profile.jsp" %>--%>
<%--    <c:if test="true">--%>
<%--        <h1>Variable names should be very descriptive</h1>--%>
<%--    </c:if>--%>
<%--    <c:if test="false"> jsp-and-jstl-exercise--%>
<%--        g--%>
<%--        <h1>single letter variable names are good</h1>--%>
<%--    </c:if>--%>

<h2>hello there, ${name}</h2>
</body>
</html>
