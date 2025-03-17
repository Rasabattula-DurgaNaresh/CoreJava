package com.durga.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

/*
 * @created 16/03/2025 - 11:32
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
public class Teacher {
    private String name = null;
    private Optional<Student> student = null;
    public Teacher(String name) {
        setName(name);
    }

}
