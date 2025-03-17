package com.durga.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/*
 * @created 16/03/2025 - 11:28
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
@ToString
public class Movie {
    String name = null;
    boolean isClassic = false;
    String director = null;
    private List<Actor> actors = new ArrayList<Actor>();

    public Movie(String name, boolean isClassic) {
        setName(name);
        setClassic(isClassic);
    }

    public Movie(String name, boolean isClassic, String director) {
        setName(name);
        setClassic(isClassic);
        setDirector(director);
    }

    public Movie(String name, List<Actor> actors) {
        setName(name);
        setActors(actors);
    }

    public Movie(String name) {
        this.name = name;
    }
}
