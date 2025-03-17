package com.durga.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * @created 16/03/2025 - 11:18
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
@ToString
public class Book {
    private String isbn = null;
    private String title = null;
    private String author = null;

    public Book(String isbn) {
        setTitle("All About Lambdas");
        setAuthor("DurgaNaresh");
        setIsbn(isbn);
    }
}
