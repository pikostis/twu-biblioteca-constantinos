package com.twu.biblioteca;

import java.util.Date;
import java.util.Formatter;

public class Book implements ILibraryItem{
    private String bookAuthor;
    private Date bookReleaseDate;
    private String bookTitle;
    private boolean setItemAvailableForCheckout;

    public Book(String bookTitle, String bookAuthor, Date bookReleaseDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookReleaseDate = bookReleaseDate;
    }

    @Override
    public String toString() {
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        fmt.format("%-30.30s %-30.30s %-30.30s", bookTitle, "| " + bookAuthor, "| " + bookReleaseDate);
        return sbuf.toString();
    }

    @Override
    public boolean isItemAvailableForCheckout() {
        return setItemAvailableForCheckout;
    }

    @Override
    public void setItemAvailableForCheckout(boolean setItemAvailableForCheckout) {
        this.setItemAvailableForCheckout = setItemAvailableForCheckout;
    }

    @Override
    public String getItemTitle() {
        return bookTitle;
    }
}
