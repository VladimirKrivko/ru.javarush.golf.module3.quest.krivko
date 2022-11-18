package ru.javarush.golf.quest.controller;

import ru.javarush.golf.quest.model.GameQuest;
import ru.javarush.golf.quest.model.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "game", value = "/game")
public class GameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession(false);

        GameQuest game = (GameQuest) session.getAttribute("game");

        session.removeAttribute("currentQuestion");

        game.chkIndexQuestion(game.getIndexQuestion());
        Question currentQuestion = game.getNextQuestion();

        session.setAttribute("currentQuestion", currentQuestion);
        response.sendRedirect("/game.jsp");
    }
}
