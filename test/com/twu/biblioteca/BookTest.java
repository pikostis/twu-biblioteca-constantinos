package com.twu.biblioteca;

import org.junit.Test;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;


public class BookTest {

    String bookAuthor = "Kent Beck";
    String bookTitle = "TDD by example";
    Date bookReleaseDate = new Date(1990,2,23);
    Book book = new Book(bookTitle, bookAuthor, bookReleaseDate);
    
    @Test
    public void shouldReturnBookAuthor() {
        assertEquals(book.getAuthor(), "Kent Beck");
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
        assertEquals(book.toString(), book.getBookTitle() + " | " + book.getAuthor() + " | " + book.getRealeaseDate());
    }

}
