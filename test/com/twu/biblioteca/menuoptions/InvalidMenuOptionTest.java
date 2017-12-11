package com.twu.biblioteca.menuoptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class InvalidMenuOptionTest {
    @Test
    public void name() {
        assertEquals(null, new InvalidMenuOption().name());
    }

}