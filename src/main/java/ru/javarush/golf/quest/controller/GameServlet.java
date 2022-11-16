package ru.javarush.golf.quest.controller;

import ru.javarush.golf.quest.model.GameQuest;
import ru.javarush.golf.quest.model.Question;
import ru.javarush.golf.quest.repository.RepositoryQuestion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "game", value = "/game")
public class GameServlet extends HttpServlet {
    GameQuest game;
    Question currentQuestion;

    @Override
    public void init() throws ServletException {
        game = new GameQuest(new RepositoryQuestion());
        currentQuestion = game.getNextQuestion();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession currentSession = request.getSession(true);
        GameQuest quest = new GameQuest(new RepositoryQuestion());

        String userName = request.getParameter("UserName");
        currentSession.setAttribute("UserName", userName);  //Внес имя пользователя в сессию

        getQuestion(response);
//        response.sendRedirect("/game.jsp");
        request.getRequestDispatcher("/game.jsp").forward(request, response);


//        request.setAttribute("counter", counter);
//        request.setAttribute("username", username);
//        request.setAttribute("idNextQuestion", nextQuestion + 1);
//        request.setAttribute("questionId", nextQuestion);
//        request.setAttribute("question", question.getQuestion());
//        request.setAttribute("answers", question.getAnswers());
//        request.setAttribute("whyfailure", question.getWhyFailure());
//        request.setAttribute("image", question.getPathToImage());
    }

    private void getQuestion(HttpServletResponse response) throws IOException {
        if (game.hasNextQuestion()) {
            currentQuestion = game.getNextQuestion();
        } else {
            response.sendRedirect("/final.jsp"); //?
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        String username = request.getParameter("username");
//        int counter = 0;
//        if (users.getUserMap().containsKey(username)) {
//            counter = users.getUser(username).getCountOfGamesPlayed();
//        } else {
//            users.update(username);
//        }
//
//        request.setAttribute("counter", counter);
//        request.setAttribute("username", username);
//        request.setAttribute("nextQuestion", 1);
//
//        request.getRequestDispatcher("/begin.jsp").forward(request, response);
    }

    private boolean isCorrectlyAnswer(HttpServletResponse response, HttpSession currentSession, String userAnswer) {
        if (Objects.nonNull(currentQuestion) && currentQuestion.isCorrectly(userAnswer)) {
//          currentSession.setAttribute("correct", win);
//          resp.sendRedirect("/index.jsp");
          return true;
        }
        return false;
    }


}
