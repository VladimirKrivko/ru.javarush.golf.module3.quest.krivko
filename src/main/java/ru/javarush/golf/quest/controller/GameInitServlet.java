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
    private Integer countGame;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession(false);
        GameQuest game = null;
        game = new GameQuest(new RepositoryQuestion());
        game.resetIndexQuestion();

        if(countGame == null){
            countGame = 1;
        }
        session.setAttribute("countGame", countGame++);
        session.setAttribute("game", game);
        // TODO: подумать пощать ли в сессию данные о вопросе и пр. именно здесь или в game.jsp ?!
//        session.setAttribute("currentQuestion", game.getNextQuestion());
        try {
            response.sendRedirect("/game");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
