package com.durga.util;

import com.durga.model.Actor;
import com.durga.model.Movie;

import java.util.ArrayList;
import java.util.List;

/*
 * @created 16/03/2025 - 11:55
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class MovieUtil {
    public static List<Movie> createMovies() {

        List<Movie> movies = new ArrayList<>();

        Movie movie = new Movie("Gods Must Be Crazy", false,"");
        movies.add(movie);
        movie = new Movie("Fiddler On The Roof", true, "");
        movies.add(movie);
        movie = new Movie("Sound of Music", true, "");
        movies.add(movie);
        movie = new Movie("Ben-Hur", true,"");
        movies.add(movie);
//		movie = new Movie("Jurassic Park", false,"Steven Spielberg");
//		movies.add(movie);
        movie = new Movie("Jurassic Park", false,"Steven Spielberg");
        movies.add(movie);
        movie = new Movie("ET", false,"Steven Spielberg");
        movies.add(movie);
        movie = new Movie("Saving Private Ryan", false,"Steven Spielberg");
        movies.add(movie);
        movie = new Movie("Catch Me If You Can", false,"Steven Spielberg");
        movies.add(movie);
        return movies;

    }

    public static List<Movie> createMoviesAndActors() {

        List<Movie> movies = new ArrayList<>();
        List<Actor> actors1 = new ArrayList<>();
        Actor actor = null;
        Movie movie = null;


        movie = new Movie("Sound Of Music");
        actor = new Actor("Julie Andrews");
        actors1.add(actor);
        actor = new Actor("Christopher Plummer");
        actors1.add(actor);
        movie.setActors(actors1);

        movies.add(movie);

        List<Actor> actors2 = new ArrayList<>();
        movie = new Movie("Jurassic Park");
        actor = new Actor("Sam Neil");
        actors2.add(actor);
        actor = new Actor("Jeff Goldblum");
        actors2.add(actor);
        movie.setActors(actors2);

        movies.add(movie);

        return movies;

    }
}
