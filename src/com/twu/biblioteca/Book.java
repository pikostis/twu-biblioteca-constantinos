package com.twu.biblioteca;

import java.util.Date;
import java.util.Formatter;

public class Book {
    private String bookAuthor;
    private Date bookReleaseDate;
    private String bookTitle;
    private boolean isBookAvailableForCheckout;

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
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        fmt.format("%-30.30s %-30.30s %-30.30s", getBookTitle(), getAuthor(), getRealeaseDate());
        return sbuf.toString();
    }

    public boolean isBookAvailableForCheckout() {
        return isBookAvailableForCheckout;
    }

    public void setBookAvailableForCheckout(boolean bookAvailableForCheckout) {
        isBookAvailableForCheckout = bookAvailableForCheckout;
    }
}
