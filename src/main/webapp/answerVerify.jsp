<%@ page import="ru.javarush.golf.quest.model.GameQuest" %>
<%@ page import="ru.javarush.golf.quest.model.Question" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"></jsp:include>
</head>
<body>

<%


%>


<form method="GET" action="game.jsp">
    <div>
<%--        <p align="center"><%=finalMessage%></p>--%>
        <br><br>
        <p align="center" colspan="2"><input type="submit" value="Продолжить"/>
    </div>
</form>


<jsp:include page="footer.html"></jsp:include>
</body>
</html>
