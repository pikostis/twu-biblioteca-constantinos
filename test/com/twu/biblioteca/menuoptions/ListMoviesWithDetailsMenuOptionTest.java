package com.twu.biblioteca.menuoptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListMoviesWithDetailsMenuOptionTest {
    @Test
    public void name() throws Exception {
        ListMoviesWithDetailsMenuOption listMoviesWithDetailsMenuOption = new ListMoviesWithDetailsMenuOption();
        String menuName = listMoviesWithDetailsMenuOption.name();
        assertEquals(menuName, "List Movies with Details");
    }

}