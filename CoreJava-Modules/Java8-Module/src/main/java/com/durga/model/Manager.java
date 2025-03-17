package com.durga.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * @created 16/03/2025 - 11:24
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
@ToString
public class Manager {
    private String name = null;
    private Employee personalAssistant = null;

    public Manager() {
        personalAssistant = new Employee(99);
        setPersonalAssistant(personalAssistant);
    }

    public Manager(String name) {
        personalAssistant = new Employee(99);
        setPersonalAssistant(personalAssistant);
        setName(name);
    }
}
