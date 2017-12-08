package com.twu.biblioteca;

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;


public class BookTest {

    @Test
    public void shouldReturnBookAuthor() {
        Book book = new Book();
        book.setBookAuthor("John");
        assertEquals(book.getAuthor(), "John");
    }

    @Test
    public void shouldReturnBookReleaseDate() {
        Book book = new Book();
        book.setReleaseDate(new Date(1990,2,23));
        assertEquals(book.getRealeaseDate(), new Date(1990, 2, 23));
    }

    @Test
    public void shouldReturnBookTitle() {
        Book book = new Book();
        String bookTitle = "TDD Kent Beck";
        book.setBookTitle(bookTitle);
        assertEquals(book.getBookTitle(), bookTitle);
    }

    @Test
    public void shouldReturnStringRepresentationOfBook() {
        Book book = new Book();

        String bookTitle = "TDD by Example";
        book.setBookTitle(bookTitle);
        book.setReleaseDate(new Date(1990,2,23));
        book.setBookAuthor("Kent Beck");

        assertEquals(book.toString(), book.getBookTitle() + " | " + book.getAuthor() + " | " + book.getRealeaseDate());
    }

}
