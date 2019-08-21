<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 2019-08-21
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--different library--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%!int counter =0;%>
<%counter +=1;%>
<html>
<head>
    <%@include file="/partials/header.jsp"%>
</head>
<body>


    <h1>This is the first page</h1>
    <h2>The current count is <%=counter%> .</h2>
    <div class="alert alert-primary" role="alert">
        A simple primary alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
    </div>



    <%@ include file="/partials/script.jsp" %>


</body>
</html>

