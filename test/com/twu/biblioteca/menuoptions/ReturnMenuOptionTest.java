package com.twu.biblioteca.menuoptions;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnMenuOptionTest {

    @Test
    public void name() {
        assertEquals("Return Item", new ReturnMenuOption().name());
    }
}