<div>
    UserName: <%= session.getAttribute("userName")%> <br>
    Number of game: <%= session.getAttribute("countGame")%> <br>
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
