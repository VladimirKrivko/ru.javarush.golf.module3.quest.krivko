<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
    </head>

    <body>
        <div class="container">
            <div class="container" style="background: beige">
                <nav>
                    <ul class="nav nav-pills ui-corner-bottom-right justify-content-end">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Restart</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Statistic</a>
                        </li>
                    </ul>
                </nav>
                <h3 align="center" class="text-muted"><%= "Quest Game!" %></h3>
            </div>
            <div style="background: aliceblue">
                <div class="container">
                    <h1 class="container text-center">Квестик</h1> <br>
                    <p class="lead">Во время прохождения данного квеста тебе предстоит ответить на несколько очень сложных вопросов, но я уверен, ты справишься!</p>
                    <p class="lead">Кстати, как твое имя?</p>
<%--                <div class="form-group" style=""><input type="text" class="form-control"></div>--%>
<%--                    <input type="text" name="UserName" class="form-control form-control-lg" placeholder="Введите ваше имя">--%>
<%--                    <p><a class="btn btn-lg btn-success" onclick="location.href='/game'" role="button">Начать квест</a></p>--%>
                    <FORM action='/game.jsp'>
                        Name: <INPUT TYPE="TEXT" NAME="UserName"><BR><BR>
                        <CENTER> <INPUT TYPE="SUBMIT"> </CENTER>
                    </FORM>
                </div>
            </div>
        </div>

        <jsp:include page="footer.html"></jsp:include>
    </body>
</html>