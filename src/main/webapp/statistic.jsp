<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title></title>--%>
<%--</head>--%>
<%--<body>--%>
    <div>
<%--        UserName: <%= session.getAttribute("UserName")%> <br> &lt;%&ndash; юзернейм из сессии&ndash;%&gt;--%>
<%--        UserName: <%= request.getParameter("UserName")%> <br>--%>
        UserName: <%= session.getAttribute("userName")%> <br>
        UserName: <%= request.getParameter("userName")%> <br>
        Server: <%= request.getServerName()%> <br>
        port: <%= request.getServerPort()%> <br>
        address: <%= request.getRemoteAddr()%> <br>
        host: <%= request.getRemoteHost()%> <br>
        Locale: <%= request.getLocale()%> <br>
        Request URI: <%= request.getRequestURI()%> <br>
        Request Protocol: <%= request.getProtocol()%> <br>
        Servlet path: <%= request.getServletPath()%> <br>
        Browser version <%= request.getHeader("User-Agent")%> <br>
    </div>
<%--</body>--%>
<%--</html>--%>
