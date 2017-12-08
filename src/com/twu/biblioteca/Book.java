package com.twu.biblioteca;

import java.util.Date;

public class Book {
    private String bookAuthor;
    private Date bookReleaseDate;
    private String bookTitle;

    public void setBookAuthor (String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getAuthor() {
        return this.bookAuthor;
    }

    public void setReleaseDate(Date date) {
        this.bookReleaseDate = date;
    }

    public Date getRealeaseDate() {
        return this.bookReleaseDate;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + " | " + bookAuthor + " | " + bookReleaseDate;
    }
}
