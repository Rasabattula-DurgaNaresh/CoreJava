package com.durga.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * @created 16/03/2025 - 11:31
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
@ToString
public class Patient {
    long patientId = 0;
    private int seriousFactor = 0;
    public Patient(long id) {
        patientId = id;
    }
    public boolean isSerious(){
        return seriousFactor > 3;
    }

}
