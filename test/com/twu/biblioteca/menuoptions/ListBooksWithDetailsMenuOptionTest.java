package com.twu.biblioteca.menuoptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListBooksWithDetailsMenuOptionTest {
    @Test
    public void name() throws Exception {
        assertEquals("List Books with Details", new ListBooksWithDetailsMenuOption().name());
    }

}