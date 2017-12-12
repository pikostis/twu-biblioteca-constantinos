package com.twu.biblioteca;

import org.junit.Before;

import java.util.Date;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryItemRentServiceTest {

    String bookAuthor;
    String bookTitle;
    Date bookReleaseDate;
    Book book;
    Book unavalableBook;
    LibraryRentService libraryRentService;

    @Before
    public void initialize() {
        System.out.println("creating a book service...");

        bookAuthor = "Kent Beck";
        bookTitle = "TDD by example";
        bookReleaseDate = new Date(1990,2,23);

        book = new Book(bookTitle, bookAuthor, bookReleaseDate);
        book.setItemAvailableForCheckout(true);

        bookAuthor = "Kent Beck 2";
        bookTitle = "TDD by example 2";
        bookReleaseDate = new Date(1990,2,23);

        unavalableBook = new Book(bookTitle, bookAuthor, bookReleaseDate);
        unavalableBook.setItemAvailableForCheckout(false);

        libraryRentService = new LibraryRentService();
        libraryRentService.addBooks(book);
        libraryRentService.addBooks(unavalableBook);

    }

//    @Test
//    public void shouldReturnTrueIfBookIsAvailableForCheckout() {
//        String bookTitle = "TDD by example";
//        boolean isBookFound = libraryRentService.checkoutBook(bookTitle);
//        assertTrue(isBookFound);
//    }
//
//    @Test
//    public void shouldReturnFalseIfBookIsUnavailableForCheckout() {
//        String bookTitle = "TDD by example 2";
//        boolean isBookAvailableForCheckout = libraryRentService.checkoutBook(bookTitle);
//        assertFalse(isBookAvailableForCheckout);
//    }
//
//    @Test
//    public void shouldReturnTrueIfBookIsAvailableForReturn() {
//        String bookTitle = "TDD by example 2";
//        boolean isBookFound = libraryRentService.returnBook();
//        assertTrue(isBookFound);
//    }

}
