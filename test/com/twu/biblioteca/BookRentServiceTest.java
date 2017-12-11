package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookRentServiceTest {

    String bookAuthor;
    String bookTitle;
    Date bookReleaseDate;
    Book book;
    Book unavalableBook;
    BookRentService bookRentService;

    @Before
    public void initialize() {
        System.out.println("creating a book service...");

        bookAuthor = "Kent Beck";
        bookTitle = "TDD by example";
        bookReleaseDate = new Date(1990,2,23);

        book = new Book(bookTitle, bookAuthor, bookReleaseDate);

        bookAuthor = "Kent Beck 2";
        bookTitle = "TDD by example 2";
        bookReleaseDate = new Date(1990,2,23);

        unavalableBook = new Book(bookTitle, bookAuthor, bookReleaseDate);

        bookRentService = new BookRentService();
        bookRentService.addAvailableBook(book);
        bookRentService.addUnAvailableBook(unavalableBook);

    }

    @Test
    public void shouldReturnTrueIfBookIsAvailable() {
        boolean isBookAvailable = bookRentService.isBookAvailable(book);
        assertTrue(isBookAvailable);
    }

    @Test
    public void shouldReturnFalseIfBookIsUnavailable() {
        boolean isBookAvailable = bookRentService.isBookAvailable(unavalableBook);
        assertFalse(isBookAvailable);
    }

    @Test
    public void shouldPrintAllAvailableBooks() {
        //redundant
        bookRentService.listAvailableBooks();
    }

    @Test
    public void shouldReturnTrueIfBookIsAvailableForCheckout() {
        String bookName = "TDD by example";
        Set<Book> availableBooks = bookRentService.getAvailableBooks();
        boolean isBookFound = bookRentService.searchAvailableBooks(availableBooks, bookName);
        assertTrue(isBookFound);
    }

    @Test
    public void shouldReturnFalseIfBookIsUnavailableForCheckout() {
        String bookName = "TDD by example 2";
        Set<Book> availableBooks = bookRentService.getAvailableBooks();
        boolean isBookFound = bookRentService.searchAvailableBooks(availableBooks, bookName);
        assertFalse(isBookFound);
    }

    @Test
    public void shouldReturnTrueIfBookIsForReturn() {
        String bookName = "TDD by example 2";
        Set<Book> unAvailableBooks = bookRentService.getUnAvailableBooks();
        boolean isBookFound = bookRentService.searchUnavailableBooks(unAvailableBooks, bookName);
        assertTrue(isBookFound);
    }

}
