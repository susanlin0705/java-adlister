<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 2019-08-21
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <form method="POST" action="login.jsp">
        <label for="username">Username</label>
        <input type="text" id="username" name="username">

        <br>

        <label for="password">Password</label>
        <input type="password" id="password" name="password">
        <button type="submit">Submit</button>
    </form>

<%--Using Expression Language--%>
    <c:if test="${param.username =='admin' && param.password=='password'}" >
        <%response.sendRedirect("/profile.jsp");%>
    </c:if>
    <c:if test="${param.username !='admin' && param.password!='password'}" >
        <p>PLEASE LOGIN</p>

    </c:if>


<%--Using java also need to handle with Null exception--%>

<%--    <%--%>
<%--        if (request.getParameter("username") != null && request.getParameter("password")!=null) {--%>
<%--            if (request.getParameter("username").equalsIgnoreCase("admin") &&request.getParameter("password").equalsIgnoreCase("password")) {--%>
<%--                response.sendRedirect("/profile.jsp");--%>
<%--            }else{--%>
<%--                response.getWriter().write("Please Login");--%>
<%--            }--%>
<%--        }--%>
<%--    %>--%>

