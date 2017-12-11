package com.twu.biblioteca.menuoptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuitMenuOptionTest {
    @Test
    public void name() throws Exception {
        assertEquals("Quit", new QuitMenuOption().name());
    }

}