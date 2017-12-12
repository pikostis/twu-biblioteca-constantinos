package com.twu.biblioteca.menuoptions;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnBookMenuOptionTest {

    @Test
    public void name() {
        assertEquals("Return Book", new ReturnBookMenuOption().name());
    }
}