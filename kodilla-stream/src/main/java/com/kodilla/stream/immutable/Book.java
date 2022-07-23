package com.kodilla.stream.immutable;

public class Book {

    private final String title;
    private final String author;
    private final int yearOfPublication;
    private final String id;

    public Book(final String title, final String author,
                final int yearOfPublication, String id) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }



}
