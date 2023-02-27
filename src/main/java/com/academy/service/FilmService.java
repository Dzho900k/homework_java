package com.academy.service;

import com.academy.model.entity.Film;

import java.util.ArrayList;
import java.util.List;


public class FilmService {
    public List<Film> getFilm() {
        List<Film> films = new ArrayList<>();
        Film film1 = new Film("The Silence of the Lambs", 1991);
        Film film2 = new Film("The Green Mile", 1999);
        Film film3 = new Film("The Shawshank Redeption", 1994);

        films.add(film1);
        films.add(film2);
        films.add(film3);

        return films;
    }
}
