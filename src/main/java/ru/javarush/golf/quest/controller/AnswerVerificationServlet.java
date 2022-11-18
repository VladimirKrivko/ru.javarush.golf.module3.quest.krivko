package ru.javarush.golf.quest.controller;

import ru.javarush.golf.quest.model.GameQuest;
import ru.javarush.golf.quest.model.Question;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AnswerVerificationServlet", value = "/answer-verify")
public class AnswerVerificationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession(false);
        GameQuest game = (GameQuest) session.getAttribute("game");
        Question currentQuestion = (Question) session.getAttribute("currentQuestion");

        String choice = request.getParameter("choice");

        try {
            if (currentQuestion.isCorrectly(choice)) {

                if (game.hasNextQuestion()) {
                    response.sendRedirect("/game");  // -переход затычка
                } else {
                    response.sendRedirect("/game-init");  // -переход затычка
                }
            } else {
                response.sendRedirect("/game-init");  // переход затычка
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
