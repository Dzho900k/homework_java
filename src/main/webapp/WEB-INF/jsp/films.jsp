<%@ page import="com.academy.service.FilmService" %>
<%@ page import="com.academy.model.entity.Film" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Films</title>
</head>
<body>
<%
    FilmService filmService = new FilmService();
    List <Film> filmList = filmService.getFilm();
%>
<h3>List of films:</h3>
<%
    for (Film film: filmList) {
        out.println("Film -" + film.getTitle() + " - " + film.getYear() + " year");
%>
<br>
<%
    }
%>
</body>
</html>