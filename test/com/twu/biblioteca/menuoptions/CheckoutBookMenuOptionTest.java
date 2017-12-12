package com.twu.biblioteca.menuoptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckoutBookMenuOptionTest {
    @Test
    public void name() {
        assertEquals("Checkout Book", new CheckoutBookMenuOption().name());
    }

}