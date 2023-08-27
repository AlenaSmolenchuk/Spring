package org.example.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Book {

    private int bookId;
    private int personId;

    @NotEmpty(message = "name should not be empty")
    private String name;

    @NotEmpty(message = "author should not be empty")
    private String author;

    @NotNull(message = "year shouldn't be null")
    private int year;

    public Book() {}

    public Book(int bookId, int personId, String name, String author, int year) {
        this.bookId = bookId;
        this.personId = personId;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
