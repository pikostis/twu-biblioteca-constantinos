package com.twu.biblioteca;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class BookTest {

    @Test
    public void shouldReturnBookAuthor() {
        Book book = new Book("John");
        assertEquals(book.getAuthor(), "John");
    }

}
