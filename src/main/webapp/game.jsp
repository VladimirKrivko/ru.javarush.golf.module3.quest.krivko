<%@ page import="ru.javarush.golf.quest.model.Question" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"></jsp:include>
</head>

<body>
<div>
    <div align="center">
        <%
            Question currentQuestion = (Question) session.getAttribute("currentQuestion");
            List<String> answers = currentQuestion.getAnswers();
            session.setAttribute("answers", answers);
        %>

        <h4>${currentQuestion.getTextQuestion()}</h4>
        <form method="GET" action="/answer-verify">
            <c:forEach items="${answers}" var="answer">
                <div class="funkyradio">
                    <div class="funkyradio-default">
                        <input type="radio" name="choice" id="radio" value="${answer}" checked />
                        <label for="radio">${answer}</label><br>
                    </div>
                </div>
            </c:forEach>
            <p align="center" colspan="2"><input type="submit" value="Ответить"/>
    </div>

    <div class="container" align="left">
        <br><br>
        <jsp:include page="statistic.jsp"></jsp:include>
    </div>
</div>

<jsp:include page="footer.html"></jsp:include>
</body>
</html>