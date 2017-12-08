package com.twu.biblioteca;

import java.util.Date;

public class Book {
    private String bookAuthor;
    private Date bookReleaseDate;
    private String bookTitle;

    public Book(String bookTitle, String bookAuthor, Date bookReleaseDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookReleaseDate = bookReleaseDate;
    }

    public String getAuthor() {
        return this.bookAuthor;
    }

    public Date getRealeaseDate() {
        return this.bookReleaseDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + " | " + bookAuthor + " | " + bookReleaseDate;
    }
}
