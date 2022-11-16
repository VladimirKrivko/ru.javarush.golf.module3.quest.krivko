package ru.javarush.golf.quest.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NameVerificationServlet", value = "/name-verify")
public class NameVerificationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();

        String userName = request.getParameter("userName");
        String redirect = "test.jsp";
        if (userName!= null && !userName.isEmpty() && !userName.isBlank()) {
            redirect = "/test-servlet";
            session.setAttribute("userName", userName);
        }
        response.sendRedirect(redirect);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
