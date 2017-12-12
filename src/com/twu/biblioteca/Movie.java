package com.twu.biblioteca;

import java.util.Date;
import java.util.Formatter;

public class Movie implements ILibraryItem {
    private String movieName;
    private String movieDirector;
    private Date movieReleaseDate;
    private int rating;
    private boolean isItemAvailableForCheckout;

    public Movie(String movieName, String movieDirector, Date movieReleaseDate, int rating) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieReleaseDate = movieReleaseDate;
        this.rating = rating;
    }

    @Override
    public String toString() {
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        fmt.format("%-30.30s %-30.30s %-30.30s %-30.30s", movieName, "| " + movieDirector, "| " + movieReleaseDate, "| " + rating);
        return sbuf.toString();
    }

    @Override
    public boolean isItemAvailableForCheckout() {
        return isItemAvailableForCheckout;
    }

    @Override
    public void setItemAvailableForCheckout(boolean isItemAvailableForCheckout) {
        this.isItemAvailableForCheckout = isItemAvailableForCheckout;
    }

    @Override
    public String getItemTitle() {
        return movieName;
    }
}