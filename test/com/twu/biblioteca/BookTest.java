package com.twu.biblioteca;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class BookTest {

    static String bookAuthor;
    static String bookTitle;
    static Date bookReleaseDate;
    static Book book;

    @BeforeClass
    public static void initialize() {
        System.out.println("creating a book...");

        bookAuthor = "Kent Beck";
        bookTitle = "TDD by example";
        bookReleaseDate = new Date(1990,2,23);

        book = new Book(bookTitle, bookAuthor, bookReleaseDate);
        book.setItemAvailableForCheckout(true);
    }

    @Test
    public void shouldReturnBookTitle() {
        assertEquals(book.getItemTitle(), bookTitle);
    }

    @Test
    public void shouldReturnTrueIfBookIsAvailableForCheckout() {
        assertTrue(book.isItemAvailableForCheckout());
    }

    @Test
    public void shouldReturnFalseIfBookIsNotAvailableForCheckout() {
        book.setItemAvailableForCheckout(false);
        assertFalse(book.isItemAvailableForCheckout());
        book.setItemAvailableForCheckout(true);
    }
}
