package ru.javarush.golf.quest.controller;

import ru.javarush.golf.quest.model.GameQuest;
import ru.javarush.golf.quest.repository.RepositoryQuestion;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "GameInitServlet", value = "/game-init")
public class GameInitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");

        GameQuest game = new GameQuest(new RepositoryQuestion());
        game.resetIndexQuestion();

        HttpSession session = request.getSession(false);
        Integer countGame = (Integer) session.getAttribute("countGame");

        if(countGame == null){
            session.setAttribute("countGame", 1);
        } else {
            session.setAttribute("countGame", ++countGame);
        }

        session.setAttribute("game", game);
        try {
            response.sendRedirect("/game");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
