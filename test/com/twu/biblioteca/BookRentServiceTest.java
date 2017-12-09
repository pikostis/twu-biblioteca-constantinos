package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

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
    public void shouldReturnTrueIfSuccessfullyCheckout() {
        boolean isBookSuccesfullyCheckedOut = bookRentService.checkout(book);
        assertTrue(isBookSuccesfullyCheckedOut);

        isBookSuccesfullyCheckedOut = bookRentService.checkout(book);
        assertFalse(isBookSuccesfullyCheckedOut);
    }

    @Test
    public void shouldReturnFalseIfUnsuccessfullyCheckout() {
        boolean isBookUnsuccesfullyCheckedOut = bookRentService.checkout(unavalableBook);
        assertFalse(isBookUnsuccesfullyCheckedOut);
    }

    @Test
    public void shouldReturnFalseIfNull() {
        boolean isBookNull = bookRentService.checkout(null);
        assertFalse(isBookNull);
    }

    @Test
    public void shouldReturnTrueIfSuccesfullyReturned() {
        bookRentService.checkout(book);
        boolean isBookSuccefullyReturned = bookRentService.returnBook(book);
        assertTrue(isBookSuccefullyReturned);

        isBookSuccefullyReturned = bookRentService.returnBook(unavalableBook);
        assertTrue(isBookSuccefullyReturned);
    }

    @Test
    public void shouldReturnFalseIfUnsuccesfullyReturned() {
        boolean isBookSuccefullyReturned = bookRentService.returnBook(null);
        assertFalse(isBookSuccefullyReturned);
    }
}
