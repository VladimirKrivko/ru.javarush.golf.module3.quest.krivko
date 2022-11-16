<%@ page import="ru.javarush.golf.quest.model.Question" %>
<%@ page import="ru.javarush.golf.quest.model.GameQuest" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--<jsp:useBean id="sessionState" scope="session" type="ru.javarush.golf.quest.model.GameQuest"/>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.html"></jsp:include>
</head>

<body>
<div>
    <div align="center">
        <%
            String textQuestion = (String) request.getAttribute("textQuestion");
            List<String> answers = (List<String>) request.getAttribute("answers");
            String correctlyAnswer = (String) request.getAttribute("correctlyAnswer");
        %>
        <%=textQuestion%>

        <form method="GET" action="test-servlet"> <%-- здесь после ответа на вопрос редирект --%>
        <div>
            <input type="radio" name="choice" value="1"> <%=answers.get(0)%> </input><br>
            <input type="radio" name="choice" value="2"> <%=answers.get(1)%></input><br>
            <input type="radio" name="choice" value="3"> <%=answers.get(2)%></input><br>
            <input type="radio" name="choice" value="4"> <%=correctlyAnswer%></input><br>

            <p align="center" colspan="2"><input type="submit" value="Ответить"/>
        </div>
        </form>

    </div>
    <br><br>
    <div>
        <jsp:include page="statistic.jsp"></jsp:include>
    </div>
</div>

<jsp:include page="footer.html"></jsp:include>
</body>
</html>