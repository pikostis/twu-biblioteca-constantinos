package com.twu.biblioteca;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;


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
    }

    @Test
    public void shouldReturnBookAuthor() {
        assertEquals(book.getAuthor(), bookAuthor);
    }

    @Test
    public void shouldReturnBookReleaseDate() {
        assertEquals(book.getRealeaseDate(), new Date(1990, 2, 23));
    }

    @Test
    public void shouldReturnBookTitle() {
        assertEquals(book.getBookTitle(), bookTitle);
    }

    @Test
    public void shouldReturnStringRepresentationOfBook() {
        assertEquals(book.toString(), book.getBookTitle() + "\t|\t" + book.getAuthor() + "\t|\t" + book.getRealeaseDate());
    }

}
