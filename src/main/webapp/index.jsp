<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Quest Game</title>

        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

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
                    <h1 class="display-3">Квестик</h1>
                    <p class="lead">Во время прохождения данного квеста тебе предстоит ответить на несколько очень сложных вопросов, но я уверен, ты справишься!</p>
                    <p class="lead">Кстати, как твое имя?</p>
<%--                <div class="form-group" style=""><input type="text" class="form-control"></div>--%>
<%--                    <input type="text" name="UserName" class="form-control form-control-lg" placeholder="Введите ваше имя">--%>
                    <FORM action='/game.jsp'>
                        Name: <INPUT TYPE="TEXT" NAME="UserName"><BR><BR>
                        <CENTER> <INPUT TYPE="SUBMIT"> </CENTER>
                    </FORM>
<%--                    <p><a class="btn btn-lg btn-success" onclick="location.href='/game'" role="button">Начать квест</a></p>--%>
                </div>
            </div>
        </div>

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous">
        </script>
    </body>
</html>