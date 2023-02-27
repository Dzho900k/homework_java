package com.academy;


import com.academy.service.FilmService;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/films")
public class FilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        var filmService = new FilmService();

        var films = filmService.getFilm();

        req.setAttribute("films", films);

        req.getRequestDispatcher("/WEB-INF/jsp/films.jsp").forward(req, resp);
    }
}