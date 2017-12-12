package com.twu.biblioteca;

import java.util.Date;
import java.util.Formatter;

public class Movie {
    private String movieName;
    private String movieDirector;
    private Date movieReleaseDate;
    private int rating;
    private boolean isMovieAvailableForCheckout;

    public Movie(String movieName, String movieDirector, Date movieReleaseDate, int rating) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieReleaseDate = movieReleaseDate;
        this.rating = rating;
    }

    public void setMovieAvailableForCheckout(boolean isMovieAvailableForCheckout) {
        this.isMovieAvailableForCheckout = isMovieAvailableForCheckout;
    }

    public Object getName() {
        return movieName;
    }
    
    @Override
    public String toString() {
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        fmt.format("%-30.30s %-30.30s %-30.30s %-30.30s", movieName, movieDirector, movieReleaseDate, rating);
        return sbuf.toString();
    }

    public boolean isMovieAvailableForCheckout() {
        return isMovieAvailableForCheckout;
    }
}
