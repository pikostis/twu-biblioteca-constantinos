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
        book.setBookAvailableForCheckout(true);

        bookAuthor = "Kent Beck 2";
        bookTitle = "TDD by example 2";
        bookReleaseDate = new Date(1990,2,23);

        unavalableBook = new Book(bookTitle, bookAuthor, bookReleaseDate);
        unavalableBook.setBookAvailableForCheckout(false);

        bookRentService = new BookRentService();
        bookRentService.addBooks(book);
        bookRentService.addBooks(unavalableBook);

    }

    @Test
    public void shouldReturnTrueIfBookIsAvailableForCheckout() {
        String bookTitle = "TDD by example";
        Set<Book> books = bookRentService.getBooks();
        boolean isBookFound = bookRentService.checkoutBook(books, bookTitle);
        assertTrue(isBookFound);
    }

    @Test
    public void shouldReturnFalseIfBookIsUnavailableForCheckout() {
        String bookTitle = "TDD by example 2";
        Set<Book> books = bookRentService.getBooks();
        boolean isBookAvailableForCheckout = bookRentService.checkoutBook(books, bookTitle);
        assertFalse(isBookAvailableForCheckout);
    }

    @Test
    public void shouldReturnTrueIfBookIsAvailableForReturn() {
        String bookTitle = "TDD by example 2";
        Set<Book> books = bookRentService.getBooks();
        boolean isBookFound = bookRentService.returnBook(books, bookTitle);
        assertTrue(isBookFound);
    }

}
