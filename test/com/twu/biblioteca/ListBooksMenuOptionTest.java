package com.twu.biblioteca;

import com.twu.biblioteca.menuoptions.ListBooksMenuOption;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class ListBooksMenuOptionTest {

    @Test
    public void shouldReturnAllBooks() {
        assertEquals("List Books", new ListBooksMenuOption().name());
    }
}
