package ru.javarush.golf.quest.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "NameVerificationServlet", value = "/name-verify")
public class NameVerificationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userName");
        String redirect = "index.jsp";

        if (userName == null) {
            userName = request.getParameter("userName");
        }

        try {
            if (userName == null || userName.isEmpty() || userName.isBlank()) {
                request.getRequestDispatcher(redirect).forward(request, response);
            } else {
                redirect = "/game-init";
                session.setAttribute("userName", userName);

                String contextPath = request.getContextPath();
                response.sendRedirect(response.encodeRedirectURL(contextPath + redirect) );
            }
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
}
