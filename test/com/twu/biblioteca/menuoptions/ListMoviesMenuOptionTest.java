package com.twu.biblioteca.menuoptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListMoviesMenuOptionTest {
    @Test
    public void name() throws Exception {
        ListMoviesMenuOption listMoviesMenuOption = new ListMoviesMenuOption();
        String menuName = listMoviesMenuOption.name();
        assertEquals(menuName, "List Movies");
    }

}