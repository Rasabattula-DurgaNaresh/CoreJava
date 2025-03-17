package com.durga.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * @created 16/03/2025 - 11:32
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Setter
@Getter
@ToString
public class Student {

    private String name = null;
    private Teacher teacher = null;

    public boolean hasTeacher() {
        return teacher != null ? true : false;
    }
}
