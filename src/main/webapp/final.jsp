<%@ page import="ru.javarush.golf.quest.model.GameQuest" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="header.jsp"></jsp:include>
</head>

<body>

  <%
    GameQuest game = (GameQuest) session.getAttribute("game");
    String result = (String) request.getAttribute("result");
    String message;
    if (result.equals("win")) {
      message = game.getFinalWinMessage();
    } else {
      message = game.getFinalLostMessage();
    }
  %>


  <div>
    <div>
      <h1 align="center"><%=message%></h1>
    </div>
    <br>
    <div>
      <form method="get" action="/game-init">
        <CENTER><input type="submit" value="Сыграть еще раз?"></CENTER>
      </form>
    </div>

    <div class="container" align="left">
      <br><br>
      <jsp:include page="statistic.jsp"></jsp:include>
    </div>
  </div>
<jsp:include page="footer.html"></jsp:include>
</body>
</html>
