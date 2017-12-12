package com.twu.biblioteca;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MovieTest {

    static String movieDirector;
    static String movieName;
    static Date movieReleaseDate;
    static Movie movie;
    static int rating;

    @BeforeClass
    public static void initialize() {
        System.out.println("creating a movie...");

        movieName = "Movie 1";
        movieDirector = "John Appleseed";
        movieReleaseDate = new Date(1990,2,23);
        rating = 7;

        movie = new Movie(movieName, movieDirector, movieReleaseDate, rating);
        movie.setMovieAvailableForCheckout(true);
    }

    @Test
    public void shouldReturnMovieName() {
        assertEquals(movieName, movie.getName());
    }

    @Test
    public void shouldReturnMovieDetails() {
        assertEquals(movieName + " " + movieDirector + " " + movieReleaseDate + " " + rating, movie.toString());
    }

    @Test
    public void shouldReturnTrueIfMovieIsAvailableForCheckout() {
        assertTrue(movie.isMovieAvailableForCheckout());
    }

}
