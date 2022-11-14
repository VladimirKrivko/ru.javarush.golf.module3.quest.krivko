package ru.javarush.golf.quest.controller;

import ru.javarush.golf.quest.model.GameQuest;
import ru.javarush.golf.quest.repository.RepositoryQuestion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "game", value = "/game")
public class GameServlet extends HttpServlet {
    GameQuest game = new GameQuest(new RepositoryQuestion());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession currentSession = request.getSession(true);
        GameQuest quest = new GameQuest(new RepositoryQuestion());

        request.getParameter("UserName");
        response.sendRedirect("/game.jsp");
    }

    private boolean isCorrectlyAnswer(HttpServletResponse response, HttpSession currentSession, String userAnswer) {
//        if (проверка ответа верна) {
//          currentSession.setAttribute("win", win);
//          resp.sendRedirect("/index.jsp");
//          return true;
//        }
        return false;
    }
}
