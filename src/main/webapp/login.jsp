<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 2019-08-21
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
</head>
<body>

    <form method="POST" action="/login.jsp">
        <label for="username">Username</label>
        <input type="text" id="username" name="username">

        <br>

        <label for="password">Password</label>
        <input type="password" id="password" name="password">
        <button type="submit">Submit</button>
    </form>
</body>
</html>



<%--Using Expression Language--%>
<%--    <c:if test="${param.username =='admin' && param.password=='password'}" >--%>
<%--        <%response.sendRedirect("/profile.jsp");%>--%>
<%--    </c:if>--%>
<%--    <c:if test="${param.username !='admin' && param.password!='password'}" >--%>
<%--        <p>PLEASE LOGIN</p>--%>

<%--    </c:if>--%>


<%--Using java also need to handle with Null exception--%>

    <%
        if (request.getParameter("username") != null && request.getParameter("password")!=null) {
            if (request.getParameter("username").equalsIgnoreCase("admin") &&request.getParameter("password").equalsIgnoreCase("password")) {
                response.sendRedirect("/profile.jsp");
            }else{
                response.getWriter().write("Please Login");
            }
        }
    %>

<%--walk through way--%>
<%--<%--%>
<%--    if (request.getMethod().equalsIgnoreCase("post")) {--%>
<%--        String username = request.getParameter("username");--%>
<%--        String password = request.getParameter("password");--%>
<%--        if (username.equalsIgnoreCase("admin") && password.equals("password")) {--%>
<%--            response.sendRedirect("/profile.jsp");--%>
<%--        }--%>
<%--    }--%>
<%--   --%>

<%--%>--%>
<%--this is servlets way--%>

<%--@WebServlet(name = "loginServlet" , urlPatterns = "/login" )--%>
<%--public class loginServlet extends HttpServlet {--%>
<%--@Override--%>
<%--protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {--%>
<%--req.getRequestDispatcher("login.jsp").forward(req, resp);--%>
<%--//        resp.sendRedirect("/login");--%>
<%--}--%>
<%--@Override--%>
<%--protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {--%>
<%--String username = req.getParameter("username");--%>
<%--String password = req.getParameter("password");--%>
<%--if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){--%>
<%--req.setAttribute("nameuser", username);--%>
<%--//            resp.sendRedirect("/profile");--%>
<%--req.getRequestDispatcher("profile.jsp").forward(req, resp);--%>
<%--} else {--%>
<%--req.getRequestDispatcher("login.jsp").forward(req, resp);--%>
<%--}--%>
<%--}--%>
<%--}--%>
