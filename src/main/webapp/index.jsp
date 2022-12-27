<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<jsp:include page="header.jsp"/>

<body>
    <div class="container" style="background: aliceblue">
        <h1 class="container text-center">Викторина!</h1> <br>
        <p class="lead" style="text-indent:25px;"> Во время прохождения данного квеста тебе предстоит ответить на несколько очень сложных
            вопросов, но я уверен, ты справишься!</p>
        <p class="lead">Кстати, как твое имя?</p>
        <form method="get" action="name-verify">
            Name: <input type="text" name="userName" placeholder="Введи свое имя"><BR><BR>
            <CENTER><input type="submit" value="Начать"></CENTER>
        </form>
    </div>

    <jsp:include page="footer.html"></jsp:include>

</body>
</html>