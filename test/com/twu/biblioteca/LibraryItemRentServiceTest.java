package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryItemRentServiceTest {

    String bookAuthor;
    String bookTitle;
    Date bookReleaseDate;
    Book book;
    Book unavalableBook;
    LibraryItemRentService libraryItemRentService;

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

        libraryItemRentService = new LibraryItemRentService();
        libraryItemRentService.addLibraryItems(book);
        libraryItemRentService.addLibraryItems(unavalableBook);

    }

//    @Test
//    public void shouldReturnTrueIfBookIsAvailableForCheckout() {
//        String bookTitle = "TDD by example";
//        boolean isBookFound = libraryItemRentService.checkoutLibraryItem(bookTitle);
//        assertTrue(isBookFound);
//    }
//
//    @Test
//    public void shouldReturnFalseIfBookIsUnavailableForCheckout() {
//        String bookTitle = "TDD by example 2";
//        boolean isBookAvailableForCheckout = libraryItemRentService.checkoutLibraryItem(bookTitle);
//        assertFalse(isBookAvailableForCheckout);
//    }
//
//    @Test
//    public void shouldReturnTrueIfBookIsAvailableForReturn() {
//        String bookTitle = "TDD by example 2";
//        boolean isBookFound = libraryItemRentService.returnLibraryItem();
//        assertTrue(isBookFound);
//    }

}
