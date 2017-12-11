package com.twu.biblioteca.menuoptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListBooksMenuOptionTest {
    @Test
    public void name() {
        assertEquals("List Books", new ListBooksMenuOption().name());
    }

}